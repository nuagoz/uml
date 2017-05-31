package uml;

public class Dictionnaire extends Document{
	private String langue;

	public Dictionnaire(int numEnregistrement, String titre, String langue) {
		super(numEnregistrement, titre);
		this.langue = langue;
	}
}
