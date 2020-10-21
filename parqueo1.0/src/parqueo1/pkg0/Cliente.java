
package parqueo1.pkg0;


public class Cliente {
    int telefono, identificacion;
    String correo, nombre;
    Vehiculo vehiculo;

    public Cliente( int identificacion, String nombre, int telefono, String correo, Vehiculo vehiculo) {
        this.telefono = telefono;
        this.identificacion = identificacion;
        this.correo = correo;
        this.nombre = nombre;
        this.vehiculo = vehiculo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
}
