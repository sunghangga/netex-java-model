package org.rutebanken.netex.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="operational_context")
public class OperationalContextEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "vehicle_mode")
    private String vehicleMode;
    
    @Column(name = "transport_submode")
    private String transportSubmode;

	public OperationalContextEntity(String id, String version, String vehicleMode, String transportSubmode) {
		super();
		this.id = id;
		this.version = version;
		this.vehicleMode = vehicleMode;
		this.transportSubmode = transportSubmode;
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

	public String getVehicleMode() {
		return vehicleMode;
	}

	public void setVehicleMode(String vehicleMode) {
		this.vehicleMode = vehicleMode;
	}

	public String getTransportSubmode() {
		return transportSubmode;
	}

	public void setTransportSubmode(String transportSubmode) {
		this.transportSubmode = transportSubmode;
	}

	@Override
	public String toString() {
		return "OperationalContextEntity [id=" + id + ", version=" + version + ", vehicleMode=" + vehicleMode
				+ ", transportSubmode=" + transportSubmode + "]";
	}

}
