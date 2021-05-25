package com.javaex.ex01;

public class Ex06 {

	
	public static void main(String[] args) {
		
		//자동형변환1 : 자료형변환 규칙을 알아야 자료형을 결정 할 수 있다.
		System.out.println(2+3.5);
		double var01 = 2+3.5;//자료형을 알아야한다
		System.out.println(var01);
		
		//자동형변환2 (long + float)
		long var02 = 12345L; //int 넘어갈때 L을 붙여야한다//하지만 대부분 L을 붙인다.
		float var03 = 1.1F;
		
		System.out.println(var02 + var03); //test >> 실수가 나옴 
		
		float result01 = var02 + var03; //long >> float자동변환 되었음
		System.out.println(result01);
		
		System.out.println();
			////////////////////////////////////////////////////////////////////////////
				
				//강제 형변환
				int var04 = (int)3.14;
				System.out.println(var04);
				
				//확대변환
				byte var05 = 127;
				int result02 = (int)var05;  //강제변환 byte >>(int)
				System.out.println(result02);
				
				
				//축소변환
				int var06 = 10;
				byte result03 = (byte)var06;
				System.out.println(result03);
				
				
				//축소변환 비교
				int var07 = 10232132;
				byte result04 =(byte)var07;
				System.out.println(result04);   //출력되는 값 이유확인
	
				
				//실수 >> 정수  :소수점 없어짐   // ★★★★★★★★★★★★★★★★★★★★★★★
				
				double var08 = 556.5519815647;
				int result05 = (int) var08;
				System.out.println(result05);
				
				//정수 >> 실수 : 소수점 0으로 표현된다.
				
				int var09 = 7;
				double result06 = (double) var09;
				System.out.println(result06);
				
		//////////////////연습 문제 /////////////////////////		
				double v01 = 5/4;			//int = int /int
		        System.out.println(v01);     //결과 int >> double 형변환

		        double v02 = (double)5 / 4 ;  //1.25
		        System.out.println(v02);   

		        double v03 = 5 / (double)4 ;  //1.25
		        System.out.println(v03);     

		        double v04 = (double)5 / (double)4 ;  //1.25
		        System.out.println(v04);    

		        int v05 = (int)1.3 + (int)1.8 ;     
		        System.out.println(v05);        // 2
		        
		        int v06 = (int) (1.3+1.8);
		        System.out.println(v06);

				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}			
}
