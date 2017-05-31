package Modele;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Classe Etagere
 * @author Etienne
 * @version 1.0
 */
public class Etagere implements Imprimable{
	private ArrayList <Document> listeDocuments;
	private int nbDocMax;
	
	/**
	 * Constructeur de la classe Etagere
	 * @param listeDocuments ArrayList de Document
	 * @param nbDocMax Nombre max de documents que l'�tag�re peut contenir
	 */
	public Etagere(ArrayList<Document> listeDocuments, int nbDocMax) {
		this.listeDocuments = listeDocuments;
		this.nbDocMax = nbDocMax;
	}
	
	/**
	 * Ajoute un document � l'�tag�re
	 * @param doc Document
	 */
	public void ajoutDocument(Document doc){
		if(listeDocuments.size() < nbDocMax)
			listeDocuments.add(doc);
		doc.setEtagere(this);
	}
	
	/**
	 * Fonction qui permet de lister les documents pr�sents dans l'�tag�re
	 */
	public void listerDocuments(){
		System.out.println(toString());
	}
	
	/**
	 * Fonction qui permet de rechercher un document par le nom d'auteur. Uniquement possible avec
	 * des instances de la classe Livre
	 * @param auteur Le nom de l'auteur du livre
	 */
	public void rechercherDocument(String auteur){
		
		for (int i=0; i<listeDocuments.size();i++)
        {
            if(listeDocuments.get(i) instanceof Livre && ((Livre) listeDocuments.get(i)).auteur.equals(auteur))
                System.out.print(listeDocuments.get(i));
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

	/**
	 * Getter de l'ArrayList qui contient les documents de l'�tag�re
	 * @return listeDocuments ArrayList de documents
	 */
	public ArrayList<Document> getListeDocuments() {
		return listeDocuments;
	}

	/**
	 * Setter de l'ArrayList qui contient les documents de l'�tag�re
	 * @param listeDocuments ArrayList de Documents
	 */
	public void setListeDocuments(ArrayList<Document> listeDocuments) {
		this.listeDocuments = listeDocuments;
	}
	
	/**
	 * Getter de la variable nbDocMax
	 * @return nbDocMax Nombre max de documents que l'�tag�re peut contenir
	 */
	public int getNbDocMax() {
		return nbDocMax;
	}

	/**
	 * Setter de la variable nbDocMax
	 * @param nbDocMax int
	 */
	public void setNbDocMax(int nbDocMax) {
		this.nbDocMax = nbDocMax;
	}
	
	/**
	 * Fonction de tri de l'ArrayList des documents de l'�tag�re par titre (en ordre alphabetique)
	 */
	public void tri(){
		Collections.sort(listeDocuments, new ComparateurDoc());
	}

	@Override
	public void imprimer() {
        for (int i = 0; i < listeDocuments.size(); i++)
        {
            if(listeDocuments.get(i) instanceof Livre)
                System.out.print(listeDocuments.get(i));
        }
	}
}
