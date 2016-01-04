import java.util.ArrayList;
public class MySorts{


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


  public static void selectionSortV( ArrayList<Comparable> data ) {
    	for (int i = 0; i<data.size()-1; i++){
    		int index = i;
         	for (int j=i+1; j<data.size(); j++)
         		if (data.get(j).compareTo(data.get(index)) < 0) {index = j;}
         	Comparable x = data.get(index);
         	data.set(index, data.get(i));
         	data.set(i, x);
         	}}
public static void main( String [] args ) {
	ArrayList glen = new ArrayList<Integer>();
	  glen.add(7);
	  glen.add(1);
	  glen.add(5);
	  glen.add(12);
	  glen.add(3);
	  System.out.println( "ArrayList glen before sorting:\n" + glen );
	  selectionSortV(glen);
	  System.out.println( "ArrayList glen after sorting:\n" + glen );

ArrayList zuc = new ArrayList<Integer>();
	  zuc.add(7);
	  zuc.add(1);
	  zuc.add(5);
	  zuc.add(12);
	  zuc.add(3);
	  System.out.println( "ArrayList zuc before sorting:\n" + zuc );
	  bubbleSortV(zuc);
	  System.out.println( "ArrayList zuc after sorting:\n" + zuc );

ArrayList has = new ArrayList<Integer>();
	  has.add(7);
	  has.add(1);
	  has.add(5);
	  has.add(12);
	  has.add(3);
	  System.out.println( "ArrayList has before sorting:\n" + has );
	  bogo(has);
	  System.out.println( "ArrayList zuc after sorting:\n" + has );





}}
