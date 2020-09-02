package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave7_uke_35 {

	public static void main(String[] args) {
		// Oppgave 7 innlevering
	
	for (int elever = 1; elever <= 10; elever++) {
		
		int poeng = Integer.parseInt(showInputDialog("Skriv inn poengsum"));
		
		int karakter_A = 100;
		
		int karakter_B = 89;
		
		int karakter_C = 79;
		
		int karakter_D = 59;
		
		int karakter_E = 49;
		
		int karakter_F = 39;
		
		if (poeng <= karakter_A && poeng >= 90) {
			showMessageDialog(null,"Din karakter er: A");
			
		}else if (poeng <= karakter_B && poeng >= 80) {
			showMessageDialog(null,"Din karakter er: B");
			
		}else if (poeng <= karakter_C && poeng >= 60) {
			showMessageDialog(null,"Din karakter er: C");
			
		}else if (poeng <= karakter_D && poeng >= 50) {
			showMessageDialog(null,"Din karakter er: D");
			
		}else if ( poeng <= karakter_E && poeng >= 40) {
			showMessageDialog(null,"Din karakter er: E");
			
		}else if ( poeng <= karakter_F && poeng >= 0) {
			showMessageDialog(null,"Din karakter er: F");
			
		}else {
			showMessageDialog(null,"Du har tastet inn ugyldig poengsum! tast in ny poeng sum");
			elever--;	
		}
	}
		
	}

}
