package br.com.generation.at;

import java.util.Scanner;

public class Atividades {

	public static void main(String[] args) {
		
		int diaAnos = 365, diasMes = 30;
		int dias, meses, anos;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Didite sua idade: ");
		anos = leia.nextInt();
		
		System.out.println("Digite a quantos meses voc� fez aniversario: ");
		meses = leia.nextInt();
		
		System.out.println("A quantos dias voc� fez aniversario: ");
		dias = leia.nextInt();
		
		dias = (anos*diaAnos) + (meses*diasMes) + dias;
		
		System.out.println("Sua idade em dias �: " + dias);
		
		leia.close();

	}

}
