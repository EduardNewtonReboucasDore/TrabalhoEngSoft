package edu.trabalho01.miniKataFizzBuzzParcial;

public class MiniKataFizzBuzzParcial {

	public static String getMiniKataFizzBuzzParcial(Integer numero) {
		if(numero % 3 == 0 || numero % 5 == 0) return "FizzBuzz";
		
		return (Integer.toString(numero));
	}
}
