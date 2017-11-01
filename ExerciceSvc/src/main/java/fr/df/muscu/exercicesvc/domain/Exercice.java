package fr.df.muscu.exercicesvc.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;

import lombok.Data;


/**
 * 
 * @author Florent
 *
 */
@Data
public class Exercice {
	
	@Id
	private Integer id;

	private String exoTemplateId;
	
	/**
	 * Permet de determiner a quel seance appartient l'exercice
	 */
	private String seanceId;
	
//    @OneToOne
//    private ExoPredef exoPredef;
    
//    @ElementCollection
//    @CollectionTable(name="SERIES", joinColumns=@JoinColumn(name="Owner_id"))
//    @OneToMany(cascade={CascadeType.ALL}) 
//    private List<Serie> series = new ArrayList<>();
//     
    
    private Date date;
    
    private int numero;

    /** temps de repos en secondes */
    private int repos;
    
	public int getRepos() {
		return repos;
	}

	public void setRepos(int repos) {
		this.repos = repos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getExoTemplateId() {
		return exoTemplateId;
	}

	public void setExoTemplateId(String exoTemplateId) {
		this.exoTemplateId = exoTemplateId;
	}
    
}
