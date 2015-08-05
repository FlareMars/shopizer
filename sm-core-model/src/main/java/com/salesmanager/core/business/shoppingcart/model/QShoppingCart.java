package com.salesmanager.core.business.shoppingcart.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QShoppingCart is a Querydsl query type for ShoppingCart
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QShoppingCart extends EntityPathBase<ShoppingCart> {

    private static final long serialVersionUID = -190562220;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QShoppingCart shoppingCart = new QShoppingCart("shoppingCart");

    public final com.salesmanager.core.business.generic.model.QSalesManagerEntity _super = new com.salesmanager.core.business.generic.model.QSalesManagerEntity(this);

    public final com.salesmanager.core.business.common.model.audit.QAuditSection auditSection;

    public final NumberPath<Long> customerId = createNumber("customerId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final SetPath<ShoppingCartItem, QShoppingCartItem> lineItems = this.<ShoppingCartItem, QShoppingCartItem>createSet("lineItems", ShoppingCartItem.class, QShoppingCartItem.class,INITS);

    public final com.salesmanager.core.business.merchant.model.QMerchantStore merchantStore;

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final StringPath shoppingCartCode = createString("shoppingCartCode");

    public QShoppingCart(String variable) {
        this(ShoppingCart.class, forVariable(variable), INITS);
    }

    public QShoppingCart(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QShoppingCart(PathMetadata<?> metadata, PathInits inits) {
        this(ShoppingCart.class, metadata, inits);
    }

    public QShoppingCart(Class<? extends ShoppingCart> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.auditSection = inits.isInitialized("auditSection") ? new com.salesmanager.core.business.common.model.audit.QAuditSection(forProperty("auditSection")) : null;
        this.merchantStore = inits.isInitialized("merchantStore") ? new com.salesmanager.core.business.merchant.model.QMerchantStore(forProperty("merchantStore"), inits.get("merchantStore")) : null;
    }

}

