package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "FicheBesoins")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class FicheBesoins implements Serializable {
	@Id
	@GeneratedValue
	protected int id ;
	protected int matricule;
	protected String nom ;
	protected String prenom ;
	protected String emploi ;
	protected String filiere ;
	protected String TachePrincipale ;
	protected String DirectionAeroport ;
	protected String division ;
	protected String service ;
	protected int comptenceActuelleNA ;
	protected int competenceActuelleNR;
	protected int nouvellecompetenceNA ;
	protected int nouvellecompetenceNR;
	protected String theme ;
	protected String niveaudemande ;
	protected String typeformation ;
	protected String periode ;
	
	public FicheBesoins() {
		super();
	}

	public FicheBesoins(int matricule, String nom, String prenom, String emploi, String filiere, String tachePrincipale,
			String directionAeroport, String division, String service, int comptenceActuelleNA,
			int competenceActuelleNR, int nouvellecompetenceNA, int nouvellecompetenceNR, String theme,
			String niveaudemande, String typeformation, String periode) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.emploi = emploi;
		this.filiere = filiere;
		this.TachePrincipale = tachePrincipale;
		this.DirectionAeroport = directionAeroport;
		this.division = division;
		this.service = service;
		this.comptenceActuelleNA = comptenceActuelleNA;
		this.competenceActuelleNR = competenceActuelleNR;
		this.nouvellecompetenceNA = nouvellecompetenceNA;
		this.nouvellecompetenceNR = nouvellecompetenceNR;
		this.theme = theme;
		this.niveaudemande = niveaudemande;
		this.typeformation = typeformation;
		this.periode = periode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
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

	public String getEmploi() {
		return emploi;
	}

	public void setEmploi(String emploi) {
		this.emploi = emploi;
	}

	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

	public String getTachePrincipale() {
		return TachePrincipale;
	}

	public void setTachePrincipale(String tachePrincipale) {
		TachePrincipale = tachePrincipale;
	}

	public String getDirectionAeroport() {
		return DirectionAeroport;
	}

	public void setDirectionAeroport(String directionAeroport) {
		DirectionAeroport = directionAeroport;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public int getComptenceActuelleNA() {
		return comptenceActuelleNA;
	}

	public void setComptenceActuelleNA(int comptenceActuelleNA) {
		this.comptenceActuelleNA = comptenceActuelleNA;
	}

	public int getCompetenceActuelleNR() {
		return competenceActuelleNR;
	}

	public void setCompetenceActuelleNR(int competenceActuelleNR) {
		this.competenceActuelleNR = competenceActuelleNR;
	}

	public int getNouvellecompetenceNA() {
		return nouvellecompetenceNA;
	}

	public void setNouvellecompetenceNA(int nouvellecompetenceNA) {
		this.nouvellecompetenceNA = nouvellecompetenceNA;
	}

	public int getNouvellecompetenceNR() {
		return nouvellecompetenceNR;
	}

	public void setNouvellecompetenceNR(int nouvellecompetenceNR) {
		this.nouvellecompetenceNR = nouvellecompetenceNR;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getNiveaudemande() {
		return niveaudemande;
	}

	public void setNiveaudemande(String niveaudemande) {
		this.niveaudemande = niveaudemande;
	}

	public String getTypeformation() {
		return typeformation;
	}

	public void setTypeformation(String typeformation) {
		this.typeformation = typeformation;
	}

	public String getPeriode() {
		return periode;
	}

	public void setPeriode(String periode) {
		this.periode = periode;
	}
	
	
}
