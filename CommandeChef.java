package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class CommandeChef implements Serializable {
	@Id
	@GeneratedValue
	private int idcom ;
	private String nom ; 
	private String prenom ;
	private Date datedebutF ;
	private Date datefinF;
	public String dateEnvoi;
	private String theme ;
	private String organismeformateur ;
	private String depenseprevisionnelle ;
	private String chefdepartementformation;
	
	public CommandeChef() {
		super();
	}
	public CommandeChef(String nom, String prenom, Date datedebutF, Date datefinF, String dateEnvoi, String theme,
			String organismeformateur, String depenseprevisionnelle, String chefdepartementformation) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.datedebutF = datedebutF;
		this.datefinF = datefinF;
		this.dateEnvoi = dateEnvoi;
		this.theme = theme;
		this.organismeformateur = organismeformateur;
		this.depenseprevisionnelle = depenseprevisionnelle;
		this.chefdepartementformation = chefdepartementformation;
	}
	public int getIdcom() {
		return idcom;
	}
	public void setIdcom(int idcom) {
		this.idcom = idcom;
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
	public Date getDatedebutF() {
		return datedebutF;
	}
	public void setDatedebutF(Date datedebutF) {
		this.datedebutF = datedebutF;
	}
	public Date getDatefinF() {
		return datefinF;
	}
	public void setDatefinF(Date datefinF) {
		this.datefinF = datefinF;
	}
	public String getDateEnvoi() {
		return dateEnvoi;
	}
	public void setDateEnvoi(String dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getOrganismeformateur() {
		return organismeformateur;
	}
	public void setOrganismeformateur(String organismeformateur) {
		this.organismeformateur = organismeformateur;
	}
	public String getDepenseprevisionnelle() {
		return depenseprevisionnelle;
	}
	public void setDepenseprevisionnelle(String depenseprevisionnelle) {
		this.depenseprevisionnelle = depenseprevisionnelle;
	}
	public String getChefdepartementformation() {
		return chefdepartementformation;
	}
	public void setChefdepartementformation(String chefdepartementformation) {
		this.chefdepartementformation = chefdepartementformation;
	}
	
	
}
