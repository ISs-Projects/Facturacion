package modelo;

import controlador.FacturaController;
import java.util.List;
import modelo.entidades.Cliente;
import modelo.entidades.Factura;
import modelo.persistencia.FacturaDAO;
import modelo.persistencia.JDBC.FacturaDAOJDBC;
import modelo.persistencia.GenericDAO;

/**
 *
 * @author IS2: Norberto Díaz-Díaz, Roberto Ruiz
 */
public class FacturaModelImpl implements FacturaModel {
    
    private FacturaController facturaController;

    @Override
    public FacturaController getController() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setController(FacturaController controller) {
        this.facturaController = controller;
    }

    @Override
    public void nuevaFactura(Factura factura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Factura obtenerFactura(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarFactura(Factura factura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actualizarFactura(Factura factura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Factura> obtenerFacturas() {
        GenericDAO<Factura> dao = obtenerImplementacionFacturaDAO();
        return dao.list();
    }

    @Override
    public List<Factura> listarPorCliente(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private FacturaDAO obtenerImplementacionFacturaDAO() {
        return new FacturaDAOJDBC();
    }
    
}
