package warsztaty_1.warsztaty_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class task3 {

	public static void main(String[] args) {

		//try{
			code();
//		}catch (Exception e){
//			System.out.println(e.getMessage());
//		}
				
	}
	static boolean contains(int[] arr, int item) {
	      int index = Arrays.binarySearch(arr, item);
	      return index >= 0;
	}
		
	
	static void code(){
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Pomyśl liczbę z zakresu 0-1000, a ja ją zgadnę.");
		
		int max=1000;
		int min=0;
		Random rand = new Random ();
//		String less = "M";
//		String more = "W";
//		String bingo = "B";
//		String option[]={"M","W","B"};
//		Arrays.sort(option);
//		
//		int contain =1;
    	boolean win=false;
		int guess = 0;
		String answer = "";
		String answer1 = "";
			
		while (win!=true){
			System.out.println(max);
			System.out.println(min);
			//guess=rand.nextInt(((max - min)+1)+min);
			guess=ThreadLocalRandom.current().nextInt(min, max + 1);
			System.out.println("Zgaduję: "+ guess + " Zgadłem? Napisz \"Tak\" lub \"Nie\"");
			//String word=scan.nextLine();	
			
//			while(scan.nextLine().length()!=1){
//				System.out.println("Miało być W, M lub B");
//				scan.next();
//				}
			String word = scan.next();
			if(word.equals("Tak")){
				System.out.println("Super udało się");
				win=true;
				
			}else if(word.equals("Nie")){
					answer=scan.next();
					System.out.println("Więcej?");
					
					if(answer.equals("Tak")){
						min=guess;
						
					}else if (answer.equals("Nie")){
						System.out.println("Mniej?");
						answer1=scan.next();
						
						if(answer1.equals("Tak")){
							max=guess;
						}else if(answer1.equals("Nie")){
							System.out.println("Nie oszukuj!");
							break;
						}
					}
			}else {
				System.out.println("Wprowadzono złe hasło. Podaj jeszcze raz.");
				scan.next();
			}
//			String word=scan.next();
//			contain = Arrays.binarySearch(option, word);
//			while(contain>0){
//				System.out.println("Błędne hasło");
//				scan.next();
//			}
//			while(word.length()<1 && word.length()>1 && (!word.equals(more) || !word.equals(less) || !word.equals(bingo))){
//				System.out.println("Błędne hasło");
//				scan.next();
//			}
			
//			if (word.length()<1 && word.length()>1){
//				throw new Exception ("Za krótki tekst");
//			}else if (!word.equals(more) || !word.equals(less) || !word.equals(bingo)){
//				throw new Exception ("Błędne hasło");
//			}
			
//			if(word.equals(more)){
//				min=guess;
//			}else if(word.equals(less)){
//				max=guess;
//			}else if(word.equals(bingo)){
//				System.out.println("Zgadłem!");
//				win=true;
//			}
//		}
	}
	}

}
