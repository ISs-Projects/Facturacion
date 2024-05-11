package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.entidades.Cliente;
import modelo.entidades.ClienteImpl;
import modelo.ClienteModel;
import vista.cliente.ClienteView;

/**
 *
 * @author IS2: Norberto Díaz-Díaz, Roberto Ruiz
 */
public class ClienteControllerImpl implements ClienteController {
    
    ClienteModel model;
    List<ClienteView> view;

    @Override
    public void setup(ClienteModel model, List<ClienteView> view) {
        this.model = model;
        this.view = view;
        this.model.setController(this);
    }

    @Override
    public void start() {
    }

    @Override
    public void addView(ClienteView view) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removeView(ClienteView view) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ClienteModel getModel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setModel(ClienteModel model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void nuevoClienteGesture(String dni, String nombre, String direccion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void borraClienteGesture(String dni) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actualizaClienteGesture(String dni, String nombre, String direccion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Cliente> listaClientesGesture() {
        return this.model.obtenerClientes();
    }

    @Override
    public void fireDataModelChanged() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


   
}
