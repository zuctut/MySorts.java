import java.util.ArrayList;
public class BogoSort {

 public static ArrayList populate( int size, int lo, int hi ) {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }

    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) {
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
	
    public static boolean isSorted(ArrayList<Comparable> a) {
	for( int i = 1; i < a.size(); i++ ) {
	if( a.get( i - 1 ).compareTo( a.get(i)) == 1 ) {
	return false;
	}
	}
	return true;
	}

	
    public static void bogo(ArrayList<Comparable> a){
	while (!(isSorted(a))){
		System.out.println(a);
		shuffle(a);
	}}

 public static void main(String [] args){
	ArrayList glen = new ArrayList<Integer>();
	glen.add(7);
	glen.add(1);
	glen.add(5);
	glen.add(12);
	glen.add(3);
	glen.add(6);
	glen.add(8);
	glen.add(2);
	glen.add(18);
	glen.add(0);
	System.out.println( "ArrayList glen before sorting:\n" + glen );
	bogo(glen);
	System.out.println( "ArrayList glen after sorting:\n" + glen );
}}

