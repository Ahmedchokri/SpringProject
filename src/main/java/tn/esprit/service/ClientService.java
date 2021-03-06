package tn.esprit.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import tn.esprit.entities.Categorieclient;
import tn.esprit.entities.Client;
import tn.esprit.entities.Profession;

public interface ClientService {
	List<Client> retrieveAllClient();
	Client addClient(Client u);
	void deleteClient(Long id);
	Client updateClient(Client u);
	Client retrieveClient(Long id);
	List<Client> retrieveClientsByProfession(Profession prof);
	long updateClientCategorieByProfession(Categorieclient categorieClient,Profession profession);
	long deleteClientByCategorieClientAndProfessionb(Categorieclient categorieclient,Profession profession);
	long insertClient(String nom, String prenom,String dateNaissance,  String email,String password,  Profession profession, Categorieclient categorieClient);
}
