
package uv.principios.dao;

import proyectogui.db.conexionDB;

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

   

    @Override
    public boolean eliminar(String t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

