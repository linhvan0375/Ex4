package com.web.demo.entity;
// Generated Jun 29, 2021, 8:56:47 AM by Hibernate Tools 5.0.6.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * System generated by hbm2java
 */
@Entity
@Table(name = "system", catalog = "megalodondb")
public class System implements java.io.Serializable {

	private SystemId id;

	public System() {
	}

	public System(SystemId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "dowloadSystem", column = @Column(name = "Dowload_system", nullable = false)),
			@AttributeOverride(name = "viewsSystem", column = @Column(name = "views_system", nullable = false)),
			@AttributeOverride(name = "date", column = @Column(name = "Date", nullable = false, length = 19)) })
	public SystemId getId() {
		return this.id;
	}

	public void setId(SystemId id) {
		this.id = id;
	}

}
