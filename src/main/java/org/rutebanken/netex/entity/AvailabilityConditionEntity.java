package org.rutebanken.netex.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="availability_condition")
public class AvailabilityConditionEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "from_date")
    private LocalDateTime fromDate;
    
    @Column(name = "to_date")
    private LocalDateTime toDate;
    
    @Column(name = "valid_day_bits")
    @Type(type="text")
    private String validDayBits;

	public AvailabilityConditionEntity(String id, String version, String name, LocalDateTime fromDate,
			LocalDateTime toDate, String validDayBits) {
		super();
		this.id = id;
		this.version = version;
		this.name = name;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.validDayBits = validDayBits;
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

	public LocalDateTime getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDateTime fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDateTime getToDate() {
		return toDate;
	}

	public void setToDate(LocalDateTime toDate) {
		this.toDate = toDate;
	}

	public String getValidDayBits() {
		return validDayBits;
	}

	public void setValidDayBits(String validDayBits) {
		this.validDayBits = validDayBits;
	}

	@Override
	public String toString() {
		return "AvailabilityConditionEntity [id=" + id + ", version=" + version + ", name=" + name + ", fromDate="
				+ fromDate + ", toDate=" + toDate + ", validDayBits=" + validDayBits + "]";
	}

}
