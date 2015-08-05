package com.salesmanager.core.business.order.model.orderproduct;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QOrderProductPrice is a Querydsl query type for OrderProductPrice
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QOrderProductPrice extends EntityPathBase<OrderProductPrice> {

    private static final long serialVersionUID = -266438977;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QOrderProductPrice orderProductPrice = new QOrderProductPrice("orderProductPrice");

    public final BooleanPath defaultPrice = createBoolean("defaultPrice");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QOrderProduct orderProduct;

    public final NumberPath<java.math.BigDecimal> productPrice = createNumber("productPrice", java.math.BigDecimal.class);

    public final StringPath productPriceCode = createString("productPriceCode");

    public final StringPath productPriceName = createString("productPriceName");

    public final NumberPath<java.math.BigDecimal> productPriceSpecial = createNumber("productPriceSpecial", java.math.BigDecimal.class);

    public final DateTimePath<java.util.Date> productPriceSpecialEndDate = createDateTime("productPriceSpecialEndDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> productPriceSpecialStartDate = createDateTime("productPriceSpecialStartDate", java.util.Date.class);

    public QOrderProductPrice(String variable) {
        this(OrderProductPrice.class, forVariable(variable), INITS);
    }

    public QOrderProductPrice(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOrderProductPrice(PathMetadata<?> metadata, PathInits inits) {
        this(OrderProductPrice.class, metadata, inits);
    }

    public QOrderProductPrice(Class<? extends OrderProductPrice> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.orderProduct = inits.isInitialized("orderProduct") ? new QOrderProduct(forProperty("orderProduct"), inits.get("orderProduct")) : null;
    }

}

