package nintendo.test;


import nintendo.model.Client;
import nintendo.model.Boutique;
import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		Console ps = new Console("Play Station");
		Console xbox = new Console("Xbox");
		Console wiiu = new Console("WiiU");
		
		Jeu jeu1 = new Jeu("Crimson Desert",ps);
		Jeu jeu2 = new Jeu("Expédition 33",xbox);
		Jeu jeu3 = new Jeu("Mario Party",wiiu);
		Jeu jeu4 = new Jeu("Mario 64",wiiu);
		Jeu jeu5 = new Jeu("Zelda: Breath of the wild",wiiu);
		

		Client client1 = new Client("Jean-Claude", "Van Damme");
		Client client2 = new Client("Bernard", "L'Hermite");
		
		
		Boutique boutique1 = new Boutique("Micromania","2","Rue de Paris", "Lille");
		

	}

}
