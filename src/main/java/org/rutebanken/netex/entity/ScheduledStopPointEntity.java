package org.rutebanken.netex.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="scheduled_stop_point")
public class ScheduledStopPointEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "project_to_point_ref")
    private String projectToPointRef;

	public ScheduledStopPointEntity(String id, String version, String name, String projectToPointRef) {
		this.id = id;
		this.version = version;
		this.name = name;
		this.projectToPointRef = projectToPointRef;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProjectToPointRef() {
		return projectToPointRef;
	}

	public void setProjectToPointRef(String projectToPointRef) {
		this.projectToPointRef = projectToPointRef;
	}

	@Override
	public String toString() {
		return "ScheduledStopPointEntity [id=" + id + ", version=" + version + ", name=" + name + ", projectToPointRef="
				+ projectToPointRef + "]";
	}

}
