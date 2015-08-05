package com.salesmanager.core.business.reference.country.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QCountry is a Querydsl query type for Country
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCountry extends EntityPathBase<Country> {

    private static final long serialVersionUID = -724931401;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QCountry country = new QCountry("country");

    public final com.salesmanager.core.business.generic.model.QSalesManagerEntity _super = new com.salesmanager.core.business.generic.model.QSalesManagerEntity(this);

    public final ListPath<CountryDescription, QCountryDescription> descriptions = this.<CountryDescription, QCountryDescription>createList("descriptions", CountryDescription.class, QCountryDescription.class,INITS);

    public final com.salesmanager.core.business.reference.geozone.model.QGeoZone geoZone;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath isoCode = createString("isoCode");

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final BooleanPath supported = createBoolean("supported");

    public final ListPath<com.salesmanager.core.business.reference.zone.model.Zone, com.salesmanager.core.business.reference.zone.model.QZone> zones = this.<com.salesmanager.core.business.reference.zone.model.Zone, com.salesmanager.core.business.reference.zone.model.QZone>createList("zones", com.salesmanager.core.business.reference.zone.model.Zone.class, com.salesmanager.core.business.reference.zone.model.QZone.class,INITS);

    public QCountry(String variable) {
        this(Country.class, forVariable(variable), INITS);
    }

    public QCountry(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCountry(PathMetadata<?> metadata, PathInits inits) {
        this(Country.class, metadata, inits);
    }

    public QCountry(Class<? extends Country> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.geoZone = inits.isInitialized("geoZone") ? new com.salesmanager.core.business.reference.geozone.model.QGeoZone(forProperty("geoZone")) : null;
    }

}

