package com.example.backend.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDeepCategory is a Querydsl query type for DeepCategory
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDeepCategory extends EntityPathBase<DeepCategory> {

    private static final long serialVersionUID = 661598058L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDeepCategory deepCategory = new QDeepCategory("deepCategory");

    public final QCategory category;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<Item, QItem> itemList = this.<Item, QItem>createList("itemList", Item.class, QItem.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public QDeepCategory(String variable) {
        this(DeepCategory.class, forVariable(variable), INITS);
    }

    public QDeepCategory(Path<? extends DeepCategory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDeepCategory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDeepCategory(PathMetadata metadata, PathInits inits) {
        this(DeepCategory.class, metadata, inits);
    }

    public QDeepCategory(Class<? extends DeepCategory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.category = inits.isInitialized("category") ? new QCategory(forProperty("category")) : null;
    }

}

