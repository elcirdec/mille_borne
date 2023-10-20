package cartes;

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
			return "feu vert";
		case ESSENCE:
			return "essence";
		case CREVAISON:
			return "roue de secours";
		case ACCIDENT:
			return "reparation";
		}
		return retour;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Parade){
			Parade carte = (Parade) obj;
			return type.equals(carte.type);
		}
		return false;
	}
}
