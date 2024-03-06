package week4Assignment;

		import java.util.Scanner;

		public class Primes {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter an integer: ");
				int N=0;
				try {
					N = Integer.parseInt(sc.nextLine());
					
					
				} catch (Exception e) {
					System.out.println("Invalid value. Exiting the program...");
					System.exit(0);
				}
				
				if (N<0) {
					N = Math.abs(N);
					System.out.println("Your new positive integer is "+ N);
				} else {
				
					System.out.println("Your integer is "+ N);
				}
				System.out.println("All prime numbers up to "+ N + ": ");
				printPrimes(N);
				
			
						
			}
			
			public static void printPrimes(int x) {
				for (int i= 2; i<=x; i++) {                          //numbers less than two are not primes;
					if (isPrime(i)) {
						System.out.print(" " + i + " ");
					}
				}
			}
			
			public static boolean isPrime(int j) {
				for (int i= 2; i<j; i++) {
					if ((j%i)==0) {
						return false;
					}
				}
			 return true;
			
		}
			
	}
			
				
//				for (int i= 0; i<=N; i++) {
//				
//					printPrimeNumber(i);
//					
//				}
				
					//do printPrimeNumber with i, create the method that does the print out if it is a prime
					// if 
					
//				}
//				
//				public static void printPrimeNumber(int x) {
//					
//					
//					for (int j=1; j<x; j++) {
//						
//						if ((x%j) != 0) {
//							System.out.print(x);
//						}
//					 
//					}
//				}
		//}


				

		//Write a Java application that accepts an integer N as input from the user (use the Scanner class). 
		//Then check if the number is a positive integer. If it is negative, just drop the sign and make it a positive number. 
		//If it is not an integer, exit the application.
		//Given a positive number instead, print out all the prime numbers up to the number entered. 
		//For instance, given -32 as input your application will have to display these numbers:
		//
		//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31

	


