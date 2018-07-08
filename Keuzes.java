package MasterMind;

public class Keuzes {
public static void main(String[] args) {
		
		int a = 1;
		int b = 3;
		int c = 5;
		int d = 7;
		
		
		if (a == 1  || b == 3 || c == 5  || d == 7)
			System.out.println("1 van de 4 kleuren is goed.");					
		
		else if (a == 1 && b == 3 && c == 5 && d ==7)
			System.out.println("alle 4 de kleuren zijn goed.");
		
		else
			System.out.println("De kleuren zijn niet goed.");
		

		}


}
	
	
	// Het probleem wat ik nu heb is dat er 24 opties zijn... Ik weet niet hoe ik aan kan geven dat 1 van de kleuren goed is, of a, of b, of c, of d.
// plus, wat gebeurt er nu als a b en c worden geraden maar niet d?
	


