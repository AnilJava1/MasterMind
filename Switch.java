package MasterMind;

public class Switch {

		public static void main (String[] args) {
			
			String kleur = "blauw";
			switch(kleur) {
			case "blauw":
				System.out.println("correcte kleur, kies nog een x ");
			break;
			case "bruin":
				System.out.println("correcte kleur, kies nog een x ");
				break;
			case "rood":
				System.out.println("correcte kleur, kies nog een x ");
					break;
			case "paars":
				System.out.print("correcte kleur, kies nog een x ");
				break;
			default:
				System.out.println("Incorrecte keuze, probeer nog een keer. Welke kleur wil je proberen?");
							
			}
		
		}

	}

	/* Wat ik hier zou willen zijn de volgende opties:
	 * 	- de kleur wordt onthouden;
	 * 	- Er wordt aangegeven hoe vaak iemand nog mag kiezen;
	 *  - het zou fijn zijn als in de console een keuze ingegeven kan worden zoals met galgje is gedaan.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * De switch statement test de code en voert het uit als het klopt. Als het niet klopt kan je aangeven dat het een default gegenereerd antwoord zou moeten
	 * krijgen.

	*/

