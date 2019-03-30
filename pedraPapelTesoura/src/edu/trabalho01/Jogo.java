package edu.trabalho01;

public class Jogo {
	
	public void getGanhador(Integer jogadorUm, Integer JogadorDois) {
		
		boolean next = true;
		
		while(next) next = validaGanhador(jogadorUm, JogadorDois);	
	}
	
	private boolean validaGanhador(Integer jogadorUm, Integer JogadorDois) {
		
		if(jogadorUm == JogadorDois) {
			System.out.println("Empatou\n");
		}else if( jogadorUm == 1 && JogadorDois == 2) {
			System.out.println("Papel, Tesoura. Ganhador: Tesoura (Jogador 2!)\n");
			return false;
		}else if( jogadorUm == 1 && JogadorDois == 3) {
			System.out.println("Papel, Pedra. Ganhador: Papel (Jogador 2!)\n");
			return false;
		}else if( jogadorUm == 2 && JogadorDois == 1 ) {
			System.out.println("Tesoura, Papel. Ganhador: Tesoura (Jogador 1!)\n");
			return false;
		}else if( jogadorUm == 2 && JogadorDois == 3 ) {
			System.out.println("Tesoura, Pedra. Ganhador: Pedra (Jogador 2!)\n");
			return false;
		}else if( jogadorUm == 3 && JogadorDois == 1 ) {
			System.out.println("Pedra, Papel. Ganhador: Papel (Jogador 2!)\n");
			return false;
		}else if( jogadorUm == 3 && JogadorDois == 2 ) {
			System.out.println("Pedra, Tesora. Ganhador: Pedra (Jogador 1!)\n");
			return false;
		}	
		return false;
	}
}