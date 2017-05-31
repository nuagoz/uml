package uml;

import java.util.ArrayList;

public class Bibliotheque {
	private ArrayList <Etagere> listeEtagere;
	
	public void ajoutEtagere(Etagere etagere){
		listeEtagere.add(etagere);
	}

	public ArrayList<Etagere> getListeEtagere() {
		return listeEtagere;
	}

	public void setListeEtagere(ArrayList<Etagere> listeEtagere) {
		this.listeEtagere = listeEtagere;
	}
}
