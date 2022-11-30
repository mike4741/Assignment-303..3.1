package org.perscholas.exercise;

import java.util.Scanner;

public class LoopExcersice {

	public static void main(String[] args) {

		LoopExcersice myAnswer = new LoopExcersice();

		myAnswer.question_1();

    	myAnswer.question_2();

		myAnswer.question_3();

	

	}// main

	private void question_1() {
		System.out.println("\nAnswer for # 1");

		for (int i = 1; i <= 12; i++) {

			for (int j = 1; j <= 12; j++) {

				System.out.print(i * j + "  ");
			}

			System.out.println(" ");
		}

	}

	private void question_2() {
		System.out.println("\nAnswer for # 2");

		Scanner  sc = new Scanner (System.in);
		
		System.out.println("Enter the first number to calculate a GCF");
		
         int num1 = sc.nextInt();
         
		System.out.println("Enter the second number to calculate a GCF");
		
		int num2 = sc.nextInt();
		
		int k = 2 ;
		int GCF=0; ;
		
		
		 while (k <num2 && k < num2) {
			 if ((num1 % k == 0 ) && (num2% k == 0)) 
				 GCF = k ;
				 k++; 
			 
		 }
			System.out.println("the GCF of  "+ num1 +" and "+ num2 +" is equal to " + GCF);
		
	
		
		sc.close();
		

	}

	private void question_3() {
		System.out.println("\nAnswer for # 3");
		
		double tuition = 10000;
		float tuitionIncrease = 1.07f;
		 int year = 0 ;
		 
		 while (tuition < 20000 ) {
			 tuition =  (tuition * tuitionIncrease) ;
			 year++; 
		 }
		 
			System.out.println("The tuition will be double in "+ year  +" years");
			
	}
 
	

}
