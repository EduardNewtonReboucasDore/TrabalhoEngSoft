package edu.trabalho01.miniKataBuzz;

public class MiniKataBuzz {

	public static String getMiniKataBuzz(Integer numero) {
		if(numero % 5 == 0) return "BUzz";
		
		return (Integer.toString(numero));
	}
}
