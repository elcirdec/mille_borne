package cartes;

public class Borne extends Carte {
	private int km;
	public Borne(int km, int numero) {
		super(numero);
		this.km=km;
	}
	@Override
	public String toString() {
		return "Borne "+km;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Borne){
			Borne carte = (Borne) obj;
			return km == carte.km;
		}
		return false;
	}
}
