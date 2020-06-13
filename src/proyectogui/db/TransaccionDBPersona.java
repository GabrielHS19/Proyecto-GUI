
package proyectogui.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabrielhs
 */
public class TransaccionDBPersona extends TransaccionDB<Persona>{

    public TransaccionDBPersona(Persona pojo) {
        super(pojo);
    }

    @Override
    public boolean execute(Connection conn) {
        boolean res=false;
        try {
            String sql="insert into persona (clave,nombre,direccion,telefono)values(?,?,?,?)";
            PreparedStatement ps =conn.prepareStatement(sql);
            ps.setString(1, pojo.getClave());
            ps.setString(1, pojo.getNombre());
            ps.setString(1, pojo.getDireccion());
            ps.setString(1, pojo.getTelefono());
            ps.execute();
            System.out.println("se guardo");
            res=true;
        } catch (SQLException ex) {
            Logger.getLogger(TransaccionDBPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    
}
