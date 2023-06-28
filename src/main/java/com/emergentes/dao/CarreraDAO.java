package com.emergentes.dao;

import com.emergentes.modelo.Carrera;
import com.emergentes.modelo.Gestion;
import java.util.List;
/**
 * @author Santos
 */
public interface CarreraDAO {
    public void insert(Carrera carrera) throws Exception;
    public void update(Carrera carrera) throws Exception;
    public void delete(int id) throws Exception;
    public Carrera getById(int id) throws Exception;
    public List<Carrera> getAll() throws Exception;
}
