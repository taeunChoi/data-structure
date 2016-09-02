package polynomial;

public class Polynomial {
	
	private Node head;
	private Node last;
	
	public Polynomial(){
		this.head = null;
		this.last = null;
	}
	
	public Node getHead(){
		return this.head;
	}
	
	public void appendTerms(int exponent,int coefficient){
		Node newTerm = new Node(exponent, coefficient);
		
		if(head == null){
			head = newTerm;
			last = newTerm;
			return;
		}
		last.link = newTerm;
		last = newTerm;
	}
	
	public Polynomial addPolynomial(Polynomial addPolynomial, Polynomial resultPolynomial){

		Node pointer = this.head;
		Node pointerAdd = addPolynomial.head;
		
		while(pointer != null || pointerAdd != null){ //둘다

			int gapDegree = -1;
			if(pointer != null && pointerAdd != null){
				gapDegree = pointer.exponent - pointerAdd.exponent;
			}
		
			if(pointerAdd == null || gapDegree > 0){ //자신의 계수가 더 높음 
				resultPolynomial.appendTerms(pointer.exponent, pointer.coefficient);
				pointer = pointer.link; 
			}else if(gapDegree == 0){ //더할것과 계수가 같음
				resultPolynomial.appendTerms(pointer.exponent, pointer.coefficient + pointerAdd.coefficient);
				pointer = pointer.link;
				pointerAdd = pointerAdd.link;
			}
			else if(pointer == null || gapDegree < 0){ //자신의 계수가 더 낮음 
				resultPolynomial.appendTerms(pointerAdd.exponent, pointerAdd.coefficient);
				pointerAdd = pointerAdd.link;
			}
		}
		return resultPolynomial;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		
		Node pointer = head;
		while(pointer != null){
			sb.append(pointer.coefficient+"X^"+pointer.exponent);
			if(pointer.link != null){
				sb.append(" + ");
			}
			pointer = pointer.link;
		}
		return sb.toString();
	}
	
	private class Node{
		int exponent; //지수 
		int coefficient; //계수 
		Node link;
		
		Node(int exponent, int coefficient){
			this.exponent = exponent;
			this.coefficient = coefficient;
			this.link = null;
		}
	}
}
