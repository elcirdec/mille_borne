package tp1;

public abstract class Probleme extends Carte {
	public enum Type {FEU,ESSENCE,CREVAISON,ACCIDENT};
	protected Type type;
	
	public Probleme(Type type,int nombre) {
		super(nombre);
	}
}
