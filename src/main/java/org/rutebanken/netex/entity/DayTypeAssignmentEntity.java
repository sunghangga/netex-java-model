package org.rutebanken.netex.entity;

import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="day_type_assignment")
public class DayTypeAssignmentEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "orders")
    private BigInteger orders;
    
    @Column(name = "date")
    private LocalDateTime date;
    
    @Column(name = "day_type_ref")
    private String dayTypeRef;

	public DayTypeAssignmentEntity(String id, String version, BigInteger orders, LocalDateTime date,
			String dayTypeRef) {
		super();
		this.id = id;
		this.version = version;
		this.orders = orders;
		this.date = date;
		this.dayTypeRef = dayTypeRef;
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

	public BigInteger getOrders() {
		return orders;
	}

	public void setOrders(BigInteger orders) {
		this.orders = orders;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getDayTypeRef() {
		return dayTypeRef;
	}

	public void setDayTypeRef(String dayTypeRef) {
		this.dayTypeRef = dayTypeRef;
	}

	@Override
	public String toString() {
		return "DayTypeAssignmentEntity [id=" + id + ", version=" + version + ", orders=" + orders + ", date=" + date
				+ ", dayTypeRef=" + dayTypeRef + "]";
	}
	
}
