package Logica;

import java.math.BigDecimal;

/**
 *
 * @author Krystel
 */
public class Seguro {
    
    private BigDecimal id_seguro;
    
    private String tipo_seguro;
    
    private BigDecimal importe;
    
    private String descripcion;

    public Seguro() {
    }

    public Seguro(BigDecimal id_seguro, String tipo_seguro, BigDecimal importe, String descripcion) {
        this.id_seguro = id_seguro;
        this.tipo_seguro = tipo_seguro;
        this.importe = importe;
        this.descripcion = descripcion;
    }

    
    
    /**
     * @return the id_seguro
     */
    public BigDecimal getId_seguro() {
        return id_seguro;
    }

    /**
     * @param id_seguro the id_seguro to set
     */
    public void setId_seguro(BigDecimal id_seguro) {
        this.id_seguro = id_seguro;
    }

    /**
     * @return the tipo_seguro
     */
    public String getTipo_seguro() {
        return tipo_seguro;
    }

    /**
     * @param tipo_seguro the tipo_seguro to set
     */
    public void setTipo_seguro(String tipo_seguro) {
        this.tipo_seguro = tipo_seguro;
    }

    /**
     * @return the importe
     */
    public BigDecimal getImporte() {
        return importe;
    }

    /**
     * @param importe the importe to set
     */
    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
