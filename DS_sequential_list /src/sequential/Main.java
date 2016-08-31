/*
 * 2016.8.31
 * 설명: 선형리스트 순차자료구조 1차원배열 삽입 삭제 출력 프로그램. 
 * 입력: 배열개수 \n 값 
 * 출력: 배열출력 
 * */
package sequential;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 삽입. 삭제. 출력
		
		//입력: 배열개수\n엔터하고 값 
		//출력: insertValueByIndex(1,3) & deleteValueByIndex(3)
		
		
		System.out.println("----sequential list----\n");
		
		System.out.print("input array length--->");
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		input.nextLine();
		
		System.out.print("input array value--->");
		String[] valueStringArray = input.nextLine().split(" ");
		
		int lengthInputValue = valueStringArray.length;
		
		Integer[] tempSequentialArray = new Integer[length];
		for(int i=0; i < lengthInputValue ; i++){
			tempSequentialArray[i] = Integer.parseInt(valueStringArray[i]);
		}

		SequentialArray sequentialArray = new SequentialArray(tempSequentialArray, lengthInputValue-1);
		System.out.println(sequentialArray.toString());
		
		System.out.print("input insert index / input insert value --->");
		long start = System.currentTimeMillis();
		sequentialArray.insertValueByIndex(input.nextInt(), input.nextInt());
		long end = System.currentTimeMillis();
		System.out.println(sequentialArray.toString());
		//System.out.println((end-start));
		input.nextLine();
		
		
		System.out.print("input delete index--->");
		sequentialArray.deleteValueByIndex(input.nextInt());
		System.out.println(sequentialArray.toString());
		input.nextLine();
	}

}
