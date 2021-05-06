package org.rutebanken.netex.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="frame_default")
public class FrameDefaultEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "frame_defaults_seq_gen")
	@SequenceGenerator(name = "frame_defaults_seq_gen", sequenceName = "frame_defaults_id_seq", allocationSize = 1, initialValue = 1)
	@Column(name = "id")
	private int id;
	
	@Column(name = "version")
    private String version;
	
    @Column(name = "default_currency")
    private String defaultCurrency;
    
    @Column(name = "default_data_source_ref")
    private String defaultDataSourceRef;
    
    @Column(name = "default_locale_default_language")
    private String defaultLocaleDefaultLanguage;
    
    @Column(name = "default_locale_time_zone")
    private String defaultLocaleTimeZone;
    
    @Column(name = "default_location_system")
    private String defaultLocationSystem;
    
    @Column(name = "default_responsibility_set_ref")
    private String defaultResponsibilitySetRef;
    
    @Column(name = "default_system_of_units")
    private String defaultSystemOfUnits;

	public FrameDefaultEntity(String version, String defaultCurrency, String defaultDataSourceRef,
			String defaultLocaleDefaultLanguage, String defaultLocaleTimeZone, String defaultLocationSystem,
			String defaultResponsibilitySetRef, String defaultSystemOfUnits) {
		this.version = version;
		this.defaultCurrency = defaultCurrency;
		this.defaultDataSourceRef = defaultDataSourceRef;
		this.defaultLocaleDefaultLanguage = defaultLocaleDefaultLanguage;
		this.defaultLocaleTimeZone = defaultLocaleTimeZone;
		this.defaultLocationSystem = defaultLocationSystem;
		this.defaultResponsibilitySetRef = defaultResponsibilitySetRef;
		this.defaultSystemOfUnits = defaultSystemOfUnits;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDefaultCurrency() {
		return defaultCurrency;
	}

	public void setDefaultCurrency(String defaultCurrency) {
		this.defaultCurrency = defaultCurrency;
	}

	public String getDefaultDataSourceRef() {
		return defaultDataSourceRef;
	}

	public void setDefaultDataSourceRef(String defaultDataSourceRef) {
		this.defaultDataSourceRef = defaultDataSourceRef;
	}

	public String getDefaultLocaleDefaultLanguage() {
		return defaultLocaleDefaultLanguage;
	}

	public void setDefaultLocaleDefaultLanguage(String defaultLocaleDefaultLanguage) {
		this.defaultLocaleDefaultLanguage = defaultLocaleDefaultLanguage;
	}

	public String getDefaultLocaleTimeZone() {
		return defaultLocaleTimeZone;
	}

	public void setDefaultLocaleTimeZone(String defaultLocaleTimeZone) {
		this.defaultLocaleTimeZone = defaultLocaleTimeZone;
	}

	public String getDefaultLocationSystem() {
		return defaultLocationSystem;
	}

	public void setDefaultLocationSystem(String defaultLocationSystem) {
		this.defaultLocationSystem = defaultLocationSystem;
	}

	public String getDefaultResponsibilitySetRef() {
		return defaultResponsibilitySetRef;
	}

	public void setDefaultResponsibilitySetRef(String defaultResponsibilitySetRef) {
		this.defaultResponsibilitySetRef = defaultResponsibilitySetRef;
	}

	public String getDefaultSystemOfUnits() {
		return defaultSystemOfUnits;
	}

	public void setDefaultSystemOfUnits(String defaultSystemOfUnits) {
		this.defaultSystemOfUnits = defaultSystemOfUnits;
	}

	@Override
	public String toString() {
		return "FrameDefaultsEntity [id=" + id + ", version=" + version + ", defaultCurrency=" + defaultCurrency
				+ ", defaultDataSourceRef=" + defaultDataSourceRef + ", defaultLocaleDefaultLanguage="
				+ defaultLocaleDefaultLanguage + ", defaultLocaleTimeZone=" + defaultLocaleTimeZone
				+ ", defaultLocationSystem=" + defaultLocationSystem + ", defaultResponsibilitySetRef="
				+ defaultResponsibilitySetRef + ", defaultSystemOfUnits=" + defaultSystemOfUnits + "]";
	}
	
}
