package Modèle;

import java.util.Comparator;

public class ComparateurDoc implements Comparator<Document>{

	@Override
	public int compare(Document doc1, Document doc2) {
		return doc1.titre.compareTo(doc2.titre);
	}
}