package vn.com.luanvan.model;

// default package
// Generated Jan 31, 2015 7:09:10 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Hesomoitruong generated by hbm2java
 */
@Entity
@Table(name = "hesomoitruong", catalog = "luanvan")
public class Hesomoitruong implements java.io.Serializable {

	private Integer hesomoitruongid;
	private float trongso;
	private String motahesomt;
	private Set<Xephangmoitruong> xephangnhoms = new HashSet<Xephangmoitruong>(0);

	public Hesomoitruong() {
	}

	public Hesomoitruong(int trongso) {
		this.trongso = trongso;
	}

	public Hesomoitruong(int trongso, String motahesomt, Set<Xephangmoitruong> xephangnhoms) {
		this.trongso = trongso;
		this.motahesomt = motahesomt;
		this.xephangnhoms = xephangnhoms;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "HESOMOITRUONGID", unique = true, nullable = false)
	public Integer getHesomoitruongid() {
		return this.hesomoitruongid;
	}

	public void setHesomoitruongid(Integer hesomoitruongid) {
		this.hesomoitruongid = hesomoitruongid;
	}

	@Column(name = "TRONGSO", nullable = false)
	public float getTrongso() {
		return this.trongso;
	}

	public void setTrongso(float trongso) {
		this.trongso = trongso;
	}

	@Column(name = "MOTAHESOMT")
	public String getMotahesomt() {
		return this.motahesomt;
	}

	public void setMotahesomt(String motahesomt) {
		this.motahesomt = motahesomt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hesomoitruong")
	public Set<Xephangmoitruong> getXephangnhoms() {
		return this.xephangnhoms;
	}

	public void setXephangnhoms(Set<Xephangmoitruong> xephangnhoms) {
		this.xephangnhoms = xephangnhoms;
	}

}