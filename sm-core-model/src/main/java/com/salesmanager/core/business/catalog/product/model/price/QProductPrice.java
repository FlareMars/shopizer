package com.salesmanager.core.business.catalog.product.model.price;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QProductPrice is a Querydsl query type for ProductPrice
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QProductPrice extends EntityPathBase<ProductPrice> {

    private static final long serialVersionUID = -581362729;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QProductPrice productPrice = new QProductPrice("productPrice");

    public final com.salesmanager.core.business.generic.model.QSalesManagerEntity _super = new com.salesmanager.core.business.generic.model.QSalesManagerEntity(this);

    public final StringPath code = createString("code");

    public final BooleanPath defaultPrice = createBoolean("defaultPrice");

    public final SetPath<ProductPriceDescription, QProductPriceDescription> descriptions = this.<ProductPriceDescription, QProductPriceDescription>createSet("descriptions", ProductPriceDescription.class, QProductPriceDescription.class,INITS);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final com.salesmanager.core.business.catalog.product.model.availability.QProductAvailability productAvailability;

    public final NumberPath<java.math.BigDecimal> productPriceAmount = createNumber("productPriceAmount", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> productPriceSpecialAmount = createNumber("productPriceSpecialAmount", java.math.BigDecimal.class);

    public final DateTimePath<java.util.Date> productPriceSpecialEndDate = createDateTime("productPriceSpecialEndDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> productPriceSpecialStartDate = createDateTime("productPriceSpecialStartDate", java.util.Date.class);

    public final EnumPath<ProductPriceType> productPriceType = createEnum("productPriceType", ProductPriceType.class);

    public QProductPrice(String variable) {
        this(ProductPrice.class, forVariable(variable), INITS);
    }

    public QProductPrice(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProductPrice(PathMetadata<?> metadata, PathInits inits) {
        this(ProductPrice.class, metadata, inits);
    }

    public QProductPrice(Class<? extends ProductPrice> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.productAvailability = inits.isInitialized("productAvailability") ? new com.salesmanager.core.business.catalog.product.model.availability.QProductAvailability(forProperty("productAvailability"), inits.get("productAvailability")) : null;
    }

}

