package Tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Modele.Document;
import Modele.Etagere;
import Modele.Roman;

public class EtagereTest {

	@Test
	public void testAjoutDocument() {
		
		ArrayList <Document> liste = new ArrayList<Document>();
		Etagere etagere = new Etagere(liste, 5);
		
		Roman livre1 = new Roman(2,"Goodbye", "Adja", 75, "Goncourt");
		
		etagere.ajoutDocument(livre1);
		
		assertEquals(etagere.getListeDocuments().size(), 1);
	}
}
