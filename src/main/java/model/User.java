package model;

// classe modèle User (utilisateur)

public class User {
	private String username;
	private int nbArticles;
	private String emailAdress;
	private boolean isAdmin;
	
	public User(String username, int nbArticles, String emailAdress, boolean isAdmin) {
		super();
		this.username = username;
		this.nbArticles = nbArticles;
		this.emailAdress = emailAdress;
		this.isAdmin = isAdmin;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getNbArticles() {
		return nbArticles;
	}

	public void setNbArticles(int nbArticles) {
		this.nbArticles = nbArticles;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	
	
	
	

}
