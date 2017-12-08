package warsztaty_1.warsztaty_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		//int generator = ThreadLocalRandom.current().nextInt(1, 50 + 1);
		
		int[] generated = new int[6];
		int i=0;
		while (i<6){
			int number = generator.nextInt(50)+1;
			
			Arrays.sort(generated);
			boolean contain=true;
			contain=contains(generated, number);
			if(contain==false){
				generated[0]=number;
				i++;
			}
		}
		
		int[] intArr=new int[6];
		int j=0;
		
		while(j<6){
			
			System.out.println("Enter an integer from 1 to 49 included");
			
			while(!scan.hasNextInt()){
				
				System.out.println("It must be an integer from range 1-49");
				scan.next();
			}
			int number = scan.nextInt();
			
			Arrays.sort(intArr);
			boolean contain=true;
			contain = contains(intArr, number);
			if(number>0 && number<50 && contain==false){
				intArr[0]=number;
				j++;
			}else{
				System.out.println("Wrong number");
			}
			
		}
		Arrays.sort(intArr);
		System.out.println("Yours numbers are "+Arrays.toString(intArr));
		
		Arrays.sort(generated);
		System.out.println("Drew numbers are "+Arrays.toString(generated));
		
		checkWin(intArr, generated);		
		
		
	}
	static boolean contains(int[] arr, int item) {
	      int index = Arrays.binarySearch(arr, item);
	      return index >= 0;
	}
	static void checkWin(int[] arr1, int[] arr2){
		
		int counter=0;
		for(int k=0; k<arr1.length; k++){
			
			if(arr1[k]==arr2[k]){
				counter++;
			}
		}
		if(counter==6){
			System.out.println("Wow! Jackpot!");
		}else if(counter==5){
			System.out.println("Very well! 5 of 6");
		}else if(counter==4){
			System.out.println("Nice! You have 4 from 6");
		}else if (counter==3){
			System.out.println("Not bad! Keep trying");
		}else {
			System.out.println("Oops... Beter luck next time. You have won nothing.");
		}
	}
	
}
