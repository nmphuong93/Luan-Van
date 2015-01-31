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
 * Xephangnhom generated by hbm2java
 */
@Entity
@Table(name = "xephangnhom", catalog = "luanvan")
public class Xephangnhom implements java.io.Serializable {

	private XephangnhomId id;
	private Hesomoitruong hesomoitruong;
	private Project project;
	private Integer giatrixephang;
	private Integer ondinh;

	public Xephangnhom() {
	}

	public Xephangnhom(XephangnhomId id, Hesomoitruong hesomoitruong,
			Project project) {
		this.id = id;
		this.hesomoitruong = hesomoitruong;
		this.project = project;
	}

	public Xephangnhom(XephangnhomId id, Hesomoitruong hesomoitruong,
			Project project, Integer giatrixephang, Integer ondinh) {
		this.id = id;
		this.hesomoitruong = hesomoitruong;
		this.project = project;
		this.giatrixephang = giatrixephang;
		this.ondinh = ondinh;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "projectid", column = @Column(name = "PROJECTID", nullable = false)),
			@AttributeOverride(name = "hesomoitruongid", column = @Column(name = "HESOMOITRUONGID", nullable = false)) })
	public XephangnhomId getId() {
		return this.id;
	}

	public void setId(XephangnhomId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "HESOMOITRUONGID", nullable = false, insertable = false, updatable = false)
	public Hesomoitruong getHesomoitruong() {
		return this.hesomoitruong;
	}

	public void setHesomoitruong(Hesomoitruong hesomoitruong) {
		this.hesomoitruong = hesomoitruong;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROJECTID", nullable = false, insertable = false, updatable = false)
	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Column(name = "GIATRIXEPHANG")
	public Integer getGiatrixephang() {
		return this.giatrixephang;
	}

	public void setGiatrixephang(Integer giatrixephang) {
		this.giatrixephang = giatrixephang;
	}

	@Column(name = "ONDINH")
	public Integer getOndinh() {
		return this.ondinh;
	}

	public void setOndinh(Integer ondinh) {
		this.ondinh = ondinh;
	}

}
