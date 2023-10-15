package cartes;

public class FinLimite extends Carte{
	int nombre;
	public FinLimite(int nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		return "Fin limite";
	}
}
