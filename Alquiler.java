package VideoClud;

import java.time.LocalDate;
public class Alquiler {
    private Cliente clienteAlquiler;
    private Producto productoAlquiler;
    private LocalDate fechaAlquiler;
    private LocalDate fechaEntraga;
    private boolean alquilado;

    public  Alquiler(Cliente clienteAlquiler,Producto productoAlquiler,LocalDate fechaAlquiler,LocalDate fechaEntraga)
    {
        this.clienteAlquiler=clienteAlquiler;
        this.productoAlquiler = productoAlquiler;
        this.fechaAlquiler=fechaAlquiler;
        this.alquilado = true;
        this.fechaEntraga=null;
    }

    public Cliente getClienteAlquiler()
    {
        return clienteAlquiler;
    }
    public void setClienteAlquiler(Cliente clienteAlquiler)
    {
        this.clienteAlquiler = clienteAlquiler;
    }

    public Producto getProductoAlquiler(){
        return productoAlquiler;
    }
    public void setProductoAlquiler(Producto productoAlquiler)
    {
        this.productoAlquiler = productoAlquiler;
    }

    public LocalDate getFechaAlquiler()
    {
        return fechaAlquiler;
    }
    public void setFechaAlquiler(LocalDate fechaAlquiler)
    {
        this.fechaAlquiler=fechaAlquiler;
    }

    public LocalDate getFechaEntraga()
    {
        return fechaEntraga;
    }
    public void setFechaEntraga(LocalDate fechaEntraga)
    {
        this.fechaEntraga=fechaEntraga;
    }

    public boolean getAlquilado()
    {
        return alquilado;
    }
    public void  setAlquilado(boolean alquilado)
    {
        this.alquilado = alquilado;
    }

}
