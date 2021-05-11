import java.util.LinkedList;
public class Test {

	public static void main(String[] args) {

		Matiere[] mat = new Matiere[4];

		Formation form ;
		LinkedList<Formation> tab_form = new LinkedList<Formation>();

		Participant part ;
		LinkedList<Participant> tab_part = new LinkedList<Participant>();
	

		// matieres
		mat[0] = new Matiere("java", 0);
		mat[1] = new Matiere("python", 1);
		mat[2] = new Matiere("c", 2);
		mat[3] = new Matiere("linux", 3);
		// formation
		form = new Formation("formation java", 2, 10, mat[0]);
		tab_form.add(form);
		form = new Formation("formation AI", 5, 50, mat[1]);
		tab_form.add(form);
		tab_form.get(0).AjouterMatiere(mat[1]);
		tab_form.get(0).AjouterMatiere(mat[2]);
		tab_form.get(0).AjouterMatiere(mat[3]);
		tab_form.get(0).AfficherTousLesMatieres();

		System.out.println("\n\n********************");
		System.out.println("\napres modification \n\n");
		tab_form.get(0).ModifierMatiere(mat[2], mat[3]);
		tab_form.get(0).AfficherTousLesMatieres();

		System.out.println("\n\n********************");
		System.out.println("\napres suppression \n");
		tab_form.get(0).SupprimerMatiere(mat[2]);
		tab_form.get(0).AfficherTousLesMatieres();

		// ex2
		System.out.println("\n\n-----EXE2-------");
		// nom
		System.out.println("\n\n---recherche d'une formation par son nom---");
		String nom = "formation AI";
		boolean exists = false;
		for (Formation element : tab_form) {
			if (element.getNom().equals(nom))
			{
				System.out.println("la formation "+nom + "  existe");
				exists = true;
				break;
			}
			
		}
		if (exists ==false) {
			System.out.println("la formation "+nom+ " n'existe pas");
		}
		
		
		
		
		

		// duree
		System.out.println("\n\n---recherche d'une formation par sa duree---");

		int d = 5; // formation de duree 1 n'existe pas en utilise 2 ou 5 ici
		exists = false;
		for (Formation element : tab_form) {
			if (element.getDuree()==d)
			{
				System.out.println("la formation de duree "+d + "  existe");
				exists = true;
				break;
			}
			
		}
		if (exists ==false) {
			System.out.println("la formation "+nom+ " n'existe pas");
		}
		
		
		

		// participant
		
		part= new Participant("123", "ahmed", "kallel", "1/1/1999", "sfax", tab_form.get(0));
		tab_part.add(part);
		part= new Participant("155", "oussama", "bahloul", "1/1/2000", "sfax", tab_form.get(1));
		tab_part.add(part);
		
		//Ajout formation
		tab_part.get(0).AjouterFormation(tab_form.get(1));
		
		//EX3
		System.out.println("---EX3---");
		String cin = "123";
	
		
		exists = false;
		for (Participant element : tab_part) {
			if (element.getCIN()==cin)
			{
				System.out.println("le " + cin + " existe ");
				element.AfficherInformation();
				System.out.println("ce participant est inscrit aux formations suivantes :");
				element.AfficherTabFormation();
				exists = true;
			}
			
		}
		if (exists ==false) {
			System.out.println("le cin "+cin+ " n'existe pas");
		}
		
		System.out.println();
		//ex 4 
		System.out.println("---EX4---");
		tab_part.get(0).setNote(17,0);
		tab_part.get(0).setNote(10, 1);
		tab_part.get(1).setNote(13,0);
		for (Participant element : tab_part) {
			element.AfficherNotes();
			System.out.println("moyenne : "+element.Moyenne());
			
		}
		//ex5
		System.out.println("\n---EX5---");
		form = tab_form.get(1);
		exists = false;
		System.out.println("pour la formation : "+form.getNom()+"\n");
		for (Participant element : tab_part) {
			for (Formation fr : element.getFormation()) {
				if (fr.getNom().equals(form.getNom())) {
					element.AfficherInformation();
					System.out.println("\n");
					exists = true;
				}
			}
		}
		if (exists == false) {
			System.out.println("aucune personne a choisi cette formation");
		}

		
	}

}
