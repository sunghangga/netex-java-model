package org.rutebanken.netex.entity;

import java.time.Duration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="journey_run_time")
public class JourneyRunTimeEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "timing_link_ref")
    private String timingLinkRef;
    
    @Column(name = "run_time")
    private Duration runTime;
    
    @Column(name = "time_demand_type_ref")
    private String timeDemandTypeRef;

	public JourneyRunTimeEntity(String id, String version, String timingLinkRef, Duration runTime,
			String timeDemandTypeRef) {
		super();
		this.id = id;
		this.version = version;
		this.timingLinkRef = timingLinkRef;
		this.runTime = runTime;
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

	public String getTimingLinkRef() {
		return timingLinkRef;
	}

	public void setTimingLinkRef(String timingLinkRef) {
		this.timingLinkRef = timingLinkRef;
	}

	public Duration getRunTime() {
		return runTime;
	}

	public void setRunTime(Duration runTime) {
		this.runTime = runTime;
	}

	public String getTimeDemandTypeRef() {
		return timeDemandTypeRef;
	}

	public void setTimeDemandTypeRef(String timeDemandTypeRef) {
		this.timeDemandTypeRef = timeDemandTypeRef;
	}

	@Override
	public String toString() {
		return "JourneyRunTimeEntity [id=" + id + ", version=" + version + ", timingLinkRef=" + timingLinkRef
				+ ", runTime=" + runTime + ", timeDemandTypeRef=" + timeDemandTypeRef + "]";
	}

}
