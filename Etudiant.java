import java.util.LinkedList;

public class Etudiant extends Participant {
	private String NumInscription;
	private String Etablissement;

	Etudiant(String CIN, String Nom, String Prenom, String dateNaissance, String Adresse, Formation Formation,
			String numI, String Etab) {

		super(CIN, Nom, Prenom, dateNaissance, Adresse, Formation);
		this.NumInscription = numI;
		this.Etablissement = Etab;

		double price;
		for (Formation form : TabFormation) { // reduction de 30% des etudiants
			price = form.getPrix() * 0.7;
			form.setPrix(price);
		}
	}

	public String getNumInscription() {
		return NumInscription;
	}

	public void setNumInscription(String numInscription) {
		NumInscription = numInscription;
	}

	public String getEtablissement() {
		return Etablissement;
	}

	public void setEtablissement(String etablissement) {
		Etablissement = etablissement;
	}

}
