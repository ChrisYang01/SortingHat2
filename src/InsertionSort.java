
public class InsertionSort extends BubbleSort {
	public InsertionSort(int [] l, String sortName) {
		super(l, sortName);
	}

	@Override
	public void executeAlgorithm() {
		// TODO Auto-generated method stub
		
		for(int i = 1; i < this.getLength(); i++) {
			int j = i;
			while( j> 0 && this.getElement(j) > this.getElement(j-1)) {
				Swap(j,j-1);
				j--;
				System.out.println(this);
			}
			
		}
		
	}
	


}
