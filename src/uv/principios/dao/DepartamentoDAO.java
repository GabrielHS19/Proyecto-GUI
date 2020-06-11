
package uv.principios.dao;

import proyectogui.db.conexionDB;

/**
 *
 * @author gabrielhs, jahaziel y david
 */
public class DepartamentoDAO implements IDAOGeneral <Departamento>{

    @Override
    public boolean guardar(Departamento pojo) {
        boolean res=false;
        conexionDB con= conexionDB.getInstance();
        String sql = "insert into departamentos (clave,nombre) values ('" +
                pojo.getClave() + "','" + pojo.getNombre() + "')";
        res = con.execute(sql);
        return res;
    }
    
    @Override
    public boolean eliminar(String t) {
        boolean res=false;
        conexionDB con= conexionDB.getInstance();
        String sql = "DELETE FROM departamentos WHERE clave =" + t;
        res = con.execute(sql);
        return res;
    }

    
    
    




    
}
