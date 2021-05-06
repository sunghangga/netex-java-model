package org.rutebanken.netex.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="route")
public class RouteEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "direction_type")
    private String directionType;
    
    @Column(name = "line_ref")
    private String lineRef;

	public RouteEntity(String id, String version, String directionType, String lineRef) {
		this.id = id;
		this.version = version;
		this.directionType = directionType;
		this.lineRef = lineRef;
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

	public String getDirectionType() {
		return directionType;
	}

	public void setDirectionType(String directionType) {
		this.directionType = directionType;
	}

	public String getLineRef() {
		return lineRef;
	}

	public void setLineRef(String lineRef) {
		this.lineRef = lineRef;
	}

	@Override
	public String toString() {
		return "RoutesEntity [id=" + id + ", version=" + version + ", directionType=" + directionType + ", lineRef="
				+ lineRef + "]";
	}
    
}
