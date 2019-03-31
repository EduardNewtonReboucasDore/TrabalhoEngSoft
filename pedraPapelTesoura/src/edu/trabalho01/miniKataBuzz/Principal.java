package edu.trabalho01.miniKataBuzz;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiniKataBuzz buzz = new MiniKataBuzz();
		
		for(Integer i = 0; i < 10; i++) {
			System.out.println(buzz.getMiniKataBuzz(i));
		}
	}

}
