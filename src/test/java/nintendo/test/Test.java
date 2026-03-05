package nintendo.test;


import nintendo.model.Client;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import nintendo.model.Boutique;
import nintendo.model.Hybride;
import nintendo.model.Jeu;
import nintendo.model.Salon;


public class Test {

	public static void main(String[] args) {
		Salon ps = new Salon("Play Station",200.0,LocalDate.of(2015,01,01));
		Salon xbox = new Salon("Xbox", 150.0,LocalDate.of(2018,01,01));
		Hybride wiiu = new Hybride("WiiU",120.0, LocalDate.of(2012,01,01));
		
		Client client1 = new Client("Jean-Claude", "Van Damme");
		Client client2 = new Client("Bernard", "L'Hermite");
		
		
		Boutique boutique1 = new Boutique("Micromania","2","Rue de Paris", "Lille");


		Jeu jeu1 = new Jeu("Crimson Desert",ps, boutique1);
		Jeu jeu2 = new Jeu("Expédition 33",xbox, boutique1);
		Jeu jeu3 = new Jeu("Mario Party",wiiu, boutique1);
		Jeu jeu4 = new Jeu("Mario 64",wiiu, boutique1);
		Jeu jeu5 = new Jeu("Zelda: Breath of the wild",wiiu, boutique1);
		

		List<Jeu> listeAchat1 = new ArrayList<>();
        listeAchat1.add(jeu3);
        listeAchat1.add(jeu5);

        client1.setAchatClient(listeAchat1);

	}

}
