package org.rutebanken.netex.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="day_type")
public class DayTypeEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "short_name")
    private String shortName;
    
    @Column(name = "property_of_day")
    private String propertyOfDay;

	public DayTypeEntity(String id, String version, String name, String shortName, String propertyOfDay) {
		super();
		this.id = id;
		this.version = version;
		this.name = name;
		this.shortName = shortName;
		this.propertyOfDay = propertyOfDay;
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

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getPropertyOfDay() {
		return propertyOfDay;
	}

	public void setPropertyOfDay(String propertyOfDay) {
		this.propertyOfDay = propertyOfDay;
	}

	@Override
	public String toString() {
		return "DayTypeEntity [id=" + id + ", version=" + version + ", name=" + name + ", shortName=" + shortName
				+ ", propertyOfDay=" + propertyOfDay + "]";
	}
    
}
