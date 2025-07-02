package VideoClud;

public class Juego extends Producto{
    private  String plataforma;
    private String genero;


    public Juego(Integer codigo, String titulo, Double precio, String genero, String plataforma) {
        super(codigo, titulo, precio);
        this.genero = genero;
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
