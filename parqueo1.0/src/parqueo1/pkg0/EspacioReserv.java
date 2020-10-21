/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueo1.pkg0;

import java.util.ArrayList;
import java.util.Date;
import parqueo1.pkg0.Reservaciones;
/**
 *
 * @author Erick
 */
public class EspacioReserv {
    
    boolean reservado = false;
    Date fechaRes, fechaVenc;
    Cliente cliente;
    
    public EspacioReserv() {
        
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Date getFechaRes() {
        return fechaRes;
    }

    public void setFechaRes(Date fechaRes) {
        this.fechaRes = fechaRes;
    }

    public Date getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(Date fechaVenc) {
        this.fechaVenc = fechaVenc;
    }
   
}
