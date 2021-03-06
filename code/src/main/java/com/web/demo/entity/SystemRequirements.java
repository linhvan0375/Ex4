package com.web.demo.entity;
// Generated Jun 29, 2021, 8:56:47 AM by Hibernate Tools 5.0.6.Final

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
 * SystemRequirements generated by hbm2java
 */
@Entity
@Table(name = "system_requirements", catalog = "megalodondb")
public class SystemRequirements implements java.io.Serializable {

	private Integer idSystemRerequirements;
	private String processor;
	private String ram;
	private String vga;
	private String storage;
	private Set<Games> gameses = new HashSet<Games>(0);

	public SystemRequirements() {
	}

	public SystemRequirements(String processor, String ram, String vga, String storage, Set<Games> gameses) {
		this.processor = processor;
		this.ram = ram;
		this.vga = vga;
		this.storage = storage;
		this.gameses = gameses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Id_system_rerequirements", unique = true, nullable = false)
	public Integer getIdSystemRerequirements() {
		return this.idSystemRerequirements;
	}

	public void setIdSystemRerequirements(Integer idSystemRerequirements) {
		this.idSystemRerequirements = idSystemRerequirements;
	}

	@Column(name = "Processor")
	public String getProcessor() {
		return this.processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	@Column(name = "RAM")
	public String getRam() {
		return this.ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	@Column(name = "VGA")
	public String getVga() {
		return this.vga;
	}

	public void setVga(String vga) {
		this.vga = vga;
	}

	@Column(name = "Storage")
	public String getStorage() {
		return this.storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

//	@OneToMany(fetch = FetchType.EAGER, mappedBy = "systemRequirements")
//	public Set<Games> getGameses() {
//		return this.gameses;
//	}

	public void setGameses(Set<Games> gameses) {
		this.gameses = gameses;
	}

}
