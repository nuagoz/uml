package Modèle;

public class Roman extends Livre{
	private String prixLitteraire;

	public Roman(int numEnregistrement, String titre, String auteur, int nbPages, String prixLitteraire) {
		super(numEnregistrement, titre, auteur, nbPages);
		this.prixLitteraire = prixLitteraire;
	}

	@Override
	public String toString() {
		return "Roman [prixLitteraire=" + prixLitteraire + ", numEnregistrement=" + numEnregistrement + ", titre="
				+ titre + "]";
	}

	@Override
	public void imprimer() {
		System.out.println("Imprime..."+toString());
		
	}
}
