/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities_DAO;

import java.util.List;

/**
 *
 * @author t00178747
 * @param <T>
 */
public interface DAO<T> {

    /**
     * Get the object thanks to the ID
     *
     * @param id
     * @return
     */
    public T find(long id);

    /**
     * Create an object in database
     *
     * @param obj
     * @return
     */
    public  T create(T obj);

    /**
     * Update an object in database
     *
     * @param obj
     * @return
     */
    public  T update(T obj);

    /**
     * Delete an object from database
     *
     * @param obj
     */
    public  void delete(T obj);

    /**
     * Find all the objects for an entity
     * @return List<T>
     */
    public  List<T> findAll();
    
    /**
     * Find all the objects for an ID
     * @return List<T>
     */
    public  List<T> findById();
    
    
}
