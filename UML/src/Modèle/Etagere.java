package Modèle;

import java.util.ArrayList;
import java.util.Collections;

public class Etagere {
	private ArrayList <Document> listeDocuments;
	private int nbDocMax;
	
	/**
	 * 
	 * @param listeDocuments
	 * @param nbDocMax
	 */
	public Etagere(ArrayList<Document> listeDocuments, int nbDocMax) {
		this.listeDocuments = listeDocuments;
		this.nbDocMax = nbDocMax;
	}
	
	public void ajoutDocument(Document doc){
		if(listeDocuments.size() < nbDocMax)
			listeDocuments.add(doc);
		doc.setEtagere(this);
	}
	
	public void listerDocuments(){
		System.out.println(toString());
	}
	
	/**
	 * 
	 * @param auteur Le nom de l'auteur du livre
	 */
	public void rechercherDocument(String auteur){
		boolean trouve = false;
		ArrayList<Livre> livres = new ArrayList<Livre>();
		for (Document doc : listeDocuments){
			if (doc instanceof Livre){
				livres.add((Livre) doc);
				}
		}
		for (Livre l : livres){
			if (l.auteur == auteur){
				System.out.println(l.toString());
				trouve = true;
				break;
			}
		if (!trouve)
			System.out.println("Il n' y a pas de document de l'auteur " + auteur);
			
		}
	
	}
	

	@Override
	public String toString() {
		String liste = "";
		for (Document doc : listeDocuments) {
			liste += "Titre : "+ doc.titre+"\n";
			liste += "Num enregistrement " + doc.numEnregistrement+"\n";
			liste += "\n";
		}
		
		return "Etagere [listeDocuments=" + liste + ", nbDocMax=" + nbDocMax + "]";
	}

	public ArrayList<Document> getListeDocuments() {
		return listeDocuments;
	}

	public void setListeDocuments(ArrayList<Document> listeDocuments) {
		this.listeDocuments = listeDocuments;
	}

	public int getNbDocMax() {
		return nbDocMax;
	}

	public void setNbDocMax(int nbDocMax) {
		this.nbDocMax = nbDocMax;
	}
	
	public void tri(){
		Collections.sort(listeDocuments, new ComparateurDoc());
	}
}
