package com.spring.entities.model;

import java.util.List;

public class Entities {
	
	private int entityNo;
	private String dateOfBirth;
	private String dateTimeLastModified;
	private String firstname;
	private String fullName;
	private String init;
	private String language;
	private String languageCd;
	private String legalRefNo;
	private String legalRefNoType;
	private String localeCd;
	private String localeInfoId;
	private String nickname;
	private String osUserLastModified;
	private String personNonPerson;
	private String recordSet;
	private String requestingEntity;
	private String sessUserLastModified;
	private String sex;
	private String surname;
	private String tenantId;
	private String title;
	//private EntityRole entityRole;
	private List<EntityAddr> entityAddrs;
	/*private List<EntityAddrDet> entityAddrDets;
	private List<EntityAttribute> entityAttributes;
	private List<EntityConsent> entityConsents1;
	private List<EntityConsent> entityConsents2;
	private List<EntityConsent> entityConsents3;
	private List<EntityContactDet> entityContactDets;
	private List<EntityCredCardDtl> entityCredCardDtls;
	private List<EntityCrossMap> entityCrossMaps;
	private List<EntityEmail> entityEmails;
	private List<EntityGlobalAddr> entityGlobalAddrs;
	private List<EntityImage> entityImages;
	private List<EntityOtherNo> entityOtherNos;
	private List<EntityPolicyConnHist> entityPolicyConnHists;
	private List<EntityPolicyConnOld> entityPolicyConnOlds;
	private List<EntityRoleUsage> entityRoleUsages;
	private List<EntityServiceSubss> entityServiceSubsses;
	private List<EntityTelNo> entityTelNos;
	private List<EntConsentStatus> entConsentStatuses;
	private EntDeathDate entDeathDate;
	private List<EntOtherName> entOtherNames;
	private List<FactCd> factCds;
	private List<GeneralCorrespondence> generalCorrespondences1;
	private List<GeneralCorrespondence> generalCorrespondences2;
	private InactiveEntity inactiveEntity;
	private List<InfoSrce> infoSrces;
	private Member member;
	private List<SicIndicator> sicIndicators;*/
	public int getEntityNo() {
		return entityNo;
	}
	public void setEntityNo(int entityNo) {
		this.entityNo = entityNo;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getDateTimeLastModified() {
		return dateTimeLastModified;
	}
	public void setDateTimeLastModified(String dateTimeLastModified) {
		this.dateTimeLastModified = dateTimeLastModified;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getInit() {
		return init;
	}
	public void setInit(String init) {
		this.init = init;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getLanguageCd() {
		return languageCd;
	}
	public void setLanguageCd(String languageCd) {
		this.languageCd = languageCd;
	}
	public String getLegalRefNo() {
		return legalRefNo;
	}
	public void setLegalRefNo(String legalRefNo) {
		this.legalRefNo = legalRefNo;
	}
	public String getLegalRefNoType() {
		return legalRefNoType;
	}
	public void setLegalRefNoType(String legalRefNoType) {
		this.legalRefNoType = legalRefNoType;
	}
	public String getLocaleCd() {
		return localeCd;
	}
	public void setLocaleCd(String localeCd) {
		this.localeCd = localeCd;
	}
	public String getLocaleInfoId() {
		return localeInfoId;
	}
	public void setLocaleInfoId(String localeInfoId) {
		this.localeInfoId = localeInfoId;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getOsUserLastModified() {
		return osUserLastModified;
	}
	public void setOsUserLastModified(String osUserLastModified) {
		this.osUserLastModified = osUserLastModified;
	}
	public String getPersonNonPerson() {
		return personNonPerson;
	}
	public void setPersonNonPerson(String personNonPerson) {
		this.personNonPerson = personNonPerson;
	}
	public String getRecordSet() {
		return recordSet;
	}
	public void setRecordSet(String recordSet) {
		this.recordSet = recordSet;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<EntityAddr> getEntityAddrs() {
		return entityAddrs;
	}
	public void setEntityAddrs(List<EntityAddr> entityAddrs) {
		this.entityAddrs = entityAddrs;
	}
	public Entities(int entityNo, String dateOfBirth, String dateTimeLastModified, String firstname, String fullName,
			String init, String language, String languageCd, String legalRefNo, String legalRefNoType, String localeCd,
			String localeInfoId, String nickname, String osUserLastModified, String personNonPerson, String recordSet,
			String requestingEntity, String sessUserLastModified, String sex, String surname, String tenantId,
			String title, List<EntityAddr> entityAddrs) {
		super();
		this.entityNo = entityNo;
		this.dateOfBirth = dateOfBirth;
		this.dateTimeLastModified = dateTimeLastModified;
		this.firstname = firstname;
		this.fullName = fullName;
		this.init = init;
		this.language = language;
		this.languageCd = languageCd;
		this.legalRefNo = legalRefNo;
		this.legalRefNoType = legalRefNoType;
		this.localeCd = localeCd;
		this.localeInfoId = localeInfoId;
		this.nickname = nickname;
		this.osUserLastModified = osUserLastModified;
		this.personNonPerson = personNonPerson;
		this.recordSet = recordSet;
		this.requestingEntity = requestingEntity;
		this.sessUserLastModified = sessUserLastModified;
		this.sex = sex;
		this.surname = surname;
		this.tenantId = tenantId;
		this.title = title;
		this.entityAddrs = entityAddrs;
	}
	

}

