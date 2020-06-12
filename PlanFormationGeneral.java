package org.sid.entities;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class PlanFormationGeneral  extends FicheBesoins  {
	
    private String domaine;
    private Date date ;
    private String organismeformateur ;
    private String depenseprevisionnelle ;
    private int dureeJ;
    private int dureeH;
    
	public PlanFormationGeneral() {
		super();
	}
	public PlanFormationGeneral(String domaine, Date date,  String organismeformateur,
			String depenseprevisionnelle, int dureeJ, int dureeH,int matricule, String nom, String prenom,
			String emploi, String filiere,String tachePrincipale, String directionAeroport,String division,
			String service ,int comptenceActuelleNA ,int  competenceActuelleNR,int nouvellecompetenceNA ,
			int nouvellecompetenceNR, String theme, String niveaudemande, String typeformation, String periode) {
		
		this.domaine = domaine;
		this.date = date;
		
		this.organismeformateur = organismeformateur;
		this.depenseprevisionnelle = depenseprevisionnelle;
		this.dureeJ = dureeJ;
		this.dureeH = dureeH;
		
		this.nom=nom;
		this.prenom= prenom;
		this.matricule = matricule;
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
	public String getDomaine() {
		return domaine;
	}
	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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
	public int getDureeJ() {
		return dureeJ;
	}
	public void setDureeJ(int dureeJ) {
		this.dureeJ = dureeJ;
	}
	public int getDureeH() {
		return dureeH;
	}
	public void setDureeH(int dureeH) {
		this.dureeH = dureeH;
	}


	
    
}
