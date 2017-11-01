package fr.df.muscu.seancesvc.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;

import lombok.Data;
/**
 * Domaine Seance
 * @author Florent
 *
 */
@Data
public class Seance {

    @Id
    private Integer id;
  
    private String name;
    
    private Date date;

    private String seanceTemplateId;
    
//    @ManyToOne
//    private SeancePredef seancePredef;
//    
//    @OneToMany(cascade={CascadeType.ALL})
//    private List<Exercice> exercices = new ArrayList<>();
//
    
    public Seance() {}
    
    
	public Seance(Date date) {
		super();
		this.date = date;
	}

	public Seance(Date date, String seanceTemplateId) {
		super();
		this.date = date;
		this.seanceTemplateId = seanceTemplateId;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getSeanceTemplateId() {
		return seanceTemplateId;
	}


	public void setSeanceTemplateId(String seanceTemplateId) {
		this.seanceTemplateId = seanceTemplateId;
	}


}
