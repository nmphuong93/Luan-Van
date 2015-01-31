package vn.com.luanvan.model;

// default package
// Generated Jan 31, 2015 7:09:10 PM by Hibernate Tools 4.3.1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Xephangkythuat generated by hbm2java
 */
@Entity
@Table(name = "xephangkythuat", catalog = "luanvan")
public class Xephangkythuat implements java.io.Serializable {

	private XephangkythuatId id;
	private Hesokythuat hesokythuat;
	private Project project;
	private int giatrixephang;
	private String ghichu;

	public Xephangkythuat() {
	}

	public Xephangkythuat(XephangkythuatId id, Hesokythuat hesokythuat,
			Project project, int giatrixephang) {
		this.id = id;
		this.hesokythuat = hesokythuat;
		this.project = project;
		this.giatrixephang = giatrixephang;
	}

	public Xephangkythuat(XephangkythuatId id, Hesokythuat hesokythuat,
			Project project, int giatrixephang, String ghichu) {
		this.id = id;
		this.hesokythuat = hesokythuat;
		this.project = project;
		this.giatrixephang = giatrixephang;
		this.ghichu = ghichu;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "projectid", column = @Column(name = "PROJECTID", nullable = false)),
			@AttributeOverride(name = "hesokythuatid", column = @Column(name = "HESOKYTHUATID", nullable = false)) })
	public XephangkythuatId getId() {
		return this.id;
	}

	public void setId(XephangkythuatId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "HESOKYTHUATID", nullable = false, insertable = false, updatable = false)
	public Hesokythuat getHesokythuat() {
		return this.hesokythuat;
	}

	public void setHesokythuat(Hesokythuat hesokythuat) {
		this.hesokythuat = hesokythuat;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROJECTID", nullable = false, insertable = false, updatable = false)
	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Column(name = "GIATRIXEPHANG", nullable = false)
	public int getGiatrixephang() {
		return this.giatrixephang;
	}

	public void setGiatrixephang(int giatrixephang) {
		this.giatrixephang = giatrixephang;
	}

	@Column(name = "GHICHU")
	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

}
