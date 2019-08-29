package no.hvl.dat100;

	import static javax.swing.JOptionPane.*;
	import static java.lang.Integer.*;
	
public class Oppgave4 {

		static double skatt0 = 0.0 ;
		static double skatt1 = 0.0093 ; 
		static double skatt2 = 0.0241 ;
		static double skatt3 = 0.1152 ;
		static double skatt4 = 0.1452 ;
		
	public static void main(String[] args) {		 
		
		int inntekt = parseInt(showInputDialog ("Før inn din bruttolønn i dialogboksen")) ;
		
		if (inntekt < 164100) {
			showMessageDialog(null, "Du skatter ingenting, din lønn er \n" + inntekt) ;
		
		} else if (inntekt >= 164101 && inntekt <= 230950) {
			showMessageDialog(null, "Du skatter på skattetrinn 1, skatten din er: \n" + inntekt * skatt1) ;
			
		} else if (inntekt >= 230951 && inntekt <= 580650) {
			showMessageDialog(null, "Du skatter på skattetrinn 2, Skatten din er: \n" + inntekt * skatt2) ;
			
		} else if (inntekt >= 580651 && inntekt <= 934050) {
			showMessageDialog(null, "Du skatter på skattetrinn 3, Skatten din er: \n" + inntekt * skatt3) ;
			
		} else if (inntekt >= 934051) {
			showMessageDialog(null, "Du skatter på skattetrinn 4, Skatten din er: \n" + inntekt * skatt4) ;
			
		}
	}
}
