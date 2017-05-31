package Modèle;

public class Manuel extends Livre{
	private int niveauScolaire;

	public Manuel(int numEnregistrement, String titre, String auteur, int nbPages, int niveauScolaire) {
		super(numEnregistrement, titre, auteur, nbPages);
		this.niveauScolaire = niveauScolaire;
	}

	@Override
	public String toString() {
		return "Manuel [niveauScolaire=" + niveauScolaire + ", numEnregistrement=" + numEnregistrement + ", titre="
				+ titre + ", etagere=" + etagere + "]";
	}

	@Override
	public void imprimer() {
		System.out.println("Imprime..."+toString());
		
	}

}
