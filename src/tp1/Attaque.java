package tp1;

public class Attaque extends Probleme {

	public Attaque(Type type, int nombre) {
		super(type,nombre);
	}
	
	@Override
	public String toString() {
		Type type=this.type;
		String retour ="choix incorrect";
		switch(type) {
		case FEU:
			retour = "feu rouge";
		case ESSENCE:
			retour = "Panne essence";
		case CREVAISON:
			retour = "crevaison";
		case ACCIDENT:
			retour = "accident";
		}
		return retour;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Attaque){
			Attaque carte = (Attaque) obj;
			return type.equals(carte.type);
		}
		return false;
	}
}
