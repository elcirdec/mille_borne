package jeu;

import java.util.Iterator;
import java.util.NoSuchElementException;

import javax.management.RuntimeErrorException;

import cartes.Attaque;
import cartes.Borne;
import cartes.Botte;
import cartes.Carte;
import cartes.Parade;
import cartes.Probleme;

public class Sabot implements Iterable{
	private Carte carte;
	private int nbCartes=0;
	private Carte[] tabCarte; 

	public Sabot(int nombre) {
		this.tabCarte = new Carte[nombre];
	}

	public Iterator<Carte> iterator() {
		return new Iterateur();
	}

	private class Iterateur implements Iterator<Carte>{
		private int indiceIterateur = 0;
		private boolean nextEffectue = false;

		public boolean hasNext() {
			return indiceIterateur < tabCarte.length;
		}

		public Carte next() {
			if (hasNext()) {
				Carte carte = tabCarte[indiceIterateur];
				indiceIterateur++;
				nextEffectue = true;
//				System.out.println("jai mis nextEffectuer a " + nextEffectue);
				return carte;
			} else {
				throw new NoSuchElementException();
			}

		}

		public boolean getNextEffectuer() {
			return nextEffectue;
		}

		public void remove() { // suppression de l’élément que l’on vient de passer
			//			System.out.println("nbCartes vu par remove = " + nbCartes);
			//			System.out.println("nexeffectuer = "+ nextEffectue);
			if (nbCartes < 1 || !nextEffectue) {
				throw new IllegalStateException();
			}
			for (int i = indiceIterateur - 1; i < nbCartes - 1; i++) {
				tabCarte[i] = tabCarte[i+1];
			}
			nextEffectue = false;
//			System.out.println("jai mis nextEffectuer a " + nextEffectue);
			indiceIterateur--; // indice du prochain élément à visiter (s’il existe)
			nbCartes--;
		}
	}

	public boolean estVide() {
		return nbCartes>0;
	}

	private void ajouterCarte(Carte carte) {
		if(nbCartes > tabCarte.length) {
			throw new RuntimeException("Depassement de capacite du tableau");
		}else {
			tabCarte[nbCartes] = carte;
			nbCartes++;
			System.out.println("j'ai ajouter la carte "+carte);
			//			System.out.println("le nombre de cartes passe a "+nbCartes);
		}
	}

	public void ajouterFamilleCarte(Carte carte) {
		System.out.println("ajout simple");
		for(int i = 0 ; i < carte.getNombre() ;i++) {
			ajouterCarte(carte);
		}

	}

	public void ajouterFamilleCarte(Carte... tab) {

		for(int i = 0 ; i < tab.length ;i++) {
			for (int j = 0; j < tab[i].getNombre() ; j++) {
				ajouterCarte(tab[i]);
			}
		}
	}



	public String piocher() {
		Iterator<Carte> it=this.iterator();
		if(!it.hasNext()) {
			throw new RuntimeException("hasnext");

		}
		Carte carte1 = it.next();
		it.remove();
		//		System.out.println("next effectuer apres le apres = "+((Iterateur) (it)).getNextEffectuer());
		return "Je pioche "+ carte1.toString();
	}

	public static void main(String[] args) {
		Sabot sabot= new Sabot(7);
		Attaque accident= new Attaque(Probleme.Type.ACCIDENT,3);
		Parade reparation= new Parade(Probleme.Type.ACCIDENT,3);
		Botte asDuVolant= new Botte(Probleme.Type.ACCIDENT,1);
		sabot.ajouterFamilleCarte(accident,reparation,asDuVolant);
		System.out.println(sabot.nbCartes);
		for(int i=0 ;i<sabot.nbCartes ;) {
			System.out.println(sabot.piocher());

		}
		
		Attaque accident1= new Attaque(Probleme.Type.ACCIDENT,3);
		Parade reparation1= new Parade(Probleme.Type.ACCIDENT,3);
		Botte asDuVolant1= new Botte(Probleme.Type.ACCIDENT,1);
		Borne borne= new Borne(200, 3);
		
		Attaque accident2= new Attaque(Probleme.Type.ACCIDENT,1);
		Parade reparation2= new Parade(Probleme.Type.ACCIDENT,2);
		Botte asDuVolant2= new Botte(Probleme.Type.ACCIDENT,3);
		Borne borne2= new Borne(200, 5);
		
		Attaque accident3= new Attaque(Probleme.Type.CREVAISON,1);
		Parade reparation3= new Parade(Probleme.Type.ESSENCE,2);
		Botte asDuVolant3= new Botte(Probleme.Type.FEU,3);
		Borne borne3= new Borne(2010, 5);
		
		System.out.println(accident1.equals(accident2));
		System.out.println(accident1.equals(accident3));
		
		System.out.println(reparation1.equals(reparation2));
		System.out.println(reparation1.equals(reparation3));
		
		System.out.println(asDuVolant1.equals(asDuVolant2));
		System.out.println(asDuVolant1.equals(asDuVolant3));
		
		System.out.println(borne.equals(borne2));
		System.out.println(borne.equals(borne3));
		
	}
}
