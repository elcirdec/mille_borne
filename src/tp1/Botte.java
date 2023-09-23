package tp1;

public class Botte extends Probleme {

	public Botte(Type type, int nombre) {
		super(type, nombre);
	}
	@Override
	public String toString() {
		Type type=this.type;
		String retour ="choix incorrect";
		switch(type) {
		case FEU:
			retour = "vehicule prioritaire";
		case ESSENCE:
			retour = "citerne d'essence";
		case CREVAISON:
			retour = "increvable";
		case ACCIDENT:
			retour = "as du volant";
		}
		return retour;
	}

}
