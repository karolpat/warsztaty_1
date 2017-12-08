package warsztaty_1;

import java.net.Socket;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args) {
		
		
			game();
	}
	
//	static int guessNumber(){
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Try to guess what is the number. Enter number from 0 to 100.");
//		d
//		while(!scan.hasNextInt()){
//			System.out.println("Only integer is eligible");
//			scan.nextInt();
//		}
//		int guess=scan.nextInt();
//		return guess;
//	}
	static void game(){
		
		Random generator = new Random(100);
		Scanner scan = new Scanner(System.in);
		int value=generator.nextInt(100);
		
		boolean result=false;
		
		while(result!=true){
						
			System.out.println("Try to guess what is the number. Enter number from 0 to 100.");
			
			while(!scan.hasNextInt()){
				System.out.println("Only integer is eligible");
				scan.next();
			}
			
			int guess=scan.nextInt();			
					
			if(guess==value){
				System.out.println("Bingo!");
					//guessNumber();
				result=true;
			}else if(guess<value){
				System.out.println("Too small number. Try again!");
					//guess=scan.nextInt();
					
			}else if( guess>value){
				System.out.println("Too big number. Try again!");
			}		
		}
		//System.out.println("Bingo!");
	}

}
