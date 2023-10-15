package testsFonctionnels;

import java.util.Iterator;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import tp1.Attaque;
import tp1.Borne;
import tp1.Botte;
import tp1.Parade;
import tp1.Probleme;

class CarteEqualsTests {

	Attaque accident1= new Attaque(Probleme.Type.ACCIDENT,3);
	Parade reparation1= new Parade(Probleme.Type.ACCIDENT,3);
	Botte asDuVolant1= new Botte(Probleme.Type.ACCIDENT,1);
	Borne borne= new Borne(200, 3);

	Attaque accident2= new Attaque(Probleme.Type.ACCIDENT,1);
	Parade reparation2= new Parade(Probleme.Type.ACCIDENT,2);
	Botte asDuVolant2= new Botte(Probleme.Type.ACCIDENT,3);
	Borne borne2= new Borne(200, 5);

	Attaque accident3= new Attaque(Probleme.Type.CREVAISON,1);
	Parade reparation3= new Parade(Probleme.Type.ESSENCE,2);
	Botte asDuVolant3= new Botte(Probleme.Type.FEU,3);
	Borne borne3= new Borne(2010, 5);


	@Test
	void testAccident() {
		assertTrue(accident1.equals(accident2));
		assertFalse(accident1.equals(accident3));
	}

	@Test
	void testReparation() {
		assertTrue(reparation1.equals(reparation2));
		assertFalse(reparation1.equals(reparation3));
	}

	@Test
	void testAsDuVolant() {
		assertTrue(asDuVolant1.equals(asDuVolant2));
		assertFalse(asDuVolant1.equals(asDuVolant3));
	}

	@Test
	void testBorne() {
		assertTrue(borne.equals(borne2));
		assertFalse(borne.equals(borne3));
	}

}


