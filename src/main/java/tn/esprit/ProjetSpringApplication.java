package tn.esprit;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Categorieclient;
import tn.esprit.entities.Categorieproduit;
import tn.esprit.entities.Client;
import tn.esprit.entities.Detailproduit;
import tn.esprit.entities.Facture;
import tn.esprit.entities.Fournisseur;
import tn.esprit.entities.Produit;
import tn.esprit.entities.Profession;
import tn.esprit.repository.ClientRepository;
import tn.esprit.repository.FactureRepository;
import tn.esprit.repository.ProduitRepository;
import tn.esprit.service.ClientService;
import tn.esprit.service.FactureService;
import tn.esprit.service.FactureServiceImp;

@SpringBootApplication
public class ProjetSpringApplication implements CommandLineRunner{


	@Autowired 
	ClientRepository clientrepository ; 
	@Autowired
	ClientService cs ;
	@Autowired
	ProduitRepository produitrepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	//Client c = new Client( 9,"baha","chokri","ahmed.chokri@esprit.tn","1234");
	//cs.updateClient(c);
	}

}
