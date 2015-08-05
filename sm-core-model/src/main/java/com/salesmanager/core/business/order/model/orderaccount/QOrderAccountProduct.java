package com.salesmanager.core.business.order.model.orderaccount;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QOrderAccountProduct is a Querydsl query type for OrderAccountProduct
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QOrderAccountProduct extends EntityPathBase<OrderAccountProduct> {

    private static final long serialVersionUID = -2021244891;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QOrderAccountProduct orderAccountProduct = new QOrderAccountProduct("orderAccountProduct");

    public final QOrderAccount orderAccount;

    public final DateTimePath<java.util.Date> orderAccountProductAccountedDate = createDateTime("orderAccountProductAccountedDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> orderAccountProductEndDate = createDateTime("orderAccountProductEndDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> orderAccountProductEot = createDateTime("orderAccountProductEot", java.util.Date.class);

    public final NumberPath<Long> orderAccountProductId = createNumber("orderAccountProductId", Long.class);

    public final DateTimePath<java.util.Date> orderAccountProductLastStatusDate = createDateTime("orderAccountProductLastStatusDate", java.util.Date.class);

    public final NumberPath<Integer> orderAccountProductLastTransactionStatus = createNumber("orderAccountProductLastTransactionStatus", Integer.class);

    public final NumberPath<Integer> orderAccountProductPaymentFrequencyType = createNumber("orderAccountProductPaymentFrequencyType", Integer.class);

    public final DateTimePath<java.util.Date> orderAccountProductStartDate = createDateTime("orderAccountProductStartDate", java.util.Date.class);

    public final NumberPath<Integer> orderAccountProductStatus = createNumber("orderAccountProductStatus", Integer.class);

    public final com.salesmanager.core.business.order.model.orderproduct.QOrderProduct orderProduct;

    public QOrderAccountProduct(String variable) {
        this(OrderAccountProduct.class, forVariable(variable), INITS);
    }

    public QOrderAccountProduct(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOrderAccountProduct(PathMetadata<?> metadata, PathInits inits) {
        this(OrderAccountProduct.class, metadata, inits);
    }

    public QOrderAccountProduct(Class<? extends OrderAccountProduct> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.orderAccount = inits.isInitialized("orderAccount") ? new QOrderAccount(forProperty("orderAccount"), inits.get("orderAccount")) : null;
        this.orderProduct = inits.isInitialized("orderProduct") ? new com.salesmanager.core.business.order.model.orderproduct.QOrderProduct(forProperty("orderProduct"), inits.get("orderProduct")) : null;
    }

}

