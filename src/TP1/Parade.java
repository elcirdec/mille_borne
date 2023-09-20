package tp1;

public class Parade extends Probleme{
	public Parade(Type type,int nombre) {
		super(type,nombre);
	}
	@Override
	public String toString() {
		Type type=this.type;
		String retour ="choix incorrect";
		switch(type) {
		case FEU:
			retour = "feu vert";
		case ESSENCE:
			retour = "essence";
		case CREVAISON:
			retour = "roue de secours";
		case ACCIDENT:
			retour = "reparation";
		}
		return retour;
	}
}
