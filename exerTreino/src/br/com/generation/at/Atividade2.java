package br.com.generation.at;

import java.util.Scanner;

public class Atividade2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int horas, minutos, segundos;
		horas = 0;
		minutos = 0;
		segundos = 0;
		
		System.out.println("Quanto tempo durou o evento: ");
		minutos = leia.nextInt();
		
		
		 while( minutos>= 60) {
			 segundos++;
			  if(segundos >= 60) {
				horas++;
				 minutos = minutos - 60; 
			 }
			 
		 }
		 System.out.println(horas + ":" + minutos + ":" + segundos);
		 
		 leia.close();
	}

}
