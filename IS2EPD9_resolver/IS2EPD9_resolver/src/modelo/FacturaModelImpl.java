/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import controlador.FacturaController;
import java.util.List;
import modelo.entidades.Factura;
import modelo.persistencia.FacturaDAO;
import modelo.persistencia.GenericDAO;
import modelo.persistencia.JDBC.FacturaDAOJDBC;

/**
 *
 * @author Norberto Díaz-Díaz
 */
public class FacturaModelImpl extends AbstractModelImpl<FacturaController,Factura,String> implements FacturaModel{
    
    // private final GenericDAO clienteDao;
    private final FacturaDAO facturaDao;
    
    public FacturaModelImpl(
            FacturaDAO facturaDao
    ) {
        // this.clienteDao = clienteDao;
        this.facturaDao = facturaDao;
    }

    protected GenericDAO obtenerImplementacionDAO(){
        // return new FacturaDAOJDBC();
        //return new FacturaDAOJPA();
        return facturaDao;
    }

    public List<Factura> listarPorCliente(String nombre) {
        FacturaDAO dao=(FacturaDAO)obtenerImplementacionDAO();
        return dao.listByCliente(nombre);
    }

}
