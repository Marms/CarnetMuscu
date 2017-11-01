package fr.df.muscu.exercicesvc.domain;



import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/** Objet Serie **/
@Data
@Setter
@Getter
public class Serie {

	@Id
	private String id;
	private Integer execiceId;
    private Integer numero;
    private double poids;
    private double nbRepeat;
    /** temps repos avant series en secondes */
    private int repos;
    
    
    private Double minute;
    
    private Double seconde;
    
    private Double leste;
    
    private Boolean forcer;
    
    private Boolean neg;
    
    private String comment;
    

	private Character unilateral;    
	
	/**
	 * NORMAL, DEGRADER, PDC, TIME, TRACTION
	 */
//    @Enumerated(EnumType.STRING)    
//    private TypeNotation type;

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Integer getExeciceId() {
		return execiceId;
	}


	public void setExeciceId(Integer execiceId) {
		this.execiceId = execiceId;
	}


	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public double getPoids() {
		return poids;
	}


	public void setPoids(double poids) {
		this.poids = poids;
	}


	public double getNbRepeat() {
		return nbRepeat;
	}


	public void setNbRepeat(double nbRepeat) {
		this.nbRepeat = nbRepeat;
	}


	public int getRepos() {
		return repos;
	}


	public void setRepos(int repos) {
		this.repos = repos;
	}


	public Double getMinute() {
		return minute;
	}


	public void setMinute(Double minute) {
		this.minute = minute;
	}


	public Double getSeconde() {
		return seconde;
	}


	public void setSeconde(Double seconde) {
		this.seconde = seconde;
	}


	public Double getLeste() {
		return leste;
	}


	public void setLeste(Double leste) {
		this.leste = leste;
	}


	public Boolean getForcer() {
		return forcer;
	}


	public void setForcer(Boolean forcer) {
		this.forcer = forcer;
	}


	public Boolean getNeg() {
		return neg;
	}


	public void setNeg(Boolean neg) {
		this.neg = neg;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public Character getUnilateral() {
		return unilateral;
	}


	public void setUnilateral(Character unilateral) {
		this.unilateral = unilateral;
	}

}
