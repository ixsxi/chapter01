package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int aa = sc.nextInt();
		
		
		if(aa%3 == 0) {
			System.out.println("3의 배수입니다");
		}else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		sc.close();

	}

}
