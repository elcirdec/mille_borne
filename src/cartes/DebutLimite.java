package cartes;

public class DebutLimite extends Carte {
	int nombre;
	public DebutLimite(int nombre) {
		super(nombre);
	}
	@Override
	public String toString() {
		return "Debut limite";
	}
}
