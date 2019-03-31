package edu.trabalho01.kataFizzBuzz;

public class KataFizzBuzz {
	
	public static String getKataFizzBuzz(Integer numero) {
		
		if(numero % 3 == 0 && numero % 5 == 0) {
			return "FizzBuzz";
		} else if (numero % 3 == 0) {
			return "Fizz";
		} else if (numero % 5 == 0) {
			return "Buzz";
		}
			
		return (Integer.toString(numero));
	}
}
