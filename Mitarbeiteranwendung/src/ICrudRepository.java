public interface ICrudRepository<E>  {
    /**
     * @param name
     */

    E findOne(String name);

    /**
     * @return
     */

    Iterable<E> findAll();

    /**
     * @param entity
     * @return null
     */
    E save (E entity);

    /**
     * @param id
     * @return removed enity
     */
    E delete(Long id);

    /**
     * @param entity
     * @return null
     */
    E update(E entity);
}
