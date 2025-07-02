package VideoClud;

import java.util.ArrayList;
import java.util.List;

public class VideoClud {
    private static VideoClud instancia;
    private List<Cliente> clientes;
    private List<Producto> productos;
    private List<Alquiler> alquileres ;

    public List<Cliente> getClientes() {
        return new ArrayList<>(clientes); // Devuelve una copia
    }
    private  VideoClud(){
        clientes=new ArrayList<>();
        productos=new ArrayList<>();
        alquileres=new ArrayList<>();
    }

    public static  synchronized VideoClud getInstancia(){
        if(instancia == null){
            instancia = new VideoClud();
        }
        return  instancia;
    }


    public boolean agregarClientes(Cliente cliente){
        if (buscarCliente(cliente.getCodigo())== null){
            clientes.add(cliente);
            return true;
        }
        return false;
    }

   public  boolean modificacionCliente(Cliente clienteActualizado){
        Cliente clienteExistente = buscarCliente(clienteActualizado.getCodigo());
        if (clienteExistente != null){
            clienteExistente.setNombre(clienteActualizado.getNombre());
            clienteExistente.setDocumento(clienteActualizado.getDocumento());
            clienteExistente.setEmail(clienteActualizado.getEmail());
            clienteExistente.setTelefono(clienteExistente.getTelefono());
            return true;
        }
        return false;
   }
   public  boolean eliminarCliente(Integer codigo){
        return  clientes.removeIf(cliente -> cliente.getCodigo().equals(codigo));

   }
   public Cliente buscarCliente(Integer codigo){
        for (Cliente cliente: clientes){
            if (cliente.getCodigo().equals(codigo)){
                return  cliente;
            }
        }
        return null;
   }

   public  List<Cliente> mostarClientes(String documento,String nombre){
        List<Cliente> resultados = new ArrayList<>();
        for (Cliente cliente:clientes){
            boolean matchDoc = (documento==null||documento.isEmpty()||cliente.getDocumento().contains(documento));
            boolean matchNombre = (nombre == null ||cliente.getNombre().toLowerCase().contains(nombre.toLowerCase()));
            if(matchDoc && matchNombre){
                resultados.add(cliente);
            }

        }
       return  resultados;
    }
}

