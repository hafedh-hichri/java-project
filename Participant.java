import java.util.LinkedList;

public class Participant {

	protected String CIN;
	protected String Nom;
	protected String Prenom;
	protected String dateNaissance;
	protected String Adresse;
	protected LinkedList<Formation> TabFormation;
	protected int Note[]= new int [10];

	Participant(String CIN, String Nom, String Prenom, String dateNaissance, String Adresse, Formation Formation) {
		this.Adresse = Adresse;
		this.CIN = CIN;
		this.dateNaissance = dateNaissance;
		this.Nom = Nom;
		this.Prenom = Prenom;
		TabFormation = new LinkedList<Formation>();
		TabFormation.add(Formation);

	}

	// setters and getters
	public String getCIN() {
		return CIN;
	}

	public void setCIN(String CIN) {
		this.CIN = CIN;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public int getNote(int i ) {
		if (i < TabFormation.size()) {
			return Note[i];}
		else {
			System.out.println("position non valide ");
			System.out.println("numero doit etre < "+TabFormation.size());
			return 0 ;
		}
	}
	public LinkedList<Formation> getFormation() {
		return TabFormation;
	}

	public void setNote(int note, int i ) {
		
		if (i < TabFormation.size()) {
			Note[i] = note;}
		else {
			System.out.println("position non valide ");
			System.out.println("numero doit etre < "+TabFormation.size());
		}
	}

	public void SupprimerFormation(Formation form) {
		TabFormation.remove(form);
	}

	public void AfficherTabFormation() {
		for (Formation form : TabFormation)
			form.AfficherFormation();
	}

	public void ModifierFormation(Formation FormationAncienne, Formation FormationNouveau) {
		for (Formation form : TabFormation) {
			if (form.equals(FormationAncienne)) {
				form.setDuree(FormationNouveau.getDuree());
				form.setNom(FormationNouveau.getNom());
				form.setPrix(FormationNouveau.getPrix());

			}
		}
	}
	public void AfficherInformation() {
		System.out.println("nom = "+Nom);
		System.out.println("premon = "+Prenom);
		System.out.println("date de naissence = "+dateNaissance);
		System.out.println("adresse = "+Adresse);
	}
	
	public float Moyenne() {
		float moyenne = 0 ;
		for(int i =0 ; i< TabFormation.size(); i++) {
			moyenne += Note[i];
		}
		moyenne = moyenne/TabFormation.size();
		return moyenne ;
	}
	public void AjouterFormation(Formation form) {
			TabFormation.add(form);
	}
	public void AfficherNotes() {
		for(int i = 0 ; i < TabFormation.size();i++) {
			System.out.println("formation : "+TabFormation.get(i).getNom());
			System.out.println("Note : "+Note[i]);
		}
	}
	

}
