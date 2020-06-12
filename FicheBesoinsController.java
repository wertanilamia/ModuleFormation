package org.sid.web;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.sid.dao.FicheBesoinsRepository;
import org.sid.entities.FicheBesoins;
import org.sid.entities.Utilisateurs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class FicheBesoinsController {
	@Autowired
   private FicheBesoinsRepository ficheBesoinsRepository;
	@RequestMapping(value = "/fiches", method = RequestMethod.GET)
	public List<FicheBesoins> getAllFiches(){
		return ficheBesoinsRepository.findAll();
	}
	@RequestMapping(value = "/fiches/{id}", method = RequestMethod.GET)
	public Optional<FicheBesoins> getFicheById(@PathVariable int id) {
		return ficheBesoinsRepository.findById(id);
		
	}
	@RequestMapping(value = "/fiches", method = RequestMethod.POST)
	public FicheBesoins save(@RequestBody FicheBesoins fiche) {
		return ficheBesoinsRepository.save(fiche);
		
	}
	@RequestMapping(value = "/fiches/{id}", method = RequestMethod.PUT)
	public FicheBesoins updateFiche(@PathVariable int id, @RequestBody FicheBesoins fiche) {
		fiche.setId(id);
		return ficheBesoinsRepository.save(fiche);}
	
	@RequestMapping(value = "/fiches/{id}", method = RequestMethod.DELETE)
	public boolean DeleteFiche(@PathVariable int id) {
		ficheBesoinsRepository.findById(id);
		ficheBesoinsRepository.deleteById(id);
		return true;
	
	}
	
	
	@RequestMapping(value = "/chercherfiche", method = RequestMethod.GET)
	public Page<FicheBesoins> chercherfiche(
			@RequestParam(name="mc", defaultValue = "") String mc,
			@RequestParam(name = "page", defaultValue = "0") int page,
			@RequestParam(name = "size", defaultValue = "5") int size){
		return ficheBesoinsRepository.chercherficher("%"+mc+"%", PageRequest.of(page, size));
		
	}
			
	
	}


