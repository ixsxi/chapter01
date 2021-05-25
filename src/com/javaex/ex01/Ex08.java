package com.javaex.ex01;

public class Ex08 {

	
	
		public static void main(String[] args) {
			
			//대입연산자
			System.out.println("대입연산자");
			int a = 7;
			int b = 2;
			System.out.println(a);
			System.out.println(b);
			
			
			//산술연산자
			System.out.println("산술연산자");
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			
			System.out.println(a/b);     //int로 표현되었기때문에 7/2 = 3.5지만 int =3으로 출력
			System.out.println(a%b);	// %는 나머지값을 출력함
			
			
			//산술연산자 /%
			System.out.println("산술연산자 /----------------- % 자세히");
			System.out.println(70/20);
			System.out.println(7.0%2.0);
			
			
			//부호 연산자
			
			System.out.println("부호 연산자");
			int var = -3;
			int pVar = +var;
			int mVar = -var;
			var = -var;
			System.out.println(var);
			System.out.println(pVar);
			System.out.println(mVar);
			System.out.println(var);
			System.out.println(pVar);
			System.out.println(mVar);
			
			
			//증감 연산자

			
			System.out.println("증감 연산자 !!!!!!!!!");
			System.out.println(a); //////a >>>>>>> 7
			System.out.println(++a);  /// ++ 붙으면 1 올라감
			System.out.println(a);   // a의 값은 변했을까? >>변했음
			
		
			System.out.println(b);   //// b >>>>> 2
			System.out.println(--b);   /// -- 붙으면 1 줄어듬
			System.out.println(b);   // b는 바뀌었을까 ? >>변했음
			
			
			
			System.out.println("증감 연산자 뒤---------------");
			System.out.println(a);    // a  8
			System.out.println(a++); 
			System.out.println(a);
			
			
			
			System.out.println(b);    // b >>>>>>  1
			System.out.println(b--);  //출력하고 1--> 0으로 
			System.out.println(b);
			
			
			
			System.out.println("증감연산자 연습문제 ---------------");
			int num = 5;       
			System.out.println(num);           // num --->5
			
			
			/*
			System.out.println(++num);           // num  5 ---> 6, 출력
			
			
			System.out.println(num++);         //num 5로 보이지만 실제로는 6로 올라감
			System.out.println(num);
			*/
			
			
			
			
			System.out.println(++num *10 -7);  //출력,  num*10 ,num 5 -->6으로 올리고 
			System.out.println(num); 
			System.out.println(num*658); 
			
			
			
			
			
			
			
			
			
			
			System.out.println("증감연산자 연습문제----------------");
			
			
			int no = 10;
			int no1 = 20;
			
			System.out.println(no);
			System.out.println(no1);
			
		
			System.out.println(no++);
			System.out.println(no++);
			System.out.println(no);
			
			
			
			
			
			
			
			

			
			
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	
	
}
