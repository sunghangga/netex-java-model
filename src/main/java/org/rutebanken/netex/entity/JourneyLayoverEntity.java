package org.rutebanken.netex.entity;

import java.time.Duration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="journey_layover")
public class JourneyLayoverEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "scheduled_stop_point_ref")
    private String scheduledStopPointRef;
    
    @Column(name = "layover")
    private Duration layover;
    
    @Column(name = "time_demand_type_ref")
    private String timeDemandTypeRef;

	public JourneyLayoverEntity(String id, String version, String scheduledStopPointRef, Duration layover,
			String timeDemandTypeRef) {
		super();
		this.id = id;
		this.version = version;
		this.scheduledStopPointRef = scheduledStopPointRef;
		this.layover = layover;
		this.timeDemandTypeRef = timeDemandTypeRef;
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

	public String getScheduledStopPointRef() {
		return scheduledStopPointRef;
	}

	public void setScheduledStopPointRef(String scheduledStopPointRef) {
		this.scheduledStopPointRef = scheduledStopPointRef;
	}

	public Duration getLayover() {
		return layover;
	}

	public void setLayover(Duration layover) {
		this.layover = layover;
	}

	public String getTimeDemandTypeRef() {
		return timeDemandTypeRef;
	}

	public void setTimeDemandTypeRef(String timeDemandTypeRef) {
		this.timeDemandTypeRef = timeDemandTypeRef;
	}

	@Override
	public String toString() {
		return "JourneyLayoverEntity [id=" + id + ", version=" + version + ", scheduledStopPointRef="
				+ scheduledStopPointRef + ", layover=" + layover + ", timeDemandTypeRef=" + timeDemandTypeRef + "]";
	}

}
