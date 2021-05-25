package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이:");
		int age = sc.nextInt();   // 엔터가 남아있는상황 숫자 뒤 엔터처리 오류
		
		sc.nextLine();   // 하나의 공백을 줘서 오류 해결 버그임그냥
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름:");
		String name = sc.nextLine();
		
		System.out.println("당신의 이름은" + name +"나이는" + age + "입니다" );
		
		sc.close();
	}

}
