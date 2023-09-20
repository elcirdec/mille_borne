package jeu;

import javax.management.RuntimeErrorException;

import tp1.Carte;

public class Sabot implements Iterable<E>{
	private Carte carte;
	private int nbCartes=0;
	private Carte[] tabCarte; 
	private int indiceIterateur = 0;

	public Sabot(int nombre) {
		this.tabCarte = new Carte[nombre];
	}
	
	public boolean hasNext() {
		 return indiceIterateur < tabCarte.length;
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
		}

	}
	
	public void ajouterFamilleCarte(Carte... tab) {
		
		for(int i = 0 ; i < tab.length ;i++) {
			ajouterCarte(tab[i]);
		}
	}
	
	
}
