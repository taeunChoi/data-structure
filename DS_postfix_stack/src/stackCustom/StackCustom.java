package stackCustom;

import stack.*;
//TODO 상속.. 어렵다....ㅠ
public class StackCustom<T> extends Stack{

	NodeCustom top;
	
	public StackCustom(){
		super();
	}
	
	public Integer pop() throws MemoryException{
		if(isEmpty()){
			throw new MemoryException("under flow");
		}
		Integer data = top.getData();
		top = top.link;
		return data;
	}
	
	
	private class NodeCustom extends Node{

		Integer data;
		StackCustom<T>.NodeCustom link;
		
		NodeCustom(){
			super();
		}
		private Integer getData(){
			return this.data;
		}
		private void setData(Integer data){
			this.data = data;
		}
	}
	
	
	
}
