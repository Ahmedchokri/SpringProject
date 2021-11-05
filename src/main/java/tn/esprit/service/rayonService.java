package tn.esprit.service;

import java.util.List;

import tn.esprit.entities.Client;
import tn.esprit.entities.Rayon;

public interface rayonService {
	List<Rayon> retrieveAllRayon();
    Rayon addRayon(Rayon u);
	void deleteRayon(Long id);
	Rayon updateRayon(Rayon u);
	Rayon retrieveRayon(Long id);
}
