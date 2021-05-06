package org.rutebanken.netex.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="version")
public class VersionEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "modification")
    private String modification;
    
    @Column(name = "version_type")
    private String versionType;
    
    @Column(name = "start_date")
    private LocalDateTime startDate;
    
    @Column(name = "end_date")
    private LocalDateTime endDate;
     
    @Column(name = "description")
    private String description;
    
    @Column(name = "derived_from_version_ref")
    private String derivedFromVersionRef;

	public VersionEntity(String id, String version, String modification, String versionType, LocalDateTime startDate,
			LocalDateTime endDate, String description, String derivedFromVersionRef) {
		super();
		this.id = id;
		this.version = version;
		this.modification = modification;
		this.versionType = versionType;
		this.startDate = startDate;
		this.endDate = endDate;
		this.description = description;
		this.derivedFromVersionRef = derivedFromVersionRef;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getModification() {
		return modification;
	}

	public void setModification(String modification) {
		this.modification = modification;
	}

	public String getVersionType() {
		return versionType;
	}

	public void setVersionType(String versionType) {
		this.versionType = versionType;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDerivedFromVersionRef() {
		return derivedFromVersionRef;
	}

	public void setDerivedFromVersionRef(String derivedFromVersionRef) {
		this.derivedFromVersionRef = derivedFromVersionRef;
	}

	@Override
	public String toString() {
		return "VersionEntity [id=" + id + ", version=" + version + ", modification=" + modification + ", versionType="
				+ versionType + ", startDate=" + startDate + ", endDate=" + endDate + ", description=" + description
				+ ", derivedFromVersionRef=" + derivedFromVersionRef + "]";
	}

}
