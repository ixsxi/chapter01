package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("단을 입력해주세요");
		System.out.print("단 : ");
		
		
							//초기화
		int dan = sc.nextInt();
		int i = 1;
		
		
		
		while(i<=9) {//반복문조건
			System.out.println(dan+"  *   "+  i  + "  =  "+i*dan );
			
			
			//증감식
			i++;
		}
		
		
		sc.close();
		
	}

}
