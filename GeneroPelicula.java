package VideoClud;

public class GeneroPelicula extends  Producto {
    private String genero;



    public  GeneroPelicula(Integer codigo, String titulo, double precio, String genero){
    super(codigo,titulo,precio);
        this.genero= genero;
}

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

}
