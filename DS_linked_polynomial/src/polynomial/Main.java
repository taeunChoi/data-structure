/*
 * 2016.9.1
 * 설명: 링크드리스트를 통한 다항식의 덧셈 프로그램
 * 
 * TODO 곱셈
 * 입력 10000000 -> 시간 1.488
 * */
package polynomial;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("----linked polynomial----");
		
		Polynomial a = new Polynomial();
		Polynomial b = new Polynomial();
		Polynomial c = new Polynomial();
		
		int inputNum = 1000000;
		for(int i=0; i<inputNum; i++){
			a.appendTerms(inputNum-i, inputNum-i);
			b.appendTerms(inputNum-i, inputNum-i);
		}
		
		long start = System.currentTimeMillis();
		a.addPolynomial(b,c);
		long end = System.currentTimeMillis();
		
		System.out.println("입력: "+inputNum+"/시간: "+ (end-start)/1000.0 );
	}
}
