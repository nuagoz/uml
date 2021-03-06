package Controleur;

import java.util.ArrayList;

import Modele.Bibliotheque;
import Modele.Document;
import Modele.Etagere;
import Modele.Manuel;
import Modele.Revue;
import Modele.Roman;

public class Main {
	
	public static void main(String[] args) {
		Bibliotheque bibliotheque = new Bibliotheque();
		
		ArrayList<Document> liste = new ArrayList<Document>();
		Etagere etagere = new Etagere(liste, 4);
		
		Roman l1 = new Roman(1,"Hello","Zo�", 56, null);
		Roman l2 = new Roman(2,"Goodbye", "Adja", 75, "Goncourt");
		Manuel l3 = new Manuel(3,"UML", "Etienne", 89, 3);
		
		Revue r1 = new Revue(4,"Science et vie", 8, 1997);
		
		etagere.ajoutDocument(l1);
		etagere.ajoutDocument(r1);
		etagere.ajoutDocument(l3);
		etagere.ajoutDocument(l2);
		
		etagere.listerDocuments();
		
		etagere.rechercherDocument("Hello");
		etagere.rechercherDocument("Adja");
		System.out.println("--------");
		
		System.out.println("Etag�re tri�e ");
		etagere.tri();
		etagere.listerDocuments();
		System.out.println("--------");
		etagere.imprimer();
		
		etagere.rechercherDocument("");
	}

}
