/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo.persistencia;

import java.util.List;

/**
 *
 * @author mamisho
 * @param <T>
 */
public interface GenericDAO<T> {
    public T read(String pk);
    public void create(T cliente);
    public void update(T cliente);
    public void delete(T cliente);
    public List<T> list();
}
