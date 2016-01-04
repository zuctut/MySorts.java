/*
Zuhra Tukhtamisheva
APCS1 pd5
HW51 -- Dat Bubbly Tho
2015-12-21


======================================
  class BubbleSort -- implements bubblesort algorithm (vanilla version)
  ======================================*/

import java.util.ArrayList;

public class BubbleSort {

    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) 
    {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }


    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) 
    {
	int randomIndex;
	//setup for traversal fr right to left
        for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ) );
        }
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // VOID version of bubbleSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void bubbleSortV( ArrayList<Comparable> data ) {
       for (int i = 0; i<data.size(); i++){
    	for (int j = 0; j < data.size()-1; j++ ){
    		if ((data.get(j)).compareTo(data.get(j+1)) > 0){
            Comparable x = data.get(j);
            data.set(j, data.get(j+1));
            data.set(j+1, x);
         System.out.println(data);}
         else{
            data = data;
            System.out.println(data);
         }}}
    }

    //end bubbleSortV -- O(?)

    // ArrayList-returning bubbleSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
    {
    	ArrayList<Comparable> rt = new ArrayList();
    	for (Comparable a : input) {
    		rt.add(a);
}
    	return rt;
    }//end bubbleSort -- O(?)


    public static void main(String [] args){

	
	ArrayList glen = new ArrayList<Integer>();
	glen.add(7);
	glen.add(1);
	glen.add(5);
	glen.add(12);
	glen.add(3);
	System.out.println( "ArrayList glen before sorting:\n" + glen );
	bubbleSortV(glen);
	System.out.println( "ArrayList glen after sorting:\n" + glen );

	ArrayList coco = populate( 10, 1, 1000 );
	System.out.println( "ArrayList coco before sorting:\n" + coco );
	bubbleSortV(coco);
       System.out.println( "ArrayList coco after sorting:\n" + coco );}}