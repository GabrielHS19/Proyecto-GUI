
package uv.principios.dao;

import uv.principios.utils.conexionDB;


/**
 *
 * @author gabrielhs, david y jahaziel
 */
public class PersonaDAO implements IDAOGeneral<Persona>{

    @Override
    public boolean guardar(Persona pojo) {
         boolean res=false;
        conexionDB con=conexionDB.getInstance();
        String sql="insert into persona (clave,nombre,direccion,telefono,departamento) values "
                + "('" + pojo.getClave() + "','" + pojo.getNombre() + "','" + pojo.getDireccion() + "','" +
                pojo.getTelefono() +  "','" + pojo.getDepartamento().getClave()  + "')";
        res=con.execute(sql);
        return res; 
    }
    
    
    
}

