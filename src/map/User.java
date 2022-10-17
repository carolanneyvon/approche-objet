package map;

public class User implements Comparable<User> {
	private String nom;
	private String prenom;
	private int age;

	public User(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

// méthode avec Comparable (pour faire un tri)
	public int compareTo(User autre) {
		if (this.age > autre.getAge()) {
			return 1;
		} else if (this.age < autre.getAge()) {
			return -1;
		} else {
			return 0;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	@Override
	public String toString() {
		return "User [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}

}
