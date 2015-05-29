/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.math.BigDecimal;

/**
 *
 * @author Krystel
 */
public class CuentaAhorro {
    
    private BigDecimal id_cuenta;
    
    private BigDecimal saldo;

    public CuentaAhorro() {
    }

    public CuentaAhorro(BigDecimal id_cuenta, BigDecimal saldo) {
        this.id_cuenta = id_cuenta;
        this.saldo = saldo;
    }

    /**
     * @return the id_cuenta
     */
    public BigDecimal getId_cuenta() {
        return id_cuenta;
    }

    /**
     * @param id_cuenta the id_cuenta to set
     */
    public void setId_cuenta(BigDecimal id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    /**
     * @return the saldo
     */
    public BigDecimal getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
    
    
    
}
