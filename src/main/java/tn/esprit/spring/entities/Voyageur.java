package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity 
@AllArgsConstructor
@NoArgsConstructor
public class Voyageur implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVoyageur;
	
	String nomVoyageur;

	
	public List<Voyage> getMesvoyages() {
		return mesvoyages;
	}

	public Voyageur(Long idVoyageur, String nomVoyageur) {
		super();
		this.idVoyageur = idVoyageur;
		this.nomVoyageur = nomVoyageur;
	}

	public Voyageur(Long idVoyageur, String nomVoyageur, List<Voyage> mesvoyages) {
		super();
		this.idVoyageur = idVoyageur;
		this.nomVoyageur = nomVoyageur;
		this.mesvoyages = mesvoyages;
	}

	public void setMesvoyages(List<Voyage> mesvoyages) {
		this.mesvoyages = mesvoyages;
	}

	@ManyToMany(mappedBy = "mesVoyageurs")
    public List<Voyage> mesvoyages;

	public Long getIdVoyageur() {
		return idVoyageur;
	}

	public void setIdVoyageur(Long idVoyageur) {
		this.idVoyageur = idVoyageur;
	}

	public String getNomVoyageur() {
		return nomVoyageur;
	}

	public void setNomVoyageur(String nomVoyageur) {
		this.nomVoyageur = nomVoyageur;
	}

	public Voyageur() {
		super();
	}
	
	
}
