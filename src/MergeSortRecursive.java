
public class MergeSortRecursive extends BubbleSort{
	
	public MergeSortRecursive(int[] l, String sortName) {
		super(l, sortName);
		// TODO Auto-generated constructor stub
	}



	
	
	@Override
	public void executeAlgorithm() {
		// TODO Auto-generated method stub
		
		mergeSort(0,this.getLength() -1);
		
	}
	
	private void mergeSort(int lStart, int lEnd) {
		
		int listLen = lEnd -lStart +1 ;
		//System.out.println("in MergeSort list len is" + listLen);
		//System.out.println("in MergeSort list start and end are " + lStart + ", " + lEnd);
		
		if(listLen > 1) {
			mergeSort(lStart, lStart + (listLen/2)-1);
			mergeSort(lStart + (listLen/2), lEnd);
			
			merge(lStart, lStart+(listLen/2) -1, lStart + (listLen/2), lEnd);
		
	}
	
		/*
		for(int i=0;i< this.getLength()-1;i++,i+=2) {
		merge(i,i,i+1,i+1);
	}
	*/
		
	/*
	for(int j =1, e=0;Math.pow(2.0,(double)(e)) <= this.getLength();j*=2,e++) {
		for(int i=0;i< this.getLength()-1;i+= j*2) {
			if(i+(j*2)-1 < this.getLength()) {
				merge(i,i+j-1,i+j,i+(j*2)-1);
			} else {
				merge(i,i+j-1,i+j,this.getLength()-1);
			}
			
			
		}
	}
	*/
		
	}

		
	
	
	 private void merge(int start1, int end1, int start2,int end2) {
		int l1 = start1;
		int l2 = start2;
		int[] temp = new int[(end1-start1 +1) + (end2-start2 +1)];
		int tPointer= 0;
		
		while(l1 <= end1 && l2 <=end2) {
			if(this.getElement(l1) <= this.getElement(l2)) {
				temp[tPointer] = this.getElement(l1);
				l1++;
				
			}else {
				temp[tPointer]= this.getElement(l2);
				l2++;
			}
			tPointer++;
			
		}
	 
	 
	 for(int tp = tPointer;tp< temp.length;tp++) {
		 if(l1<= end1) {
			 temp[tp]= this.getElement(l1);
			 l1++;
			 
		 } else {
			 temp[tp]=this.getElement(l2);
			l2++;
		 }
	 }
		
		
		
		
		
	 for(int i = start1, t=0;i<= end2; i++,t++) {
		 this.setElement(i, temp[t]);
	}
	 }

	
	

}



