
package parqueo1.pkg0;


public class Reservaciones {
    int ID, telefono, placa, costo;
    String nombre, correo;

    public Reservaciones(int ID, int telefono, int placa, int costo, String nombre, String correo) {
        this.ID = ID;
        this.telefono = telefono;
        this.placa = placa;
        this.costo = costo;
        this.nombre = nombre;
        this.correo = correo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
    
    
    
    
}
