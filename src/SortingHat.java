import java.util.Arrays;

public class SortingHat {

	public static void main(String[] args) {
		
		
	
	int howMany= 10000;
	int numList[] = getRandom(howMany);
	
	
	MergeSortRecursive rms = new MergeSortRecursive(numList, "Recursive MS");
	
//	System.out.println("Before Merge list is: ");
	//System.out.println(Arrays.toString(numList));
	
	
	
	//MergeSortNR ms = new MergeSortNR(numList, "MS Non-Recursive");
	
	doTiming(rms);
	lListCheckAsc(numList);
	
	//System.out.println("After Merge list is: ");
	//System.out.println(Arrays.toString(numList));
	
	
	
	

	
	
	
	
	
//		// TODO Auto-generated method stub
		
//		int howMany = 15;
		
		int [] nums = getRandom(howMany);
		int [ ] nums0 = getAscendingOrder(howMany);
		int [ ] nums1 = getDescendingOrder(howMany);
		int [ ] nums2 = getRandom(howMany);
//		
//		
//		InsertionSort inS = new InsertionSort(nums0, "Insertion Sort Best");
//		System.out.println(inS);
//		doTiming(inS);
//		System.out.println();
//		InsertionSort inSW = new InsertionSort(nums1, "Insertion Sort Worst");
//		System.out.println(inSW);
//		doTiming(inS);
//		
//		
//	
		
		//System.out.println(Arrays.toString(nums0));
		//System.out.println(Arrays.toString(nums1));

//	
		

		SelectionSort sSort = new SelectionSort(nums0, "Selection Sort");
		
		doTiming(sSort);
		//System.out.println(sSort);
		
		//BubblesSort bSort = new BubblesSort(nums1, "Bubbles Sort");
		
		//doTiming(bSort);
		//System.out.println(bSort);
		
	}
		
		
//		sSort.executeAlgorithm();
		
	public static void doTiming(BubbleSort s) {
		
		
		long start = System.currentTimeMillis();
		long start2 = System.nanoTime();
		
		s.executeAlgorithm();
//		
		
		long end = System.currentTimeMillis();
		long end2 = System.nanoTime();
		
		long theTime = end-start;
		long theTime2 = end2- start2;
		
	
		
	
		if (s.getLength() >= 100) {
			System.out.println("Time for sort on " + s.getSortName() + " on " +
					s.getLength() + " numbers is: " + theTime2+ 
					" (nano)seconds");
			
		} else {
			System.out.println("Time for " + s.getSortName() +"sort on " + s.getLength() + " numbers is: " + (double)theTime/1000+ 
					"seconds");
			
		}
	
	}
	
		
		
	
		
//		
//
//	
//	
//		
	
	public static int [ ] getRandom (int n) {
		int [ ] nList = new int [n];
		
		for(int i=0; i< nList.length; i++ ) {
			nList[i] = (int)(Math.random()* 1000);
		}
			
		
		return nList;
	}
	

	

	public static int [] getDescendingOrder(int n){
		
		int[] nList = new int[n];
		
		
		
		for(int i= nList.length; i>0;i-- ) {
			nList[nList.length-i] = i;
			
			
		}
		
		return nList;
		
	}
	
public static int [] getAscendingOrder(int n){
		
		int[] nList = new int[n];
		
		for(int i=0; i< nList.length;  i++ ) {
			nList[i] = i+1;
		}
		
		return nList;
		
	}

public static void lListCheckAsc(int [] l) {
	for(int i=0;i<l.length-1;i++) {
		if(l[i]>l[i+1]) {
		System.out.println(" Sorting is incorrect");
	}else {
		System.out.println(" Sorting is correct");
	}
	}
}
}



