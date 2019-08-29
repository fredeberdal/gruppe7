package no.hvl.dat100;

	import static javax.swing.JOptionPane.*;
	
public class Oppgave6 {

	public static void main(String[] args) {
		
		String melding = ("Fakulteten er: ") ;
		int sum = 1;
		
			int i = Integer.parseInt(showInputDialog("Skriv inn tallet du vil ha fakultert"));
		
			for (int fakultet = 1; fakultet <= i; fakultet++) {
			sum = fakultet * sum ;

			}
					showMessageDialog(null, melding + sum) ;

	}

}
