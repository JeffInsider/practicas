package modelos;

/**
 *
 * @author Nico
 */
public class Libros {
    private int codigo;
    private String titulo;
    private String autor;
    private String genero;
    private String disponible;

    public Libros(
            int codigo, 
            String titulo, 
            String autor, 
            String genero, 
            String disponible) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponible = disponible;
    }

    public Libros() {
        
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String isDisponible() {
        return disponible;
    }

    public void setDisponible(String disponibilidad) {
        this.disponible = disponibilidad;
    }
    
}
