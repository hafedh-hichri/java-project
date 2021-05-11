
import java.util.LinkedList;

//i have changed  Periode to duree !! 

public class Formation {
	private String Nom;
	private int Duree;
	private double Prix;
	protected LinkedList<Matiere> TabMat;
	//protected LinkedList<Formation> TabForm;
	

	// we need a condition for creating a Formation
	
	public Formation(String nom, int duree, double prix, Matiere matiere) {

		// we should check the AjouterMatiere first (not sure why this does not work )

		TabMat = new LinkedList<Matiere>();
		if (AjouterMatiere(matiere)) {
			this.Nom = nom;
			this.Duree = duree;
			this.Prix = prix;
			System.out.println("\najout fait avec succes");
		} else {
			System.out.println("error");
		}
		// TabMat.add(matiere);

	}

	// setters and getters
	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public int getDuree() {
		return Duree;
	}

	public void setDuree(int Duree) {
		this.Duree = Duree;
	}

	public double getPrix() {
		return Prix;
	}

	public void setPrix(double prix) {
		Prix = prix;
	}

	public void AfficherFormation() {
		System.out.println("\nNom Formation : " + this.getNom());
		System.out.println("Duree : " + this.getDuree());
		System.out.println("Prix : " + this.getPrix());

	}

	public boolean AjouterMatiere(Matiere mat) {
		if (TabMat.isEmpty()) { // si le tableau est vide
			TabMat.add(mat);
			return true;
		} else if (this.TabMat.size() < 3) // voir si la taille maximale est atteinte   ( STRICTEMENT INF )
		{
			for (Matiere element : TabMat) {
				if (element.getNom().equals(mat.getNom()))// voir si la matiere existe deja
				{
					System.out.println("la matiere existe deja ! ");
					return false;
				}
			}
			TabMat.add(mat);
			return true;
		} else {
			System.out.println("le Nombre limite des matieres est atteind !");
			return false;
		}
	}

	public void AfficherTousLesMatieres() {
		for (Matiere mat : TabMat)
			mat.AfficherMatiere();
	}

	public void ModifierMatiere(Matiere MatiereAncienne, Matiere MatiereNouveau) {
		for (Matiere mat : TabMat) {
			if (mat.equals(MatiereAncienne)) {
				mat.setCoefficient(MatiereNouveau.getCoefficient());
				mat.setNom(MatiereNouveau.getNom());
			}
		}
	}
	public void SupprimerMatiere(Matiere mat) {
		TabMat.remove(mat);
	}
	
	/* public int SearchNom(String nom, Formation[] form) {
		Integer pos = 0 ;
		for (Formation fr : form) {
			if (fr.getNom().equals(nom)) {
				System.out.println("la formation " +nom +" existe dans la position " + pos.toString());
				return (pos);
			}
			else {
				pos++;
			}
		}
		System.out.println("la formation "+ nom + " n'existe pas ! ");
		return (9999) ;
	}
	*/
	
	
	
	
	

}
