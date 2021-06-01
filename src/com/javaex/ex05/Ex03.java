package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		
		
		int[] no = new int[6];         // 힙 영역에(메모리에) 6개의 방을 만들어줌

		
		for(int  i=0; i<6; i++) {
			no[i] =(int)(Math.random()*45)+1;
		}
		
		for(int i=0; i<6; i++) {	// 1<6   1<=3
			System.out.println(no[i]);
		}
	}

}