import java.util.LinkedList;

public class Matiere {
	private String Nom;
	private int Coefficient;
	protected LinkedList<Matiere> TabMat;

	Matiere(String Nom, int Coefficient) {
		this.Coefficient = Coefficient;
		this.Nom = Nom;
		TabMat = new LinkedList<Matiere>();
	}

//setters and getters
	void setCoefficient(int coef) {
		this.Coefficient = coef;
	}

	void setNom(String Nom) {
		this.Nom = Nom;
	}

	int getCoefficient() {
		return this.Coefficient;
	}

	String getNom() {
		return this.Nom;
	}

	void AfficherMatiere() {
		System.out.println("\nNom Matiere: " + this.getNom());
		System.out.println(" Coefficient : " + this.getCoefficient());
	}

	

}
