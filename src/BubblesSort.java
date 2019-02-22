
public class BubblesSort extends BubbleSort{
	
	public BubblesSort(int[]l, String name) {
		super(l, name);

}

private boolean bubbleIt(int end) {
	
	boolean didSwap = false;
	
	for (int i= 0; i<end; i++) {
        
            if (super.getElement(i) > super.getElement(i+1)) {
            	
            	super.Swap(i, i+1);
            	
            	didSwap = true;
            }
        }
	return didSwap;
}


@Override
public void executeAlgorithm() {
	// TODO Auto-generated method stub
	
	boolean notDone = true;
	int bubbleEnd = getList().length-1;
	
	do {
		notDone = bubbleIt(bubbleEnd);
		
		if(notDone) {
			bubbleEnd = -1;
		}
		
	//System.out.println(this);	
	} while(notDone && bubbleEnd >= 1);
	
	
	bubbleIt(super.getList().length-1);
	bubbleIt(super.getList().length-2);
	bubbleIt(super.getList().length-3);
}

	}
