package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave5 {

	public static void main(String[] args) {

		// final int ANT = 10 ;
		// for (int studentnr = 1; studentnr <= ANT; studentnr++) {
		int i = 0;
		while (i <= 9) {

			int karakter = parseInt(showInputDialog("Før inn poengsummen din her."));

			if (karakter < 0 || karakter > 100) {
				showMessageDialog(null, "du har ført et ugyldig tall, prøv igjen.");
				i--;
			} else if (karakter >= 0 && karakter <= 39) {
				showMessageDialog(null, "Du har fått karakteren F! \n Øv mer :]");
			} else if (karakter >= 40 && karakter <= 49) {
				showMessageDialog(null, "Du har fått karakteren E! \n Bedre enn F :]");
			} else if (karakter >= 50 && karakter <= 59) {
				showMessageDialog(null, "Du har fått karakteren D! \n Over 50% riktig! :]");
			} else if (karakter >= 60 && karakter <= 79) {
				showMessageDialog(null, "Du har fått karakteren C! \n du begynner å bli god nå :]");
			} else if (karakter >= 80 && karakter <= 89) {
				showMessageDialog(null, "Du har fått karakteren B! \n Nå er du nesten på topp :]");
			} else if (karakter >= 90 && karakter <= 100) {
				showMessageDialog(null, "Du har fått karakteren A! \n Utrolig bra! Dette må feires :]");
			}
			i++;
		}
	}

}
//}
