package edu.trabalho01.miniKataFizz;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiniKataFizz fizz = new MiniKataFizz();
		
		for(Integer i = 0; i < 10; i++) {
			System.out.println(fizz.getMiniKataFizz(i));
		}
	}

}
