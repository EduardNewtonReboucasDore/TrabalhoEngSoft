package edu.trabalho01.kataFizzBuzz;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KataFizzBuzz ka = new KataFizzBuzz();
		
		for(int i = 1; i < 16; i++) {
			System.out.println(ka.getKataFizzBuzz(i));
		}

	}

}
