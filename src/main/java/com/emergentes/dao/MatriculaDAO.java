package com.emergentes.dao;

import com.emergentes.modelo.Matricula;
import java.util.List;

/**
 * @author JOSBER
 */
public interface MatriculaDAO {
    public void insert(Matricula matricula) throws Exception;
    public void update(Matricula matricula) throws Exception;
    public void delete(int id) throws Exception;
    public Matricula getById(int id) throws Exception;
    public List<Matricula> getAll() throws Exception; 
}
