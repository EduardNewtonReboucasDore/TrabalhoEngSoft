package edu.trabalho01;

public class Principal {

	/* 1) Papel
	 * 2) Tesoura
	 * 3) Pedra
	 * */
	public static void main(String[] args) {	
			
		Jogo j1 = new Jogo();
		
		for(int i = 1; i < 4; i++) {
			for(int j = 3; j > 0; j --) {
				System.out.printf("%d %d: ",i,j);
				j1.getGanhador(i, j);
			}
		}
	}
}