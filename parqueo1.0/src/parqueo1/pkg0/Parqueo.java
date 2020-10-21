
package parqueo1.pkg0;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;


public class Parqueo {

    Espacio[] espaciosN = new Espacio[18];
    EspacioReserv[] espaciosR = new EspacioReserv[7];
    int tazaCobro = 1000, tazaMensMoto = 18000, tazaMensAuto = 40000;
    int espNorDisp, espResDisp;
    
    public Parqueo(){
        this.constructEspaciosArray();
    }

    public void constructEspaciosArray(){
        for (int i = 0; i < this.espaciosN.length; i++) {
            Espacio nEspacio = new Espacio();
            this.espaciosN[i] = nEspacio;           
        }
        for (int i = 0; i < this.espaciosR.length; i++) {
            EspacioReserv rEspacio = new EspacioReserv();
            this.espaciosR[i] = rEspacio;           
        }
        this.espNorDisp = this.espaciosN.length;
        this.espResDisp = this.espaciosR.length;
    }
    
    public String ingresoVehiculo(String placa, Date fechaIng){
        String isValid = "true";
        if(this.espNorDisp != 0){
            for (int i = 0; i < this.espaciosN.length; i++) {
                if (espaciosN[i].isOcupado() && espaciosN[i].getVehiculo().getPlaca().equals(placa)) {
                    isValid = "false";
                }
            }
            if (isValid.equals("true")) {
                for (int i = 0; i < this.espaciosN.length; i++) {
                    if (!espaciosN[i].isOcupado()) {
                        espaciosN[i].setFechaIng(fechaIng);
                        espaciosN[i].setVehiculo(new Vehiculo(placa));
                        espaciosN[i].setOcupado(true);
                        this.espNorDisp --;
                        i = this.espaciosN.length;
                    }
                }
            }           
        }else{
            isValid = "full";
        }
        return isValid;
    }
    
    public String salidaVehiculo(String placa, Date fechaSal){
        String resultado = "false";
        String infoPago = "";
        for (int i = 0; i < this.espaciosN.length; i++) {
            if (espaciosN[i].isOcupado() && espaciosN[i].vehiculo.placa.equals(placa)) {
                infoPago = this.calcularPago(espaciosN[i].fechaIng, fechaSal);
                espaciosN[i].setVehiculo(null);
                espaciosN[i].setOcupado(false);
                this.espNorDisp ++;
                i = this.espaciosN.length;
                resultado = " Placa                Horas                Total\n"
                        +" "+placa+"                "+infoPago;
            }
        }
        return resultado;
    }
    
    public String realizarReservacion(String tipoVehiculo, String placa, String nombre, int id, int telef, String email, Date fechaInicioReserva, Date fechaFinalReserva){        
        boolean isValid = true;
        String resultado = "";
        int infoPago;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
        
        if(this.espResDisp != 0){
            for (int i = 0; i < this.espaciosR.length; i++) {
                if (espaciosR[i].isReservado() && espaciosR[i].getCliente().getVehiculo().getPlaca().equals(placa)) {
                    isValid = false;
                    JOptionPane.showMessageDialog(null, "Vehiculo ya cuenta con una reservación","Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            if (isValid) {
                for (int i = 0; i < this.espaciosR.length; i++) {
                    if (!espaciosR[i].isReservado()) {
                        espaciosR[i].setReservado(true);
                        espaciosR[i].setFechaRes(fechaInicioReserva);
                        Date fechaVenc = fechaFinalReserva;
                        espaciosR[i].setFechaVenc(fechaVenc);
                        Vehiculo vehiculo = new Vehiculo(placa);
                        vehiculo.setTipo(tipoVehiculo);
                        espaciosR[i].setCliente(new Cliente(id, nombre, telef, email, new Vehiculo(placa)));
                        this.espResDisp --;
                        SimpleDateFormat format2 = new SimpleDateFormat("yyMMdd");
                        Integer fec_inicio = Integer.parseInt(format2.format(fechaInicioReserva));
                        Integer fec_final = Integer.parseInt(format2.format(fechaFinalReserva));
                        Integer cantDias = fec_final - fec_inicio;
                        if (tipoVehiculo.equals("Automovil")) {
                            infoPago = this.tazaCobro * cantDias;
                        }else{
                            infoPago = this.tazaCobro * cantDias;
                        }
                        resultado = "\n Datos de la reservación\n\n"
                                + " Propietario: " + nombre+"\n"
                                + " Placa del vehiculo: "+placa+"\n"
                                + " Fecha de reservación: "+format.format(fechaInicioReserva)+"\n"
                                + " Fecha de vencimiento: "+format.format(fechaVenc)+"\n"
                                + " ============================\n\n"
                                + "Información de pago:\n\n"
                                + " Cuota Diaria                          Total\n"
                        +" "+this.tazaCobro+"                                      "+infoPago;
                        i = this.espaciosR.length;
                    }
                }
            }           
        }else{
            resultado = "full";
        }
        return resultado;
    }
    
    public void eliminarReservacion(){
    
    }
    
    public String calcularPago(Date fechaIng, Date fechaSal){
        String infoPago;
        long duration  = fechaSal.getTime() - fechaIng.getTime();

        long diffInMinutes = TimeUnit.MILLISECONDS.toMinutes(duration);
        long diffInHours = TimeUnit.MILLISECONDS.toHours(duration);
        
        if (diffInHours != 0){
           long minDiff = diffInMinutes - (diffInHours * 60);
            if (minDiff > 1) {
                diffInHours +=1;
            }
        }else{
            diffInHours += 1;
        }
        
        float pago = diffInHours * this.tazaCobro;
        
        infoPago = diffInHours+"                    "+pago;
        
        return infoPago;
    }
    
    public void test(){
        
        System.out.println("//////////////////////////////////"+this.espNorDisp+" \n");
        
        for (int i = 0; i < this.espaciosR.length; i++) {
            if (espaciosN[i].vehiculo != null) {
                System.out.println(espaciosR[i].reservado + "|"+espaciosN[i].vehiculo.placa+"||");
            }else{
                System.out.println(espaciosR[i].reservado + "|");
            }
                    
        } 
    }
    
    
}
