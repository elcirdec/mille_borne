package testsFonctionnels;

import jeu.Sabot;
import tp1.Attaque;
import tp1.Botte;
import tp1.Parade;
import tp1.Probleme;

public class essaie {

	public static void main(String[] args) {
		Sabot sabot= new Sabot(7);
		Attaque accident= new Attaque(Probleme.Type.ACCIDENT,3);
		Parade reparation= new Parade(Probleme.Type.ACCIDENT,3);
		Botte asDuVolant= new Botte(Probleme.Type.ACCIDENT,1);
		sabot.ajouterFamilleCarte(accident,reparation,asDuVolant);
		
		for(int i = 0 ; sabot.iterator().hasNext() ; i++) {
			sabot.piocher();
			
		}

	}

}
