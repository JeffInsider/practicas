package modelos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Nico
 */
public class Prestamos {
    private int nPrestamos;
    private String codigoLibro;
    private String numeroSocio;
    private LocalDateTime fecha;

    public Prestamos(
            int nPrestamos, 
            String codigoLibro, 
            String numeroSocio, 
            LocalDateTime fecha) {
        this.nPrestamos = nPrestamos;
        this.codigoLibro = codigoLibro;
        this.numeroSocio = numeroSocio;
        this.fecha = fecha;
    }

    public int getnPrestamos() {
        return nPrestamos;
    }

    public void setnPrestamos(int nPrestamos) {
        this.nPrestamos = nPrestamos;
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(String numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    
    public String getFechaFormateada() {
        String formato = "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern(formato);
        return formateador.format(this.fecha);
    }
    
}
