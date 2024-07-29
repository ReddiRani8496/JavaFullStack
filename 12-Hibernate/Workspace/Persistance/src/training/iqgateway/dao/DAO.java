package training.iqgateway.dao;

import java.util.List;

public interface DAO<E, U> {

    /**
     * @param entity
     * @return U
     * inserts record into table
     */
    public U add(E entity);

    /**
     * @param entity
     * updates the existing table
     */
    public void update(E entity);

    /**
     * @param ID
     * Deletes the existing table
     */
    public void delete(U ID);

    /**
     * @param ID
     * @return E matches with given ID
     */
    public E findByID(U ID);

    /**
     * @return List<E> 
     * All the records from particular table
     */
    public List<E> findAll();

}

