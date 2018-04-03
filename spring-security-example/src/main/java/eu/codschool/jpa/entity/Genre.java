package eu.codschool.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Genre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int genreid;
	private String name;
	/**
	 * @return the genreid
	 */
	public int getGenreid() {
		return genreid;
	}
	/**
	 * @param genreid the genreid to set
	 */
	public void setGenreid(int genreid) {
		this.genreid = genreid;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}