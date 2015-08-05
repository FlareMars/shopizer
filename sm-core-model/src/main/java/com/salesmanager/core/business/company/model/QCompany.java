package com.salesmanager.core.business.company.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QCompany is a Querydsl query type for Company
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCompany extends EntityPathBase<Company> {

    private static final long serialVersionUID = -717572632;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QCompany company = new QCompany("company");

    public final com.salesmanager.core.business.generic.model.QSalesManagerEntity _super = new com.salesmanager.core.business.generic.model.QSalesManagerEntity(this);

    public final StringPath code = createString("code");

    public final StringPath companyAddress = createString("companyAddress");

    public final StringPath companyAlternateEmailAddress = createString("companyAlternateEmailAddress");

    public final StringPath companyCity = createString("companyCity");

    public final com.salesmanager.core.business.reference.country.model.QCountry companyCountry;

    public final com.salesmanager.core.business.reference.currency.model.QCurrency companyCurrency;

    public final StringPath companyDisplayName = createString("companyDisplayName");

    public final StringPath companyEmailAddress = createString("companyEmailAddress");

    public final StringPath companyFaxNumber = createString("companyFaxNumber");

    public final DateTimePath<java.util.Date> companyInBusinessSince = createDateTime("companyInBusinessSince", java.util.Date.class);

    public final StringPath companyInvoiceTemplate = createString("companyInvoiceTemplate");

    public final StringPath companyMobileNumber = createString("companyMobileNumber");

    public final StringPath companyPAN = createString("companyPAN");

    public final StringPath companyPostalCode = createString("companyPostalCode");

    public final StringPath companyROC = createString("companyROC");

    public final StringPath companyStateProvince = createString("companyStateProvince");

    public final StringPath companySTNumber = createString("companySTNumber");

    public final StringPath companyTAN = createString("companyTAN");

    public final StringPath companyTIN = createString("companyTIN");

    public final StringPath companyTradingName = createString("companyTradingName");

    public final StringPath companyType = createString("companyType");

    public final StringPath companyWorkNumber = createString("companyWorkNumber");

    public final com.salesmanager.core.business.reference.zone.model.QZone companyZone;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    //inherited
    public final BooleanPath new$ = _super.new$;

    public QCompany(String variable) {
        this(Company.class, forVariable(variable), INITS);
    }

    public QCompany(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCompany(PathMetadata<?> metadata, PathInits inits) {
        this(Company.class, metadata, inits);
    }

    public QCompany(Class<? extends Company> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.companyCountry = inits.isInitialized("companyCountry") ? new com.salesmanager.core.business.reference.country.model.QCountry(forProperty("companyCountry"), inits.get("companyCountry")) : null;
        this.companyCurrency = inits.isInitialized("companyCurrency") ? new com.salesmanager.core.business.reference.currency.model.QCurrency(forProperty("companyCurrency")) : null;
        this.companyZone = inits.isInitialized("companyZone") ? new com.salesmanager.core.business.reference.zone.model.QZone(forProperty("companyZone"), inits.get("companyZone")) : null;
    }

}

