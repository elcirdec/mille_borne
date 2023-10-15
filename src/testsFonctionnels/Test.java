package testsFonctionnels;

import static org.junit.jupiter.api.Assertions.*;

import cartes.*;
import jeu.Sabot;

class Test {

	@org.junit.jupiter.api.Test
	void testA() {
		Sabot sabot= new Sabot(7);
		Attaque accident= new Attaque(Probleme.Type.ACCIDENT,3);
		Parade reparation= new Parade(Probleme.Type.ACCIDENT,3);
		Botte asDuVolant= new Botte(Probleme.Type.ACCIDENT,1);
		sabot.ajouterFamilleCarte(accident,reparation,asDuVolant);
		
		for(int i = 0 ; sabot.iterator().hasNext() ; i++) {
			sabot.piocher();
			
		}
		fail("Not yet implemented");
	}
}
