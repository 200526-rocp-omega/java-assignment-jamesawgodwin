package com.revature.eval.java.core;

public class test {
	
	public static void main(String[] args) {
		 

		SpeedConverter t = new SpeedConverter();
		t.calculateNthPrime(5);



	}
	static class SpeedConverter {

		public static long toMilesPerHour(double kilometersPerHour) {
			if(kilometersPerHour < 0) {
				return -1;
			} else {
			
			double conversion = kilometersPerHour * 0.6;
			long toMilesPerHour = Math.round(conversion);
			System.out.println(toMilesPerHour);
			
			return toMilesPerHour;
			}
		}

		public static String printConversion(double kilometersPerHour) {
			// TODO Write an implementation for this method declaration
			if (kilometersPerHour < 0) {
				System.out.println("Invalid Value");
			} else {
				System.out.println(kilometersPerHour + " km/hr = " + kilometersPerHour*0.6 + " mi/h");
			
			}
			return null;
		}
		
	}
		
		public String printMegaBytesAndKiloBytes(int kiloBytes) {
			if (kiloBytes < 0) {
				System.out.println("Invalid Value");
			} else {
				
				System.out.println(kiloBytes + " KB = " + kiloBytes/1024 + " and " + kiloBytes%1024 + " KB");
			}
			// TODO Write an implementation for this method declaration
			return null;
		}
		
		public int calculateNthPrime(int k) { 
			
		    int num, count, i; // more convenient to write
		    num = 1;
		    count = 0;
		 
		    while (count < k) {
		      num += num;
		      
		      for (i = 2; i <= num; i++) { //Here we will loop from 2 to num
		        if (num % i == 0) {
		          break;
		        }
		      }
		      if ( i == num) {// prime
		        count += count;
		      }
		    }   
		
			return count;
		}
	
}
