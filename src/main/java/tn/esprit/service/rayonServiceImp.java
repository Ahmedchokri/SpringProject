package tn.esprit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.entities.Rayon;
import tn.esprit.repository.rayonrepository;

public class rayonServiceImp implements rayonService{
	
	@Autowired
	rayonrepository rayonrep;
	

	@Override
	public List<Rayon> retrieveAllRayon() {
		
		return (List<Rayon>) rayonrep.findAll();
	}

	@Override
	public Rayon addRayon(Rayon u) {
		return rayonrep.save(u);
	}

	@Override
	public void deleteRayon(Long id) {
		rayonrep.deleteById(id);
	}

	@Override
	public Rayon updateRayon(Rayon u) {
		return rayonrep.save(u);
	}

	@Override
	public Rayon retrieveRayon(Long id) {
		
		return rayonrep.findById(id).get();
	}

}
