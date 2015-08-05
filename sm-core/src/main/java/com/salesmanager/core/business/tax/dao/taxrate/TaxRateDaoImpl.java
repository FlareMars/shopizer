package com.salesmanager.core.business.tax.dao.taxrate;

import java.util.List;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mysema.query.jpa.JPQLQuery;
import com.mysema.query.jpa.impl.JPAQuery;
import com.salesmanager.core.business.generic.dao.SalesManagerEntityDaoImpl;
import com.salesmanager.core.business.merchant.model.MerchantStore;
import com.salesmanager.core.business.reference.country.model.Country;
import com.salesmanager.core.business.reference.language.model.Language;
import com.salesmanager.core.business.reference.zone.model.Zone;
import com.salesmanager.core.business.tax.model.taxclass.TaxClass;
import com.salesmanager.core.business.tax.model.taxrate.QTaxRate;
import com.salesmanager.core.business.tax.model.taxrate.QTaxRateDescription;
import com.salesmanager.core.business.tax.model.taxrate.TaxRate;

@Repository("taxRateDao")
public class TaxRateDaoImpl extends SalesManagerEntityDaoImpl<Long, TaxRate> implements TaxRateDao{

	private static final org.slf4j.Logger LOGGER = LoggerFactory
			.getLogger(TaxRateDaoImpl.class);

	public TaxRateDaoImpl() {
		super();
	}
	
	@Override
	public List<TaxRate> listByStore(MerchantStore store) {
		
		
		QTaxRate qTax = QTaxRate.taxRate1;
		QTaxRateDescription qTaxDescription = QTaxRateDescription.taxRateDescription;

		JPQLQuery query = new JPAQuery (getEntityManager());
		
		query.from(qTax)
			.leftJoin(qTax.merchantStore).fetch()
			.leftJoin(qTax.descriptions,qTaxDescription).fetch()
			.join(qTax.country).fetch()
			.leftJoin(qTax.zone).fetch()
			.leftJoin(qTax.parent).fetch()
			.where(qTax.merchantStore.id.eq(store.getId())
			).orderBy(qTax.taxPriority.asc());
		
		List<TaxRate> taxes = query.list(qTax);
		return taxes;
		
		
		
	}
	
	@Override
	public List<TaxRate> listByStore(MerchantStore store, Language language) {
		
		
		QTaxRate qTax = QTaxRate.taxRate1;
		QTaxRateDescription qTaxDescription = QTaxRateDescription.taxRateDescription;

		JPQLQuery query = new JPAQuery (getEntityManager());
		
		query.from(qTax)
			.leftJoin(qTax.merchantStore).fetch()
			.leftJoin(qTax.descriptions,qTaxDescription).fetch()
			.join(qTax.country).fetch()
			.leftJoin(qTax.zone).fetch()
			.leftJoin(qTax.parent).fetch()
			.where(qTax.merchantStore.id.eq(store.getId())
			.and(qTaxDescription.language.id.eq(language.getId())))
			.orderBy(qTax.taxPriority.asc());
		
		List<TaxRate> taxes = query.list(qTax);
		return taxes;
		
		
		
	}
	
	@Override
	public TaxRate getByCode(String code, MerchantStore store) {
		
		
		QTaxRate qTax = QTaxRate.taxRate1;
		QTaxRateDescription qTaxDescription = QTaxRateDescription.taxRateDescription;

		JPQLQuery query = new JPAQuery (getEntityManager());
		
		query.from(qTax)
			.leftJoin(qTax.merchantStore).fetch()
			.leftJoin(qTax.descriptions,qTaxDescription).fetch()
			.join(qTax.country).fetch()
			.leftJoin(qTax.zone).fetch()
			.leftJoin(qTax.parent).fetch()
			.where(qTax.merchantStore.id.eq(store.getId())
			.and(qTax.code.eq(code))		
			).orderBy(qTax.taxPriority.asc());
		
		TaxRate tax = query.uniqueResult(qTax);
		return tax;
		
		
		
	}
	
	@Override
	public TaxRate getById(Long id) {
		
		
		QTaxRate qTax = QTaxRate.taxRate1;
		QTaxRateDescription qTaxDescription = QTaxRateDescription.taxRateDescription;

		JPQLQuery query = new JPAQuery (getEntityManager());
		
		query.from(qTax)
			.leftJoin(qTax.merchantStore).fetch()
			.leftJoin(qTax.descriptions,qTaxDescription).fetch()
			.join(qTax.country).fetch()
			.leftJoin(qTax.zone).fetch()
			.leftJoin(qTax.parent).fetch()
			.where(qTax.id.eq(id)
			).orderBy(qTax.taxPriority.asc());
		
		TaxRate tax = query.uniqueResult(qTax);
		return tax;
		
		
		
	}
	
	@Override
	public List<TaxRate> listByCountryZoneAndTaxClass(Country country, Zone zone, TaxClass taxClass, MerchantStore store, Language language) {
		
		
		QTaxRate qTax = QTaxRate.taxRate1;
		QTaxRateDescription qTaxDescription = QTaxRateDescription.taxRateDescription;

		JPQLQuery query = new JPAQuery (getEntityManager());
//        System.out.println("---------------RUNNING HERE1--------------------");
//        System.out.println(qTax.merchantStore);
//        System.out.println(qTax.descriptions);
//        System.out.println(qTax.country);
//        System.out.println(qTax.zone);
//        System.out.println(qTax.parent);
//        System.out.println(qTax.merchantStore.id);
//        System.out.println(store.getId());
//        System.out.println(zone.getId());
//        System.out.println(qTaxDescription.language.id);
//        System.out.println("---------------RUNNING HERE2--------------------");
		query.from(qTax)
			.leftJoin(qTax.merchantStore).fetch()
			.leftJoin(qTax.descriptions,qTaxDescription).fetch()
			.join(qTax.country).fetch()
			.leftJoin(qTax.zone).fetch()
			.leftJoin(qTax.parent).fetch()
			.where(qTax.merchantStore.id.eq(store.getId())
			.and(
					qTax.isNotNull().and(qTax.zone.id.eq(zone.getId())).or(qTax.isNull())
			)
			.and(qTax.country.id.eq(country.getId())
			.and(qTaxDescription.language.id.eq(language.getId())))
			).orderBy(qTax.taxPriority.asc());
		List<TaxRate> taxes = query.list(qTax);
		return taxes;

	}
	
	
	@Override
	public List<TaxRate> listByCountryStateProvinceAndTaxClass(Country country, String stateProvince, TaxClass taxClass, MerchantStore store, Language language) {
		
		
		QTaxRate qTax = QTaxRate.taxRate1;
		QTaxRateDescription qTaxDescription = QTaxRateDescription.taxRateDescription;

		JPQLQuery query = new JPAQuery (getEntityManager());
		
		query.from(qTax)
			.leftJoin(qTax.merchantStore).fetch()
			.leftJoin(qTax.descriptions,qTaxDescription).fetch()
			.join(qTax.country).fetch()
			.leftJoin(qTax.parent).fetch()
			.where(qTax.merchantStore.id.eq(store.getId())
			.and(
					qTax.stateProvince.eq(stateProvince)
			)
			.and(qTax.country.id.eq(country.getId())
			.and(qTaxDescription.language.id.eq(language.getId())))
			).orderBy(qTax.taxPriority.asc());
		
		List<TaxRate> taxes = query.list(qTax);
		return taxes;

	}
	
	
}