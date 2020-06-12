package org.sid.web;

import java.util.List;
import java.util.Optional;

import org.sid.dao.PlanFormationGRepository;
import org.sid.entities.FicheBesoins;
import org.sid.entities.PlanFormationGeneral;
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
public class PlanFormationController {
	@Autowired
	private PlanFormationGRepository planFormationGRepository;
	
	@RequestMapping(value = "/plans", method = RequestMethod.GET)
	public List<PlanFormationGeneral> getPlan(){
		return planFormationGRepository.findAll();
	}
	@RequestMapping(value = "/plans/{id}", method = RequestMethod.GET)
	public Optional<PlanFormationGeneral> getPlanById(@PathVariable int id) {
		return planFormationGRepository.findById(id);	
	}
	@RequestMapping(value = "/plans", method = RequestMethod.POST)
	public PlanFormationGeneral saveplan(@RequestBody PlanFormationGeneral plan) {
		return planFormationGRepository.save(plan);
		
	}
@RequestMapping(value = "/plans/{id}", method = RequestMethod.PUT)
	 public PlanFormationGeneral updatePlan(@PathVariable int id ,@RequestBody PlanFormationGeneral plan) {
		 plan.setId(id);
		return planFormationGRepository.save(plan);
		 
	 }
@RequestMapping(value ="/chercherplan", method = RequestMethod.GET)
public Page<PlanFormationGeneral> chercher(
		                                   @RequestParam(name = "mat", defaultValue = "")Number mat,
		                                   @RequestParam(name = "page", defaultValue ="0") int page,
		                                   @RequestParam(name = "size", defaultValue = "5") int size){
	return planFormationGRepository.ChercherPlan(mat, PageRequest.of(page, size));
}
}
