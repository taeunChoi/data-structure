package circular;

public class CircularLinkedList {

	private Node tail;
	
	public CircularLinkedList(){
		this.tail = null;
	}
	
	//TODO 삽입 삭제 검색 출력 
	public void insertFirstNode(String data){
		
		Node newNode = new Node(data);
		
		if(tail == null){
			tail = newNode;
			newNode.link = tail;
			return;
		}
		newNode.link = tail.link;
		tail.link = newNode;
	}
	
	public void insertMiddleNode(String data, String preData){
		
		Node newNode = new Node(data);
		
		if(tail == null){
			tail = newNode;
			newNode.link = tail;
		}
		
		Node node = searchNode(preData);
		newNode.link = node.link;
		node.link = newNode;
	}
	
	public void insertLastNode(String data){
		
		Node newNode = new Node(data);
		if(tail == null){
			tail = newNode;
			newNode.link = newNode;
		}
		
		newNode.link = tail.link;
		tail.link = newNode;
		tail = newNode;
	}
	
	public void deleteNode(String data){
		Node preNode = searchPreNode(data);
		if(preNode.link == tail){
			tail = preNode;
		}
		preNode.link = preNode.link.link;
	}
	
	public Node searchNode(String data){

		if(tail == null){
			return null;
		}
		
		Node pointer = tail;
		while(pointer.link != tail){
			if(pointer.data.equals(data)){
				return pointer;
			}
			pointer = pointer.link;
		}
		
		return null;
	}
	public Node searchPreNode(String data){
		
		if(tail == null){
			return null;
		}
		
		Node pointer = tail;
		Node prePointer = null;
		
		while(pointer.link != tail){
			pointer = pointer.link;
			if(pointer.link == tail){
				prePointer = pointer;
			}
		}
		
		pointer = tail;
		while(pointer.link != tail){
			if(pointer.data.equals(data)){
				return prePointer;
			}
			prePointer = pointer;
			pointer = pointer.link;
		}
		return null;
	}
	
	
	
	@Override
	public String toString(){
		
		if(tail==null){
			return "-";
		}
		
		StringBuilder sb = new StringBuilder();
		
		Node pointer = tail.link;
	
		if(pointer.link == pointer){
			sb.append(pointer.data+" ");
			return sb.toString();
		}
		
		while(true){
			sb.append(pointer.data + " ");
			pointer = pointer.link;
			
			if(pointer == tail){
				sb.append(pointer.data + " ");
				break;
			}
			
		}
		
		return sb.toString();
	}
	
	
	private class Node{
		String data;
		Node link;
		
		Node(){
			this.data = null;
			this.link = null;
		}
		Node(String data){
			this.data = data;
			this.link = null;
		}
	}
}
