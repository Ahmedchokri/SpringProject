package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Client implements Serializable {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idclient  ;
	private String nom ;
	private String prenom ;
	@Temporal (TemporalType.DATE)
	private Date date_naissance ;
	private String email ;
	private String password ;
	@Enumerated (EnumType.STRING)
	private Categorieclient categorieclient ;
	@Enumerated (EnumType.STRING)
	private Profession profession ;
	
	
	
	public Client( String nom, String prenom, String email, String password) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;

	}
	public Client() {
	}
	@OneToMany(cascade = CascadeType.ALL,mappedBy="client")
	private Set<Facture> factures ;
	public long getIdclient() {
		return idclient;
	}
	public void setIdclient(long idclient) {
		this.idclient = idclient;
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
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Categorieclient getCategorieclient() {
		return categorieclient;
	}
	public void setCategorieclient(Categorieclient categorieclient) {
		this.categorieclient = categorieclient;
	}
	public Profession getProfession() {
		return profession;
	}
	public void setProfession(Profession profession) {
		this.profession = profession;
	}
	

}
