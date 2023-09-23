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

	public Iterator iterator() {
		return new Iterateur();
	}

	private class Iterateur implements Iterator{
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
				return carte;
			} else {
				throw new NoSuchElementException();
			}
		}
		public void remove() { // suppression de l’élément que l’on vient de passer
			if (nbCartes < 1 || !nextEffectue) {
				throw new IllegalStateException();
			}
			for (int i = indiceIterateur - 1; i < nbCartes - 1; i++) {
				tabCarte[i] = tabCarte[i + 1];
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
		}
	}

	public void ajouterFamilleCarte(Carte carte) {

		for(int i = 0 ; i < carte.getNombre() ;i++) {
			ajouterCarte(carte);
			System.out.println("1"+carte);
		}

	}

	public void ajouterFamilleCarte(Carte... tab) {

		for(int i = 0 ; i < tab[i].getNombre() ;i++) {
			ajouterCarte(tab[i]);
			System.out.println("2"+carte);
		}
	}



	public String piocher() {
		String carteString = iterator().next().toString();
		this.iterator().remove();
		return "Je pioche "+carteString;
	}


	public static void main(String[] args) {
		Sabot sabot= new Sabot(7);
		Attaque accident= new Attaque(Probleme.Type.ACCIDENT,3);
		Parade reparation= new Parade(Probleme.Type.ACCIDENT,3);
		Botte asDuVolant= new Botte(Probleme.Type.ACCIDENT,1);
		sabot.ajouterFamilleCarte(accident,reparation,asDuVolant);
		System.out.println(accident.toString());
	}
}
