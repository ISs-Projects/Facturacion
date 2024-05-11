/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.persistencia.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.entidades.Cliente;
import modelo.entidades.ClienteImpl;
import modelo.entidades.Factura;
import modelo.entidades.FacturaImpl;
import modelo.persistencia.ClienteDAO;
import modelo.persistencia.GenericDAO;

/**
 *
 * @author mamisho
 */
public class ClienteDAOJDBC implements ClienteDAO {

    @Override
    public Cliente read(String pk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void create(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Cliente> list() {
        List<Cliente> clientes = new ArrayList<>();

        try {
            Statement stmt = Persistencia.createConnection().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM clientes");
            String DNI,nombre,direccion, id_factura;
            Double importe;
            while (res.next()) {
                DNI = res.getString("DNI");
                nombre=res.getString("nombre");
                direccion=res.getString("direccion");

                Cliente cliente = new ClienteImpl(DNI,nombre,direccion);
                clientes.add(cliente);
            }

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception ex) {
            Logger.getLogger(FacturaDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Persistencia.closeConnection();
        }
        return clientes;
    }

    
}
