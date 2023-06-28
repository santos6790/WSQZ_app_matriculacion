package com.emergentes.dao;

import com.emergentes.modelo.Sede;
import java.util.List;

/**
 * @author JOSBER
 */
public interface SedeDAO {
    public void insert(Sede sede) throws Exception;
    public void update(Sede sede) throws Exception;
    public void delete(int id) throws Exception;
    public Sede getById(int id) throws Exception;
    public List<Sede> getAll() throws Exception; 
}
