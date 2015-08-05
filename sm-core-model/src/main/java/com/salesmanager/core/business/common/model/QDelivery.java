package com.salesmanager.core.business.common.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QDelivery is a Querydsl query type for Delivery
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QDelivery extends BeanPath<Delivery> {

    private static final long serialVersionUID = 74262173;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QDelivery delivery = new QDelivery("delivery");

    public final StringPath address = createString("address");

    public final StringPath city = createString("city");

    public final StringPath company = createString("company");

    public final com.salesmanager.core.business.reference.country.model.QCountry country;

    public final StringPath name = createString("name");

    public final StringPath postalCode = createString("postalCode");

    public final StringPath state = createString("state");

    public final StringPath telephone = createString("telephone");

    public final com.salesmanager.core.business.reference.zone.model.QZone zone;

    public QDelivery(String variable) {
        this(Delivery.class, forVariable(variable), INITS);
    }

    public QDelivery(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDelivery(PathMetadata<?> metadata, PathInits inits) {
        this(Delivery.class, metadata, inits);
    }

    public QDelivery(Class<? extends Delivery> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.country = inits.isInitialized("country") ? new com.salesmanager.core.business.reference.country.model.QCountry(forProperty("country"), inits.get("country")) : null;
        this.zone = inits.isInitialized("zone") ? new com.salesmanager.core.business.reference.zone.model.QZone(forProperty("zone"), inits.get("zone")) : null;
    }

}

