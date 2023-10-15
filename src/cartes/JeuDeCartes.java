package cartes;
import java.util.*;

public class JeuDeCartes {
	Botte asDuVolant= new Botte(Probleme.Type.ACCIDENT,1);
	Botte increvable= new Botte(Probleme.Type.CREVAISON,1);
	Botte citerneEssence= new Botte(Probleme.Type.ESSENCE,1);
	Botte vehiculePrio= new Botte(Probleme.Type.FEU,1);
	
	DebutLimite debutLimite= new DebutLimite(4);
	Attaque feuRouge= new Attaque(Probleme.Type.FEU,5);
	Attaque panneEssence= new Attaque(Probleme.Type.ESSENCE,3);
	Attaque crevaison= new Attaque(Probleme.Type.CREVAISON,3);
	Attaque accident= new Attaque(Probleme.Type.ACCIDENT,3);
	
	FinLimite finLimite= new FinLimite(6);
	Parade feuVert= new Parade(Probleme.Type.FEU,14);
	Parade essence= new Parade(Probleme.Type.ESSENCE,6);
	Parade RoueDeSecours= new Parade(Probleme.Type.CREVAISON,6);
	Parade reparation= new Parade(Probleme.Type.ACCIDENT,6);
	
	Borne borne25= new Borne(25, 10);
	Borne borne50= new Borne(50, 10);
	Borne borne75= new Borne(75, 10);
	Borne borne100= new Borne(100, 12);
	Borne borne200= new Borne(200, 4);
	
	private Carte[] typesDeCarte= new Carte[] {asDuVolant,increvable,citerneEssence,
			vehiculePrio,debutLimite,feuRouge,panneEssence,crevaison,accident,
			finLimite,feuVert,essence,RoueDeSecours,reparation,borne25,borne50
			,borne75,borne100,borne200} ; 
	
	List<Carte> listeCartes = new ArrayList<Carte>();
	
	public JeuDeCartes() {
		Arrays.asList(listeCartes);
	}
}
