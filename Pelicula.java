package VideoClud;

public class Pelicula extends Producto{
    private Integer duracion;
    private String idioma;
    private GeneroPelicula genero;

    public Pelicula(Integer codigo, String titulo, Double precio, Integer duracion, String idioma, GeneroPelicula genero) {
        super(codigo, titulo, precio);
        this.duracion = duracion;
        this.idioma = idioma;
        this.genero = genero;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public GeneroPelicula getGenero() {
        return genero;
    }

    public void setGenero(GeneroPelicula genero) {
        this.genero = genero;
    }
}
