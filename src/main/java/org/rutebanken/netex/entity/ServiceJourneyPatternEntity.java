package org.rutebanken.netex.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="service_journey_pattern")
public class ServiceJourneyPatternEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "route_ref")
    private String routeRef;
    
    @Column(name = "destination_display_ref")
    private String destinationDisplayRef;

	public ServiceJourneyPatternEntity(String id, String version, String routeRef, String destinationDisplayRef) {
		super();
		this.id = id;
		this.version = version;
		this.routeRef = routeRef;
		this.destinationDisplayRef = destinationDisplayRef;
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

	public String getRouteRef() {
		return routeRef;
	}

	public void setRouteRef(String routeRef) {
		this.routeRef = routeRef;
	}

	public String getDestinationDisplayRef() {
		return destinationDisplayRef;
	}

	public void setDestinationDisplayRef(String destinationDisplayRef) {
		this.destinationDisplayRef = destinationDisplayRef;
	}

	@Override
	public String toString() {
		return "ServiceJourneyPatternEntity [id=" + id + ", version=" + version + ", routeRef=" + routeRef
				+ ", destinationDisplayRef=" + destinationDisplayRef + "]";
	}

}
