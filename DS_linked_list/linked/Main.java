/*
 * 2016.8.31
 * 설명: 링크드리스트 삽입 삭제 검색 출력 구현.
 * 
 * 
 * 헷갈렸던점들
 * head = newNode 에서 head는 newNode의 레퍼런스값을 저장하고있음. 주소값.
 * 
 * pointer=pointer.link vs pointer.link = pointer.link.link
 * 첫번째는 pointer의 주소값을 pointer가 가리키고있는 객체의 link에 저장된 주소값으로 바꾸는 것 (포인터 위치변경)
 * 두번째는 pointer가 가리키고있는 객체의 link에 저장된 주소값을 pointer가 가리키고있는 객체의 link가 가리키고있는 객체의 link에 저장된 주소값으로 바꾸는것 (중간 노드 삭제)
 * 
 * */
package linked;

public class Main {
	
	public static void main(String[] args){
		
		System.out.println("----linked list----");
		
		LinkedList linkedList = new LinkedList();
		
		System.out.println(linkedList);
		
		linkedList.insertFirstNode("one");
		System.out.println(linkedList);
		
		linkedList.insertFirstNode("two");
		System.out.println(linkedList);
		
		linkedList.insertFirstNode("three");
		System.out.println(linkedList);
		
		linkedList.insertLastNode("four");
		System.out.println(linkedList);
		
		linkedList.deleteNode("two");
		System.out.println(linkedList);
	}
}
