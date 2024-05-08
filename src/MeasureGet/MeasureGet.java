package MeasureGet;

import java.util.Scanner;

public class MeasureGet {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		for(int i = 1; i < 10000; i++) {
			if(num < i) {
				System.out.print(0);
				break;
			}
			if(num%i == 0) {
				++count;
				
				if(count == num2) {
					
					System.out.print(i);
					break;
				}
			}
			
		}
	}
}