package cartes;

import cartes.Probleme.Type;

public class Probleme extends Carte {
	public enum Type {FEU,ESSENCE,CREVAISON,ACCIDENT};
	protected Type type;
	
	public Probleme(Type type,int nombre) {
		super(nombre);
		this.type=type;
	}

	
	public Type getType() {
		return type;
	}

	public String toString() {
		String retour ="choix incorrect";
		switch(type) {
		case FEU:
			return "vehicule prioritaire";
		case ESSENCE:
			return "citerne d'essence";
		case CREVAISON:
			return "increvable";
		case ACCIDENT:
			return "as du volant";
		}
		return retour;
	}
}
