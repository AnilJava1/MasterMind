package MasterMind;

class MasterMind {

	public static void main(String[] args) {
		

	}

}


/* hier ga ik mastermind maken. (Gekozen kleuren: blauw, bruin, geel, paars.)
- 	Stap 1: wat is mastermind? Bij Mastermind zijn er 2 spelers. 1 speler moet de kleuren van de ballen en
	en de plek op het bord raden waar speler 2 de ballen heeft neergezet. Het spel speelt in 12 rondes.
	Speler 2 heeft dus een volgorde en kleur van de ballen gekozen. Speler 2 dient dan in maximaal 12x
	te raden op welke plek een bal met dezelfde kleur staat die speler 1 heeft gekozen.
	
	Stap 2: Wat is er nodig?
	- Het spel moet 12x te spelen zijn. Na de 12e keer moet het spel stoppen.
	- Wanneer de juiste volgorde van de 4 ballen geraden is moet het spel ook stoppen.
	- Het is van belang dat het systeem onthoud welke bal met bijbehorde kleur is gekozen.
	
	Stap 3: Hoe ga je dit doen?
	- 	Sowieso is het van belang dat er een herhaling in het systeem zit waardoor het spel 12x te spelen is.
	- 	Ik heb geen 'toevalligheidsgenerator' nodig aangezien ik zelf de kleuren en de locatie van de
		ballen kies. Maar, ik ga het niet met ballen doen. Ik doe het met de cijfers: 1357
	- 	Daarnaast is het van belang dat er iets in zit in de trant van:
		Keuze 1: cijfer 1 op plek 1, cijfer 3 op plek 2, cijfer 5 op plek 3 en cijfer 7 op plek 4.
		--> 2 cijfers staan op de juiste plek, 1 cijfer hoort in de rij, 1 cijfer niet--> kies nog een keer.
		Keuze 2: etc....

	Stap 4: Waarmee te beginnen?
	-	Je hebt dus een herhalende interactie nodig die 12x loopt maar bij elke onjuiste instantie aangeeft
		dat de speler nog een keer mag raden.
	-	Daarnaast is het van belang dat na de 12x het spel stopt.
	-	Tevens is het van belang dat wanneer de juiste cijfer is gekozen, dit wordt aangegeven.
	-	Alsook is het van belang dat er wordt aangegeven dat het cijfer op een verkeerde plek staat 
		(Vb. cijfer 1 is juist en staat op de juiste plek maar 3 niet.
		
	Stap 1: Begin met de loop.

	
*/ 