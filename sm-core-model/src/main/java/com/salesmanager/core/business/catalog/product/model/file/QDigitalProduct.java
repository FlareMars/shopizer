package com.salesmanager.core.business.catalog.product.model.file;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QDigitalProduct is a Querydsl query type for DigitalProduct
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QDigitalProduct extends EntityPathBase<DigitalProduct> {

    private static final long serialVersionUID = 1149036529;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QDigitalProduct digitalProduct = new QDigitalProduct("digitalProduct");

    public final com.salesmanager.core.business.generic.model.QSalesManagerEntity _super = new com.salesmanager.core.business.generic.model.QSalesManagerEntity(this);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final com.salesmanager.core.business.catalog.product.model.QProduct product;

    public final StringPath productFileName = createString("productFileName");

    public QDigitalProduct(String variable) {
        this(DigitalProduct.class, forVariable(variable), INITS);
    }

    public QDigitalProduct(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDigitalProduct(PathMetadata<?> metadata, PathInits inits) {
        this(DigitalProduct.class, metadata, inits);
    }

    public QDigitalProduct(Class<? extends DigitalProduct> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.product = inits.isInitialized("product") ? new com.salesmanager.core.business.catalog.product.model.QProduct(forProperty("product"), inits.get("product")) : null;
    }

}

