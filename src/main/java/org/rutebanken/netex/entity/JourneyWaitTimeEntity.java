package org.rutebanken.netex.entity;

import java.time.Duration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="journey_wait_time")
public class JourneyWaitTimeEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "scheduled_stop_point_ref")
    private String scheduledStopPointRef;
    
    @Column(name = "wait_time")
    private Duration waitTime;
    
    @Column(name = "time_demand_type_ref")
    private String timeDemandTypeRef;

	public JourneyWaitTimeEntity(String id, String version, String scheduledStopPointRef, Duration waitTime,
			String timeDemandTypeRef) {
		super();
		this.id = id;
		this.version = version;
		this.scheduledStopPointRef = scheduledStopPointRef;
		this.waitTime = waitTime;
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

	public Duration getWaitTime() {
		return waitTime;
	}

	public void setWaitTime(Duration waitTime) {
		this.waitTime = waitTime;
	}

	public String getTimeDemandTypeRef() {
		return timeDemandTypeRef;
	}

	public void setTimeDemandTypeRef(String timeDemandTypeRef) {
		this.timeDemandTypeRef = timeDemandTypeRef;
	}

	@Override
	public String toString() {
		return "JourneyWaitTimeEntity [id=" + id + ", version=" + version + ", scheduledStopPointRef="
				+ scheduledStopPointRef + ", waitTime=" + waitTime + ", timeDemandTypeRef=" + timeDemandTypeRef + "]";
	}
    
}
