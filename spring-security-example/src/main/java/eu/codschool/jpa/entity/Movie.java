package eu.codschool.jpa.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieid;
	private String title;
	private String summary;
	@ManyToOne
	@JoinColumn(name = "director")
	private Director director;
	@ManyToMany
	@JoinTable(name = "moviegenre", joinColumns = @JoinColumn(name = "movieid", referencedColumnName = "movieid"), inverseJoinColumns = @JoinColumn(name = "genreid", referencedColumnName = "genreid"))
	private Set<Genre> genre;

	/**
	 * @return the genre
	 */
	public Set<Genre> getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(Set<Genre> genre) {
		this.genre = genre;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return movieid;
	}

	/**
	 * @return the movieid
	 */
	public int getMovieid() {
		return movieid;
	}

	/**
	 * @param movieid
	 *            the movieid to set
	 */
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * @param summary
	 *            the summary to set
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}

	/**
	 * @return the director
	 */
	public Director getDirector() {
		return director;
	}

	/**
	 * @param director
	 *            the director to set
	 */
	public void setDirector(Director director) {
		this.director = director;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.movieid = id;
	}
}