package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.management.loading.PrivateClassLoader;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.sid.dao.CommandeChefRepository;
import org.sid.dao.ConvocationRepository;
import org.sid.dao.DirectionRepository;
import org.sid.dao.FicheBesoinsRepository;
import org.sid.dao.PlanFormationGRepository;
import org.sid.dao.UtilisateursRepository;
import org.sid.entities.CommandeChef;
import org.sid.entities.ConvocationChef;
import org.sid.entities.Direction;
import org.sid.entities.FicheBesoins;
import org.sid.entities.PlanFormationGeneral;
import org.sid.entities.Utilisateurs;
import org.sid.web.UtilisateursController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PfelamiaApplication  implements CommandLineRunner{
	@Autowired
	private FicheBesoinsRepository ficheBesoinsRepository;
	@Autowired
	private PlanFormationGRepository planFormationGRepository;
	@Autowired
	private UtilisateursRepository utilisateursRepository;
	@Autowired
	private PlanFormationGRepository planFormationGRepository2;
	@Autowired
	private CommandeChefRepository chefRepository;
	@Autowired
	private DirectionRepository directionRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(PfelamiaApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		DateFormat df = new SimpleDateFormat("yyyy/mm/dd");
		
		FicheBesoins fb = new FicheBesoins(1212, "hamdi", "salhi", "chef de direction", "f4", "nnn", "informatique de gestion", "fff", "ser", 1, 3, 2, 4, "gggg", "de base", "intra", "5jours") ;
		ficheBesoinsRepository.save(fb);
		
     planFormationGRepository.save(new PlanFormationGeneral("aaa", df.parse("2019/08/09"), "AFAC", "540dt", 4, 12,
		fb.getMatricule(), fb.getNom(), fb.getPrenom(), fb.getEmploi(), fb.getFiliere(), fb.getTachePrincipale(), fb.getDirectionAeroport(), fb.getDivision(),
		fb.getService(), fb.getComptenceActuelleNA(),fb.getCompetenceActuelleNR(), fb.getNouvellecompetenceNA(), fb.getNouvellecompetenceNR(), 
		fb.getTheme(), fb.getNiveaudemande(),fb.getTypeformation(), fb.getPeriode()));
		
		directionRepository.save(new Direction(" Direction de l'informatique de gestion"));
		directionRepository.save(new Direction(" Direction des affaires juridiques"));
		directionRepository.save(new Direction("Direction de l'architecture"));
		
		
	
	}
}
	

	
	
	


