package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave6_uke_36 {

	public static void main(String[] args) {
		// lage et program som regner n! = n fakultet. (5! = 1*2*3*4*5 = 120)
		
		int n = Integer.parseInt(showInputDialog("Skriv in verdi for n "));
		
		int a = 1; // lager en telle variabel til løkken
		
		for (int i = 1; n >= i; i++) { // setter inn int i = 1 siden vi vil at den skal begynne fra 1.
		a*= i; //
	}
	showMessageDialog(null, n + "! til svar: " + a);
	
	}
}

