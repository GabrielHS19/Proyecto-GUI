package proyectogui.db;

//import proyecto1.*;

import uv.principios.dao.*;
//import proyecto1.*;


/**
 *
 * @author gabrielhs, jahaziel y david
 */
public class Persona {
private String clave;
private String nombre;
private String direccion;
private String telefono;


    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


}
