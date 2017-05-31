package Controleur;

import java.util.ArrayList;

import Mod�le.Bibliotheque;
import Mod�le.Document;
import Mod�le.Etagere;
import Mod�le.Manuel;
import Mod�le.Revue;
import Mod�le.Roman;

public class Main {
	
	public static void main(String[] args) {
		Bibliotheque bibliotheque = new Bibliotheque();
		
		ArrayList<Document> liste = new ArrayList<Document>();
		Etagere etagere = new Etagere(liste, 4);
		
		Roman l1 = new Roman(1,"Hello","Zo�", 56, null);
		Roman l2 = new Roman(2,"Goodbye", "Adja", 75, "Goncourt");
		Manuel l3 = new Manuel(3,"UML pour les nuls", "prof", 89, 3);
		
		Revue r1 = new Revue(4,"Hzfedbq", 8, 1997);
		
		
		etagere.ajoutDocument(l1);
		etagere.ajoutDocument(r1);
		etagere.ajoutDocument(l3);
		etagere.ajoutDocument(l2);
		
		etagere.listerDocuments();
		
		/*etagere.rechercherDocument("Hello");
		etagere.rechercherDocument("Adja");*/
		System.out.println("apr�s tri");
		etagere.tri();
		etagere.listerDocuments();
		System.out.println("--------");
		l3.imprimer();
	}

}
