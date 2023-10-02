package jeu;

import java.util.Iterator;
import java.util.NoSuchElementException;

import javax.management.RuntimeErrorException;

import tp1.Attaque;
import tp1.Botte;
import tp1.Carte;
import tp1.Parade;
import tp1.Probleme;

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
				System.out.println("jai mis nextEffectuer a " + nextEffectue);
				return carte;
			} else {
				throw new NoSuchElementException();
			}
			
		}
		
		public boolean getNextEffectuer() {
			return nextEffectue;
		}
		
		public void remove() { // suppression de l’élément que l’on vient de passer
			System.out.println("nbCartes vu par remove = " + nbCartes);
			System.out.println("nexeffectuer = "+ nextEffectue);
			if (nbCartes < 1 || !nextEffectue) {
				throw new IllegalStateException();
			}
			nextEffectue = false;
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
			System.out.println("le nombre de cartes passe a "+nbCartes);
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
		
		for(Iterator<Carte> it = sabot.iterator() ; it.hasNext() ;) {
			sabot.piocher();

		}
	}
}
