package com.example.student_db_rest_api.domain.entity;

import org.springframework.lang.Nullable;

import java.util.UUID;

public interface Persistable<ID extends UUID> {

    /**
     * Возвращает идентификатор объекта.
     *
     * @return идентификатор. Может быть {@literal null}.
     */
    @Nullable
    ID getPrimaryKey();

    /**
     * Возвращает если {@code Persistable} является новым или уже сохранялся.
     *
     * @return если {@literal true} объект является новым.
     */
    Boolean isNew();
}
