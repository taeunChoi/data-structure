package sequential;

public class SequentialArray {

	private Integer[] SequentialArray;
	private int tailIndex;
	
	public SequentialArray(Integer[] SequentialArray, int tailIndex){
		this.SequentialArray = SequentialArray;
		this.tailIndex = tailIndex;
	}
	
	public void insertValueByIndex(int index, int value){

		int moveCount = SequentialArray.length -1 - index;
		for(int i=0; i < moveCount ; i++){
			SequentialArray[tailIndex-i+1] = SequentialArray[tailIndex-i];
		}
		SequentialArray[index] = value;
		tailIndex++;
	}
	
	public void deleteValueByIndex(int index){
		
		int moveCount = SequentialArray.length- index -1;
		for(int i=0; i < moveCount; i++){
			SequentialArray[index+i] = SequentialArray[index+i+1];
		}
		
		tailIndex--;
		for(int i=tailIndex+1; i<SequentialArray.length; i++){
			SequentialArray[i] = null;
		}
		
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i < SequentialArray.length; i++){
			if(SequentialArray[i]==null){
				sb.append("*");
			}else{
				sb.append(SequentialArray[i]);
			}
			sb.append(" ");
		}
		return sb.toString();
	}
	
	
	
	
}
