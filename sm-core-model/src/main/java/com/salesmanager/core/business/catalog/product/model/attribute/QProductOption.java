package com.salesmanager.core.business.catalog.product.model.attribute;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QProductOption is a Querydsl query type for ProductOption
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QProductOption extends EntityPathBase<ProductOption> {

    private static final long serialVersionUID = 658057146;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QProductOption productOption = new QProductOption("productOption");

    public final com.salesmanager.core.business.generic.model.QSalesManagerEntity _super = new com.salesmanager.core.business.generic.model.QSalesManagerEntity(this);

    public final StringPath code = createString("code");

    public final SetPath<ProductOptionDescription, QProductOptionDescription> descriptions = this.<ProductOptionDescription, QProductOptionDescription>createSet("descriptions", ProductOptionDescription.class, QProductOptionDescription.class,INITS);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.salesmanager.core.business.merchant.model.QMerchantStore merchantStore;

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final NumberPath<Integer> productOptionSortOrder = createNumber("productOptionSortOrder", Integer.class);

    public final StringPath productOptionType = createString("productOptionType");

    public final BooleanPath readOnly = createBoolean("readOnly");

    public QProductOption(String variable) {
        this(ProductOption.class, forVariable(variable), INITS);
    }

    public QProductOption(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProductOption(PathMetadata<?> metadata, PathInits inits) {
        this(ProductOption.class, metadata, inits);
    }

    public QProductOption(Class<? extends ProductOption> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.merchantStore = inits.isInitialized("merchantStore") ? new com.salesmanager.core.business.merchant.model.QMerchantStore(forProperty("merchantStore"), inits.get("merchantStore")) : null;
    }

}

