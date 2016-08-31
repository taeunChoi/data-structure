package linked;

public class LinkedList {
	
	private Node head;
	
	public LinkedList(){
		this.head = null;
	}
	
	//TODO 삽입 삭제 검색 출력
	public void insertFirstNode(String data){
		
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			return;
		}
		newNode.link = head;
		head = newNode;
	}
	
	public void insertMiddleNode(String data, Node preNode){
		
		Node newNode = new Node(data);
		
		if(head == null){
			head = newNode;
			return;
		}
		newNode.link = preNode.link;
		preNode.link = newNode;
		
	}
	
	public void insertLastNode(String data){
		
		Node newNode = new Node(data);
		
		if(head == null){
			head = newNode;
			return;
		}
		
		Node pointer = head;
		while(pointer.link != null){
			pointer = pointer.link;
		}
		pointer.link = newNode;
	}
	
	public void deleteNode(String data){
		
		Node preNode = searchNodesPrePointer(data);
		if(preNode==null){ //찾는데이터가 없을경우, 
			return; 
		}
		
		if(preNode.link.link==null){ //찾은데이터 노드가 마지막인경우
			preNode.link = null;
			return;
		}
		
		if(preNode != null){ //찾은데이터 노드가 중간에있는경우
			preNode.link = preNode.link.link;
			return;
		}
	}
	
	public Node searchNodesPrePointer(String data){
		
		if(head == null){ 
			return null;
		}
		
		Node pointer = head;
		Node prePointer = pointer;
		while(pointer.link != null){
			if(pointer.data.equals(data)){
				return prePointer;
			}
			prePointer = pointer;
			pointer = pointer.link;
		}
		return null;
	}
	
	public Node searchNode(String data){
		
		if(head == null){
			return null;
		}
		
		Node pointer = head;
		while(pointer != null){
			if(pointer.data.equals(data)){
				return pointer;
			}
		}
		return null;
	}
	
	@Override
	public String toString(){
		if(head == null){
			return "-";
		}
		
		StringBuilder sb = new StringBuilder();
		Node pointer = head;
		while(pointer != null){ 
			sb.append(pointer.data + " "); 
			pointer = pointer.link;
		}
		return sb.toString();
	}

	private class Node{
		
		String data; //TODO private를 붙여야 하는지 말아야 하는지?
		Node link;

		Node(){
			this.data = null;
			this.link = null;
		}
		
		Node(String data){
			this.data = data;
			this.link = null;
		}

		Node(String data, Node link){
			this.data = data;
			this.link = link;
		}
	}
}
