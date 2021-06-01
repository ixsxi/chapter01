package com.javaex.ex04;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		System.out.println("======continue 문===========");
		
		for(i=1; i<=20; i++) {
			
			if(i%2==0   ||   i%3==0) {
				continue;
			}
			
			System.out.println(i);
			
		}
		
		System.out.println("======if-else 문===========");
		
		for(i=1; i<=20; i++) {
			if(i%2==0 || i%3==0) {
				
			}else {
				System.out.println(i);
			}
		}
		
		
		System.out.println("=======if 문==========");
		
		for(i=1; i<=20; i++) {
			if(  i%2!=0 || i%3!=0  ) {
				
				System.out.println(i);	
			}
		}
		
	}

}
