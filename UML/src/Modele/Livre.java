package Modele;

public class Livre extends Document implements Imprimable{
	protected String auteur;
	protected int nbPages;
	
	public Livre(int numEnregistrement, String titre, String auteur, int nbPages) {
		super(numEnregistrement, titre);
		this.auteur = auteur;
		this.nbPages = nbPages;
	}

	
	@Override
	public void imprimer() {
		// TODO Auto-generated method stub
		
	}

}
