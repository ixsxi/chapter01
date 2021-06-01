package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
	
		//방 갯수 변경될때 for 문에서 개수 부분을 변경해줘야 함
		
		int[] no = new int [8];         //갯수 6 --> 8
		
		for(int  i=1; i<no.length; i++) {
			no[i] =(int)(Math.random()*45)+1;
		}
		
		System.out.println(no.length);
		
		for(int i=1; i<no.length; i++) {	// 1<6   1<=3
			System.out.println(no[i]);
		}
		
		System.out.println("=================");
		
		
		for(int i=1; i<no.length; i++) {	// 1<6   1<=3
			System.out.println(no[i]);
	}
}
}