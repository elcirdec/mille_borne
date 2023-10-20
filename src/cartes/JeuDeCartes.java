package cartes;
import java.util.*;

public class JeuDeCartes {
	static Botte asDuVolant= new Botte(Probleme.Type.ACCIDENT,1);
	static Botte increvable= new Botte(Probleme.Type.CREVAISON,1);
	static Botte citerneEssence= new Botte(Probleme.Type.ESSENCE,1);
	static Botte vehiculePrio= new Botte(Probleme.Type.FEU,1);

	static DebutLimite debutLimite= new DebutLimite(4);
	static Attaque feuRouge= new Attaque(Probleme.Type.FEU,5);
	static Attaque panneEssence= new Attaque(Probleme.Type.ESSENCE,3);
	static Attaque crevaison= new Attaque(Probleme.Type.CREVAISON,3);
	static Attaque accident= new Attaque(Probleme.Type.ACCIDENT,3);

	
	static FinLimite finLimite= new FinLimite(6);
	static Parade feuVert= new Parade(Probleme.Type.FEU,14);
	static Parade essence= new Parade(Probleme.Type.ESSENCE,6);
	static Parade RoueDeSecours= new Parade(Probleme.Type.CREVAISON,6);
	static Parade reparation= new Parade(Probleme.Type.ACCIDENT,6);

	static Borne borne25= new Borne(25, 10);
	static Borne borne50= new Borne(50, 10);
	static Borne borne75= new Borne(75, 10);
	static Borne borne100= new Borne(100, 12);
	static Borne borne200= new Borne(200, 4);
	
	static private Carte[] typesDeCarte= new Carte[] {asDuVolant,increvable,citerneEssence,
			vehiculePrio,debutLimite,feuRouge,panneEssence,crevaison,accident,
			finLimite,feuVert,essence,RoueDeSecours,reparation,borne25,borne50
			,borne75,borne100,borne200} ; 

	List<Carte> listeCartes = new ArrayList<Carte>();

	public JeuDeCartes() {
		Arrays.asList(listeCartes);
		for(int i = 0; i<typesDeCarte.length; i++ ) {
			for(int j = 0; j<typesDeCarte[i].getNombre(); j++ ) {
				listeCartes.add(typesDeCarte[i]);
			}
		}
		System.out.println("The list is: " + listeCartes);
	}

	public static void main(String[] argv) {
		JeuDeCartes jeuDeCarte = new JeuDeCartes();

		}

}
