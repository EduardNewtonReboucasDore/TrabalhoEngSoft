package edu.trabalho01.miniKataFizz;

public class MiniKataFizz {

	public static String getMiniKataFizz(Integer numero) {
		if(numero % 3 == 0) return "Fizz";
		
		return (Integer.toString(numero));
	}
}
