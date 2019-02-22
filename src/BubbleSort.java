import java.util.Arrays;


public abstract class BubbleSort {
	
	private int [] myList;
	private String whichSort;
	
	public BubbleSort(int [] l, String sortName) {
			myList = l;
			whichSort = sortName;
	}
	
	
	public void Swap (int place1, int place2) {
		int temp = myList[place2];
		myList[place2] = myList[place1];
		myList[place1]= temp;
		
	}
	
	
	public String toString() {
		String s = "";
		s+= whichSort + ":";
		s+= Arrays.toString(myList);
		return s;
	}
	
	public int[] getList() {
		return myList;
	}
	
	public int getElement(int which) {
		return myList[which];
	}
	
	public void setElement(int whichE, int value) {
		myList[whichE]= value;
	}
	
	public int getLength() {
		return myList.length;
	}
	
	public abstract void executeAlgorithm();
	
	public String getSortName() {
		return whichSort;
	}
	

}
