/*
 * 2016.8.31
 * 설명: 원형 링크드 리스트 삽입 삭제 검색 출력 프로그램
 * 
 * 알게된것들
 * @Override 오버라이딩된 toString 메소드가있으면 그 객체를 System.out.println()출력 했을때 toString메소드가 자동으로 호출되서 그 형식에 맞게 출력됨.
 * 
 * */
package circular;

public class Main {
	
	public static void main(String[] args){
		
		CircularLinkedList cl = new CircularLinkedList();
		
		cl.insertLastNode("월");
		System.out.println(cl);
		
		cl.insertLastNode("화");
		System.out.println(cl);
		
		cl.insertLastNode("목");
		System.out.println(cl);
		
		cl.insertLastNode("금");
		System.out.println(cl);
		
		cl.insertLastNode("토");
		System.out.println(cl);
		
		cl.insertMiddleNode("수", "화");
		System.out.println(cl);
		
		cl.deleteNode("월");
		System.out.println(cl);
		
		cl.deleteNode("토");
		System.out.println(cl);
		
		
		
		
		
	}

}
