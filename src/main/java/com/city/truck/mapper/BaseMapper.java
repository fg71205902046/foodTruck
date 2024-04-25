package com.city.truck.mapper;

import java.util.List;

public interface BaseMapper <E,P>{
    /**
     * convert one POJO to Entity
     * @param pojo
     * @return
     */
    public E toEntity(P pojo);

    /**
     * convert POJOs to Entities
     * @param pojoList
     * @return
     */
    public List<E> toEntities(List<P> pojoList);

    /**
     * convert one Entity to a POJO
     * @param entity
     * @return
     */
    public P toPoJo(E entity);

    /**
     * convert entities to POJO list
     * @param entityList
     * @return
     */
    public List<P> toPojos(List<E> entityList);
}
