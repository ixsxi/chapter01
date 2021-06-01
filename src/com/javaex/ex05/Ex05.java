package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		// 세부 문법
		
		
		int[] intArray = new int[3] ;   //  ***  추천 이걸 충분히 익힐것 ***  /

		
		intArray[0] =11;
		intArray[1] =3;
		intArray[2] =78;
		
		
		//int[] intArray = new int[] {11, 3,78}; // new int [3] --> 이렇게 사용 x
		
		//int[] intArray = {11,3,78};   // 가능은 한데 추천하지 않음
		
		for(int i =1; i<intArray.length; i++ ) {
			System.out.println(intArray[i]);
			
		}
	}

}
