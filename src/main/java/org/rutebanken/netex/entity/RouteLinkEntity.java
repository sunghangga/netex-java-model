package org.rutebanken.netex.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="route_link")
public class RouteLinkEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "distance")
    private BigDecimal distance;
    
    @Column(name = "line_string")
    @Type(type="text")
    private String lineString;
    
    @Column(name = "from_point_ref")
    private String fromPointRef;
    
    @Column(name = "to_point_ref")
    private String toPointRef;
    
    @Column(name = "operational_context_ref")
    private String operationalContextRef;

	public RouteLinkEntity(String id, String version, BigDecimal distance, String lineString, String fromPointRef,
			String toPointRef, String operationalContextRef) {
		super();
		this.id = id;
		this.version = version;
		this.distance = distance;
		this.lineString = lineString;
		this.fromPointRef = fromPointRef;
		this.toPointRef = toPointRef;
		this.operationalContextRef = operationalContextRef;
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

	public BigDecimal getDistance() {
		return distance;
	}

	public void setDistance(BigDecimal distance) {
		this.distance = distance;
	}

	public String getLineString() {
		return lineString;
	}

	public void setLineString(String lineString) {
		this.lineString = lineString;
	}

	public String getFromPointRef() {
		return fromPointRef;
	}

	public void setFromPointRef(String fromPointRef) {
		this.fromPointRef = fromPointRef;
	}

	public String getToPointRef() {
		return toPointRef;
	}

	public void setToPointRef(String toPointRef) {
		this.toPointRef = toPointRef;
	}

	public String getOperationalContextRef() {
		return operationalContextRef;
	}

	public void setOperationalContextRef(String operationalContextRef) {
		this.operationalContextRef = operationalContextRef;
	}

	@Override
	public String toString() {
		return "RouteLinkEntity [id=" + id + ", version=" + version + ", distance=" + distance + ", lineString="
				+ lineString + ", fromPointRef=" + fromPointRef + ", toPointRef=" + toPointRef
				+ ", operationalContextRef=" + operationalContextRef + "]";
	}
	
}
