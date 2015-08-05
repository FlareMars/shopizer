package com.salesmanager.core.business.reference.geozone.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QGeoZone is a Querydsl query type for GeoZone
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QGeoZone extends EntityPathBase<GeoZone> {

    private static final long serialVersionUID = 52549221;

    public static final QGeoZone geoZone = new QGeoZone("geoZone");

    private static final PathInits INITS = PathInits.DIRECT;

    public final com.salesmanager.core.business.generic.model.QSalesManagerEntity _super = new com.salesmanager.core.business.generic.model.QSalesManagerEntity(this);

    public final StringPath code = createString("code");

    public final ListPath<com.salesmanager.core.business.reference.country.model.Country, com.salesmanager.core.business.reference.country.model.QCountry> countries = this.<com.salesmanager.core.business.reference.country.model.Country, com.salesmanager.core.business.reference.country.model.QCountry>createList("countries", com.salesmanager.core.business.reference.country.model.Country.class, com.salesmanager.core.business.reference.country.model.QCountry.class,INITS);

    public final ListPath<GeoZoneDescription, QGeoZoneDescription> descriptions = this.<GeoZoneDescription, QGeoZoneDescription>createList("descriptions", GeoZoneDescription.class, QGeoZoneDescription.class,INITS);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    //inherited
    public final BooleanPath new$ = _super.new$;

    public QGeoZone(String variable) {
        super(GeoZone.class, forVariable(variable));
    }

    public QGeoZone(Path<? extends GeoZone> entity) {
        super(entity.getType(), entity.getMetadata());
    }

    public QGeoZone(PathMetadata<?> metadata) {
        super(GeoZone.class, metadata);
    }

}

