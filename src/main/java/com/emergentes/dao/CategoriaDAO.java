/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.dao;

import com.emergentes.modelo.Categoria;
import java.util.List;

/**
 *
 * @author JOSBER
 */
public interface CategoriaDAO {
    public void insert(Categoria categoria) throws Exception;
    public void update(Categoria categoria) throws Exception;
    public void delete(int id) throws Exception;
    public Categoria getById(int id) throws Exception;
    public List<Categoria> getAll() throws Exception;
}
