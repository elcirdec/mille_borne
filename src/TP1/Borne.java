package tp1;

public class Borne extends Carte {
	private int km;
	protected Borne(int km, int numero) {
		super(numero);
	}
	@Override
	public String toString() {
		return "Borne "+km;
	}
}
