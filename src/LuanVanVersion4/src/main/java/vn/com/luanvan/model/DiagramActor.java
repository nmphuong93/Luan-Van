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
 * Phanloai generated by hbm2java
 */
@Entity
@Table(name = "diagramactor", catalog = "luanvan")
public class DiagramActor implements java.io.Serializable {

	private DiagramActorId id;
	private Actor actor;
	private Diagram diagram;

	public DiagramActor() {
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "actorid", column = @Column(name = "ACTORID", nullable = false)),
			@AttributeOverride(name = "diagramid", column = @Column(name = "DIAGRAMID", nullable = false)) })
	public DiagramActorId getId() {
		return this.id;
	}

	public void setId(DiagramActorId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ACTORID", nullable = false, insertable = false, updatable = false)
	public Actor getActor() {
		return this.actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "DIAGRAMID", nullable = false, insertable = false, updatable = false)
	public Diagram getDiagram() {
		return this.diagram;
	}

	public void setDiagram(Diagram diagram) {
		this.diagram = diagram;
	}
}