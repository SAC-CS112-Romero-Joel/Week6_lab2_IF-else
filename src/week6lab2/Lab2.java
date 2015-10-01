package week6lab2;

import java.util.Scanner;

public class Lab2 {
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Scanner op =  new Scanner(System.in);
		
int computerNum;
int Num;

computerNum = 0 + (int) ( Math.random() * 10 );
 
 
System.out.println("Guess a Number between 1 and 10");
 Num = input.nextInt();


if ( Num == computerNum )
System.out.println("we got the Same Number you win "); 

else if ( computerNum > Num )
System.out.println("Your Number is to low ");

else if ( computerNum < Num )
System.out.println("Your Number is to high");
 
System.out.println(" My Number Was : "+(computerNum));
	}



}
