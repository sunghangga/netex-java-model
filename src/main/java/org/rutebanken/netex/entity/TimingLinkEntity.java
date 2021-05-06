package org.rutebanken.netex.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="timing_link")
public class TimingLinkEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "responsibility_set_ref")
    private String responsibilitySetRef;
    
    @Column(name = "from_point_ref")
    private String fromPointRef;
    
    @Column(name = "to_point_ref")
    private String toPointRef;
    
    @Column(name = "distance")
    private BigDecimal distance;

	public TimingLinkEntity(String id, String version, String responsibilitySetRef, String fromPointRef,
			String toPointRef, BigDecimal distance) {
		this.id = id;
		this.version = version;
		this.responsibilitySetRef = responsibilitySetRef;
		this.fromPointRef = fromPointRef;
		this.toPointRef = toPointRef;
		this.distance = distance;
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

	public String getResponsibilitySetRef() {
		return responsibilitySetRef;
	}

	public void setResponsibilitySetRef(String responsibilitySetRef) {
		this.responsibilitySetRef = responsibilitySetRef;
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

	public BigDecimal getDistance() {
		return distance;
	}

	public void setDistance(BigDecimal distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "TimingLinkEntity [id=" + id + ", version=" + version + ", responsibilitySetRef=" + responsibilitySetRef
				+ ", fromPointRef=" + fromPointRef + ", toPointRef=" + toPointRef + ", distance=" + distance + "]";
	}
    
}
