package tp1;

public abstract class Carte {
	protected int nombre;
	protected Carte(int numero) {
		this.nombre=numero;
	}
	/**
	 * @return the nombre
	 */
	public int getNombre() {
		return nombre;
	}

	
}
