package com.javaex.ex04;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int val=0;
		int num;
		int i;
		Scanner sc =new Scanner(System.in);
		
		num= sc.nextInt();
		
		
		for(num=i; num<100; num++ ) {
			val=val+i;
					System.out.println("합계"+val);
		}
		
			*/
		/*
		Scanner sc =new Scanner(System.in);
		int num;
		int sum = 0;
		
		System.out.println("숫자를 입력하세요 0이면 종료");
		
		do {
			num =sc.nextInt();
			sum =sum +num;
			System.out.println("합계:" + sum);
			
			
		}while(num !=0);
		
		System.out.println("종료");
		
		sc.close();
		*/
		
		Scanner sc =new Scanner(System.in);
		int num;
		int sum = 0;
		
		System.out.println("숫자를 입력하세요 0이면 종료");
		
		while(true){
			num =sc.nextInt();
			sum =sum +num;
			System.out.println("합계:" + sum);
			
			if(num == 0) {
				break;
			}
		}
	}

}
