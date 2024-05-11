package modelo;

import modelo.entidades.Cliente;
import controlador.ClienteController;
import java.util.List;
import modelo.persistencia.JDBC.ClienteDAOJDBC;
import modelo.persistencia.GenericDAO;

/**
 *
 * @author IS2: Norberto Díaz-Díaz, Roberto Ruiz
 */
public class ClienteModelImpl implements ClienteModel {
    

    private ClienteController controller;
            
    @Override
    public ClienteController getController() {
        return this.getController();
    }

    @Override
    public void setController(ClienteController controller) {
        this.controller = controller;
    }

    @Override
    public void nuevoCliente(Cliente cliente) {
        GenericDAO<Cliente> dao = obtenerImplementacionClienteDAO();
        dao.create(cliente);
        this.controller.fireDataModelChanged();
    }

    @Override
    public Cliente obtenerCliente(String nombre) {
        GenericDAO<Cliente> dao = obtenerImplementacionClienteDAO();
        return dao.read(nombre);
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        GenericDAO<Cliente> dao = obtenerImplementacionClienteDAO();
        dao.delete(cliente);
        this.controller.fireDataModelChanged();
    }

    @Override
    public void actualizarCliente(Cliente cliente) {
        GenericDAO<Cliente> dao = obtenerImplementacionClienteDAO();
        dao.update(cliente);
        this.controller.fireDataModelChanged();
    }

    @Override
    public List<Cliente> obtenerClientes() {
        GenericDAO<Cliente> dao = obtenerImplementacionClienteDAO();
        return dao.list();
    }

    private GenericDAO<Cliente> obtenerImplementacionClienteDAO() {
        return new ClienteDAOJDBC();
    }
}
