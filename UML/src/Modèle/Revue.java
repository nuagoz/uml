package Modèle;

public class Revue extends Document{
	private int mois;
	private int annee;
	
	@Override
	public String toString() {
		return "Revue [mois=" + mois + ", annee=" + annee + ", numEnregistrement=" + numEnregistrement + ", titre="
				+ titre + "]";
	}
	public Revue(int numEnregistrement, String titre, int mois, int annee) {
		super(numEnregistrement, titre);
		this.mois = mois;
		this.annee = annee;
	}
}