package com.spring.entities.model;

import java.util.Date;

public class EntityAddr {
	
	private int addrId;
	private String addrLine1;
	private String addrType;
	private String dateTimeLastModified;
	private String defaultRecord;
	private String osUserLastModified;
	private String postCd;
	private String requestingEntity;
	private String sessUserLastModified;
	private String street;
	private String suburb;
	private String tenantId;
	private String townOrCity;
	//private List<AddrLink> addrLinks;
	//private Entity entity;
	
	public EntityAddr() {
		
	}
	
	public int getAddrId() {
		return addrId;
	}
	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}
	public String getAddrLine1() {
		return addrLine1;
	}
	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}
	public String getAddrType() {
		return addrType;
	}
	public void setAddrType(String addrType) {
		this.addrType = addrType;
	}
	public String getDateTimeLastModified() {
		return dateTimeLastModified;
	}
	public void setDateTimeLastModified(String dateTimeLastModified) {
		this.dateTimeLastModified = dateTimeLastModified;
	}
	public String getDefaultRecord() {
		return defaultRecord;
	}
	public void setDefaultRecord(String defaultRecord) {
		this.defaultRecord = defaultRecord;
	}
	public String getOsUserLastModified() {
		return osUserLastModified;
	}
	public void setOsUserLastModified(String osUserLastModified) {
		this.osUserLastModified = osUserLastModified;
	}
	public String getPostCd() {
		return postCd;
	}
	public void setPostCd(String postCd) {
		this.postCd = postCd;
	}
	public String getRequestingEntity() {
		return requestingEntity;
	}
	public void setRequestingEntity(String requestingEntity) {
		this.requestingEntity = requestingEntity;
	}
	public String getSessUserLastModified() {
		return sessUserLastModified;
	}
	public void setSessUserLastModified(String sessUserLastModified) {
		this.sessUserLastModified = sessUserLastModified;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getSuburb() {
		return suburb;
	}
	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public String getTownOrCity() {
		return townOrCity;
	}
	public void setTownOrCity(String townOrCity) {
		this.townOrCity = townOrCity;
	}
	public EntityAddr(int addrId, String addrLine1, String addrType, String dateTimeLastModified,
			String defaultRecord, String osUserLastModified, String postCd, String requestingEntity,
			String sessUserLastModified, String street, String suburb, String tenantId, String townOrCity) {
		super();
		this.addrId = addrId;
		this.addrLine1 = addrLine1;
		this.addrType = addrType;
		this.dateTimeLastModified = dateTimeLastModified;
		this.defaultRecord = defaultRecord;
		this.osUserLastModified = osUserLastModified;
		this.postCd = postCd;
		this.requestingEntity = requestingEntity;
		this.sessUserLastModified = sessUserLastModified;
		this.street = street;
		this.suburb = suburb;
		this.tenantId = tenantId;
		this.townOrCity = townOrCity;
	}

	public EntityAddr( String addrLine1, String addrType, String dateTimeLastModified,
			String defaultRecord, String osUserLastModified, String postCd, String requestingEntity,
			String sessUserLastModified, String street, String suburb, String tenantId, String townOrCity) {
		this.addrLine1 = addrLine1;
		this.addrType = addrType;
		this.dateTimeLastModified = dateTimeLastModified;
		this.defaultRecord = defaultRecord;
		this.osUserLastModified = osUserLastModified;
		this.postCd = postCd;
		this.requestingEntity = requestingEntity;
		this.sessUserLastModified = sessUserLastModified;
		this.street = street;
		this.suburb = suburb;
		this.tenantId = tenantId;
		this.townOrCity = townOrCity;
	}
}
