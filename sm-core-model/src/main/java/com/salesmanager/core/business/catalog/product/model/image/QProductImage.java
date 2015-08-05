package com.salesmanager.core.business.catalog.product.model.image;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QProductImage is a Querydsl query type for ProductImage
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QProductImage extends EntityPathBase<ProductImage> {

    private static final long serialVersionUID = 1149520151;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QProductImage productImage1 = new QProductImage("productImage1");

    public final com.salesmanager.core.business.generic.model.QSalesManagerEntity _super = new com.salesmanager.core.business.generic.model.QSalesManagerEntity(this);

    public final BooleanPath defaultImage = createBoolean("defaultImage");

    public final ListPath<ProductImageDescription, QProductImageDescription> descriptions = this.<ProductImageDescription, QProductImageDescription>createList("descriptions", ProductImageDescription.class, QProductImageDescription.class,INITS);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath imageCrop = createBoolean("imageCrop");

    public final NumberPath<Integer> imageType = createNumber("imageType", Integer.class);

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final com.salesmanager.core.business.catalog.product.model.QProduct product;

    public final StringPath productImage = createString("productImage");

    public QProductImage(String variable) {
        this(ProductImage.class, forVariable(variable), INITS);
    }

    public QProductImage(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProductImage(PathMetadata<?> metadata, PathInits inits) {
        this(ProductImage.class, metadata, inits);
    }

    public QProductImage(Class<? extends ProductImage> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.product = inits.isInitialized("product") ? new com.salesmanager.core.business.catalog.product.model.QProduct(forProperty("product"), inits.get("product")) : null;
    }

}

