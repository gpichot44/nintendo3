package nintendo.model;

import java.util.ArrayList;
import java.util.List;

public class Client {
	


	private String nom;
	private String prenom;
	private List<Jeu> achatClient;
	
		
	public Client(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		this.achatClient= new ArrayList();
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


	public List<Jeu> getAchatClient() {
		return achatClient;
	}


	public void setAchatClient(List<Jeu> achatClient) {
		this.achatClient = achatClient;
	}
		
	
		
}

