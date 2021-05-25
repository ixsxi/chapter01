package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		System.out.print("근무시간:");
		
		int work =sc.nextInt();
		
		
		
		if(work<=8) {
			System.out.println("임금은"+work*10000+"원 입니다");
			
		}else
			System.out.println("임금은"+((work*15000)-40000) +"원 입니다");
		
		
		sc.close();
		}
		

	}


