package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylistnumeros2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("\nDigite o número que você deseja encontar: ");
		int n = leia.nextInt();
		
		int posicao = numeros.indexOf(n);
		
		if(posicao != -1) {
			System.out.println("\nO número "+n+" está localizado na posição " +posicao);
		}else {
			System.out.println("\nO número  " +n+" não foi encontrado! ");			
		}
		
	}

}
