package MasterMind;

public class Loop {

	public static void main(String[] args)								// dit is de applicatie die verantwoordelijk is voor het opstarten, dus 1x gebruiken. dit is dus het begin touwtje waaruoit de hele applicatie zich ontvouwt.
	{
		for (int i = 0; i < 13; i++)
		{
		if (i == 1) System.out.println("I heeft inderdaad kleur 1");
		if (i == 3)	System.out.println("I heeft inderdaad kleur 3");
		if (i == 5)	System.out.println("I heeft inderdaad kleur 5");
		if (i == 7)	System.out.println("I heeft inderdaad kleur 7");
		
		
		}
	
	}

}



/* De gekozen cijfers zijn: 1 3 5 7 
Wat ik  nu mis is de optie om een keuze van een cijfer tussen 1 = 12 aan te geven, waarvan 4 dus correct zouden zijn.

Stap 1: Wat nu bij de loop van belang is, is een if statement gebruiken die 12x gebruikt mag worden. Het is namelijk zo dat speler 2, in totaal 12x mag raden. 
 * 	Check.
 Stap 2: De speler mag kleuren raden... Ga verder in de class: Switch.

Wanneer dat werkt, voeg dan het volgende toe: als de juiste / foutieve kleur geraden is mag diegene nog
door.







*/