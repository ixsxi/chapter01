package com.javaex.ex05;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		      
		      int[] arrA = new int[3];
		      arrA[0] = 3;
		      arrA[1] = 6;
		      arrA[2] = 9;
		      
		      for(int i = 0; i<arrA.length; i++) {
		         System.out.println(arrA[i]);
		      }
		      
		      System.out.println("======================");
		      
		      int[] arrB = new int[3];
		      for(int i = 0; i<arrA.length; i++) {
		    	  
		         arrB[i] = arrA[i];
		      }
		   
		      
		      for(int i = 0; i<arrA.length; i++) {
		         System.out.println(arrA[i]);
		      
		      }
		      
		      System.out.println("======================");
		      
		      for(int i = 0; i<arrA.length; i++) {
		         System.out.println(arrB[i]);
		      }
		   
		      System.out.println("======================");
		      //arrA[1] ->
		      arrA[1] = 100;
		      arrB[1]=arrA[1];
		      
		      for(int i=0; i<arrA.length; i++) {
		         System.out.println(arrA[i]);
		      }
		      System.out.println("======================");
		      
		      for(int i=0; i<arrA.length; i++) {
		         System.out.println(arrB[i]);
		      }
		   }

		}
