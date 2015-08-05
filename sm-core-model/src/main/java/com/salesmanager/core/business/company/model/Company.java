package com.salesmanager.core.business.company.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import com.salesmanager.core.business.generic.model.SalesManagerEntity;
import com.salesmanager.core.business.reference.country.model.Country;
import com.salesmanager.core.business.reference.currency.model.Currency;
import com.salesmanager.core.business.reference.zone.model.Zone;
import com.salesmanager.core.constants.SchemaConstant;
import com.salesmanager.core.utils.CloneUtils;

@Entity
@Table(name = "COMPANY", schema=SchemaConstant.SALESMANAGER_SCHEMA)
public class Company extends SalesManagerEntity<Integer, Company> {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2073172657479304447L;


	public Company() {
	}
	
	public static final String DEFAULT_ADMIN = "SUPERADMIN";
	
	@Id
	@Column(name="COMPANY_ID", unique=true, nullable=false)
	@TableGenerator(name = "TABLE_GEN", table = "SM_SEQUENCER", pkColumnName = "SEQ_NAME", valueColumnName = "SEQ_COUNT", pkColumnValue = "COMPANY_SEQ_NEXT_VAL")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "TABLE_GEN")
	private Integer id;
	
	@NotEmpty
	@Pattern(regexp="^[a-zA-Z0-9_]*$")
	@Column(name = "COMPANY_ADMIN", nullable=false, unique=true, length=100)
	private String code;
	
	@Column(name = "COMPANY_INFO_STATE_PROV", length=100)
	private String companyStateProvince;

	@Column(name = "COMPANY_INFO_ADDRESS")
	private String companyAddress;
	
	@Column(name = "COMPANY_INFO_CITY", length=100)
	private String companyCity;
	
	@Column(name = "COMPANY_INFO_POSTAL_CODE", length=15)
	private String companyPostalCode;
	
	@Column(name = "COMPANY_INFO_WORK_NUMBER", length=50)
	private String companyWorkNumber;
	
	@Column(name = "COMPANY_INFO_MOBILE_NUMBER", length=50)
	private String companyMobileNumber;
	
	@Column(name = "COMPANY_INFO_FAX_NUMBER", length=50)
	private String companyFaxNumber;
	
	@Column(name = "COMPANY_INFO_EMAIL", length=60, nullable=true)
	private String companyEmailAddress;
	
	@Column(name = "COMPANY_INFO_ALTERNATE_EMAIL", length=60, nullable=true)
	private String companyAlternateEmailAddress;
	
	@NotEmpty
	@Column(name = "COMPANY_INFO_DISPLAY_NAME", nullable=false, length=100)
	private String companyDisplayName;
	
	@NotEmpty
	@Column(name = "COMPANY_INFO_TRADING_NAME", nullable=false, length=100)
	private String companyTradingName;
	
	@Column(name = "COMPANY_INFO_ROC", nullable=true, length=50)
	private String companyROC;
	
	@Column(name = "COMPANY_INFO_PAN", nullable=true, length=10)
	private String companyPAN;
	
	@Column(name = "COMPANY_INFO_TAN", nullable=true, length=50)
	private String companyTAN;
	
	@Column(name = "COMPANY_INFO_TIN", nullable=true, length=50)
	private String companyTIN;
	
	@Column(name = "COMPANY_INFO_ST_NUMBER", nullable=true, length=50)
	private String companySTNumber;
	
	@Column(name = "COMPANY_INFO_TYPE", nullable=true, length=100)
	private String companyType;
	
	@Transient
	private String companyLogo;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "COMPANY_IN_BUSINESS_SINCE")
	private Date companyInBusinessSince = new Date();;
	
	@Transient
	private String dateBusinessSince;
	
	@Column(name="COMPANY_INVOICE_TEMPLATE", length=25)
	private String companyInvoiceTemplate;
	
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Country.class)
	@JoinColumn(name="COMPANY_COUNTRY_ID", nullable=true, updatable=true)
	private Country companyCountry;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="COMPANY_ZONE_ID", nullable=true, updatable=true)
	private Zone companyZone;
	
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Currency.class)
	@JoinColumn(name = "COMPANY_CURRENCY_ID", nullable=true)
	private Currency companyCurrency;
	
	/*@ManyToOne(fetch = FetchType.LAZY, targetEntity = Language.class)
	@JoinColumn(name = "COMPANY_LANGUAGE_ID", nullable=true)
	private Language defaultCompanyLanguage;
	
	@NotEmpty
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "MERCHANT_LANGUAGE")
	private List<Language> languages = new ArrayList<Language>();*/
	
	
	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the companyStateProvince
	 */
	public String getCompanyStateProvince() {
		return companyStateProvince;
	}
	
	/**
	 * @param companyStateProvince the companyStateProvince to set
	 */
	public void setCompanyStateProvince(String companyStateProvince) {
		this.companyStateProvince = companyStateProvince;
	}
	
	/**
	 * @return the companyAddress
	 */
	public String getCompanyAddress() {
		return companyAddress;
	}

	/**
	 * @param companyAddress the companyAddress to set
	 */
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	/**
	 * @return the companyCity
	 */
	public String getCompanyCity() {
		return companyCity;
	}

	/**
	 * @param companyCity the companyCity to set
	 */
	public void setCompanyCity(String companyCity) {
		this.companyCity = companyCity;
	}

	/**
	 * @return the companyPostalCode
	 */
	public String getCompanyPostalCode() {
		return companyPostalCode;
	}

	/**
	 * @param companyPostalCode the companyPostalCode to set
	 */
	public void setCompanyPostalCode(String companyPostalCode) {
		this.companyPostalCode = companyPostalCode;
	}

	/**
	 * @return the companyWorkNumber
	 */
	public String getCompanyWorkNumber() {
		return companyWorkNumber;
	}

	/**
	 * @param companyWorkNumber the companyWorkNumber to set
	 */
	public void setCompanyWorkNumber(String companyWorkNumber) {
		this.companyWorkNumber = companyWorkNumber;
	}

	/**
	 * @return the companyMobileNumber
	 */
	public String getCompanyMobileNumber() {
		return companyMobileNumber;
	}

	/**
	 * @param companyMobileNumber the companyMobileNumber to set
	 */
	public void setCompanyMobileNumber(String companyMobileNumber) {
		this.companyMobileNumber = companyMobileNumber;
	}

	/**
	 * @return the companyFaxNumber
	 */
	public String getCompanyFaxNumber() {
		return companyFaxNumber;
	}

	/**
	 * @param companyFaxNumber the companyFaxNumber to set
	 */
	public void setCompanyFaxNumber(String companyFaxNumber) {
		this.companyFaxNumber = companyFaxNumber;
	}

	/**
	 * @return the companyEmailAddress
	 */
	public String getCompanyEmailAddress() {
		return companyEmailAddress;
	}

	/**
	 * @param companyEmailAddress the companyEmailAddress to set
	 */
	public void setCompanyEmailAddress(String companyEmailAddress) {
		this.companyEmailAddress = companyEmailAddress;
	}

	/**
	 * @return the companyAlternateEmailAddress
	 */
	public String getCompanyAlternateEmailAddress() {
		return companyAlternateEmailAddress;
	}

	/**
	 * @param companyAlternateEmailAddress the companyAlternateEmailAddress to set
	 */
	public void setCompanyAlternateEmailAddress(String companyAlternateEmailAddress) {
		this.companyAlternateEmailAddress = companyAlternateEmailAddress;
	}

	/**
	 * @return the companyDisplayName
	 */
	public String getCompanyDisplayName() {
		return companyDisplayName;
	}

	/**
	 * @param companyDisplayName the companyDisplayName to set
	 */
	public void setCompanyDisplayName(String companyDisplayName) {
		this.companyDisplayName = companyDisplayName;
	}

	/**
	 * @return the companyTradingName
	 */
	public String getCompanyTradingName() {
		return companyTradingName;
	}

	/**
	 * @param companyTradingName the companyTradingName to set
	 */
	public void setCompanyTradingName(String companyTradingName) {
		this.companyTradingName = companyTradingName;
	}

	/**
	 * @return the companyROC
	 */
	public String getCompanyROC() {
		return companyROC;
	}

	/**
	 * @param companyROC the companyROC to set
	 */
	public void setCompanyROC(String companyROC) {
		this.companyROC = companyROC;
	}

	/**
	 * @return the companyPAN
	 */
	public String getCompanyPAN() {
		return companyPAN;
	}

	/**
	 * @param companyPAN the companyPAN to set
	 */
	public void setCompanyPAN(String companyPAN) {
		this.companyPAN = companyPAN;
	}

	/**
	 * @return the companyTAN
	 */
	public String getCompanyTAN() {
		return companyTAN;
	}

	/**
	 * @param companyTAN the companyTAN to set
	 */
	public void setCompanyTAN(String companyTAN) {
		this.companyTAN = companyTAN;
	}

	/**
	 * @return the companyTIN
	 */
	public String getCompanyTIN() {
		return companyTIN;
	}

	/**
	 * @param companyTIN the companyTIN to set
	 */
	public void setCompanyTIN(String companyTIN) {
		this.companyTIN = companyTIN;
	}

	/**
	 * @return the companySTNumber
	 */
	public String getCompanySTNumber() {
		return companySTNumber;
	}

	/**
	 * @param companySTNumber the companySTNumber to set
	 */
	public void setCompanySTNumber(String companySTNumber) {
		this.companySTNumber = companySTNumber;
	}

	/**
	 * @return the companyType
	 */
	public String getCompanyType() {
		return companyType;
	}

	/**
	 * @param companyType the companyType to set
	 */
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	/**
	 * @return the companyLogo
	 */
	public String getCompanyLogo() {
		return companyLogo;
	}

	/**
	 * @param companyLogo the companyLogo to set
	 */
	public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
	}

	/**
	 * @return the companyInBusinessSince
	 */
	public Date getCompanyInBusinessSince() {
		return  CloneUtils.clone(companyInBusinessSince);
	}

	/**
	 * @param companyInBusinessSince the companyInBusinessSince to set
	 */
	public void setCompanyInBusinessSince(Date companyInBusinessSince) {
		this.companyInBusinessSince = CloneUtils.clone(companyInBusinessSince);
	}

	/**
	 * @return the companyInvoiceTemplate
	 */
	public String getCompanyInvoiceTemplate() {
		return companyInvoiceTemplate;
	}

	/**
	 * @param companyInvoiceTemplate the companyInvoiceTemplate to set
	 */
	public void setCompanyInvoiceTemplate(String companyInvoiceTemplate) {
		this.companyInvoiceTemplate = companyInvoiceTemplate;
	}

	/**
	 * @return the companyCountry
	 */
	public Country getCompanyCountry() {
		return companyCountry;
	}

	/**
	 * @param companyCountry the companyCountry to set
	 */
	public void setCompanyCountry(Country companyCountry) {
		this.companyCountry = companyCountry;
	}

	/**
	 * @return the companyCurrency
	 */
	public Currency getCompanyCurrency() {
		return companyCurrency;
	}

	/**
	 * @param companyCurrency the companyCurrency to set
	 */
	public void setCompanyCurrency(Currency companyCurrency) {
		this.companyCurrency = companyCurrency;
	}

	/**
	 * @return the companyLanguage
	 *//*
	public List<Language> getLanguages() {
		return languages;
	}

	*//**
	 * @param companyLanguage the companyLanguage to set
	 *//*
	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	*//**
	 * @return the defaultCompanyLanguage
	 *//*
	public Language getDefaultCompanyLanguage() {
		return defaultCompanyLanguage;
	}

	*//**
	 * @param defaultCompanyLanguage the defaultCompanyLanguage to set
	 *//*
	public void setDefaultCompanyLanguage(Language defaultCompanyLanguage) {
		this.defaultCompanyLanguage = defaultCompanyLanguage;
	}*/

	/**
	 * @return the dateBusinessSince
	 */
	public String getDateBusinessSince() {
		return dateBusinessSince;
	}

	/**
	 * @param dateBusinessSince the dateBusinessSince to set
	 */
	public void setDateBusinessSince(String dateBusinessSince) {
		this.dateBusinessSince = dateBusinessSince;
	}

	/**
	 * @return the companyZone
	 */
	public Zone getCompanyZone() {
		return companyZone;
	}

	/**
	 * @param companyZone the companyZone to set
	 */
	public void setCompanyZone(Zone companyZone) {
		this.companyZone = companyZone;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
}
