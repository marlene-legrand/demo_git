/**
 * 
 * @author marle
 *
 */
public class Utilisateur {

	/*________ props __________*/
	private int id;
	private String nom;
	private String prenom;
	private String telephone;
	
	/*__________ ctor ___________*/
	public Utilisateur() {
		
	}

	public Utilisateur(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}	
	
	public Utilisateur(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	/*__________ getters/setters ___________*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
}//end class
