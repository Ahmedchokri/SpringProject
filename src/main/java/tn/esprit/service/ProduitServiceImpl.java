package tn.esprit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Produit;
import tn.esprit.repository.ProduitRepository;
import tn.esprit.repository.Stockrepository;
import tn.esprit.repository.rayonrepository;

@Service
public class ProduitServiceImpl implements ProduitService{
	
	@Autowired
	ProduitRepository produitrepository ; 
	Stockrepository stockrepository;
	rayonrepository rayonrepositori;
	@Override
	public List<Produit> retrieveAllProduits() {
		List<Produit> produits=(List<Produit>) produitrepository.findAll();
		return produits;
	}

	@Override
	public Produit addProduit(Produit p, Long idRayon, Long idStock) {
		p.setRayon(rayonrepositori.findById(idRayon).get());
		p.setStock(stockrepository.findById(idStock).get());
		produitrepository.save(p);
		return p;
	}

	@Override
	public Produit retrieveProduit(Long id) {
		Produit p =produitrepository.findById(id).get();
		return p;
	}

}
