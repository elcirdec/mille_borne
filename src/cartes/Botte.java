package cartes;

public class Botte extends Probleme {

	public Botte(Type type, int nombre) {
		super(type, nombre);
	}

	
	public boolean equals(Object obj) {
		if(obj instanceof Botte){
			Botte carte = (Botte) obj;
			return type.equals(carte.type);
		}
		return false;
	}

}
