package Modèle;

public abstract class Document {
	protected int numEnregistrement;
	protected String titre;
	protected Etagere etagere;
	
	protected Document(int numEnregistrement, String titre) {
		super();
		this.numEnregistrement = numEnregistrement;
		this.titre = titre;
	}
	
	public void setEtagere(Etagere e){
		etagere = e;
	}
}
