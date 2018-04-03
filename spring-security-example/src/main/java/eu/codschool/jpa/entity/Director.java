package eu.codschool.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Director {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int directorid;
	private String name;
	/**
	 * @return the directorid
	 */
	public int getDirectorid() {
		return directorid;
	}
	/**
	 * @param directorid the directorid to set
	 */
	public void setDirectorid(int directorid) {
		this.directorid = directorid;
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