package ua.com.kisit.unit11.dao;

import java.util.List;

public interface GeneralDao<T> {

    List<T> getAll();
    T getById(Long id);
    void save(T t);
    void update(T t);
    void delete(T t);
    void delete(Long id);
    void deleteAll();


}
