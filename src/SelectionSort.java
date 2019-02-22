public class SelectionSort extends BubbleSort{

	
	
	public SelectionSort(int [] l, String name) {
		super(l, name);
		//System.out.println("Selection Sort with Hierachy");
	}
	

	
	
	public void executeAlgorithm() {
		
		
		
		for(int j = 0; j< super.getList().length-1 ; j++) {
			
			
			int biggest = super.getElement(0) ;
			int bigLoc = 0;
			
		
			
			for (int i=0; i< super.getList().length- j; i++) {
				
				if (biggest< super.getElement(i)) {
					biggest = super.getElement(i);
					bigLoc = i;
				}
				
			
			}

			super.Swap(bigLoc, super.getList().length-1-j);
				
		}
					
	}
			
}
	
	

		
	
	
	


