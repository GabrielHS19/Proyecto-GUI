/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Principal {
    public static void main(String[] args) {
        conexionDB con = conexionDB.getInstance();
        Persona persona=new Persona();
        persona.setClave("01");
        persona.setNombre("juan");
        persona.setDireccion("av1");
        persona.setTelefono("545");
        
        
        TransaccionDB<Persona> t1=new TransaccionDB<Persona>(persona) {
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
        };
        boolean r=con.execute(t1);
        
        
        
        
       
        //TransaccionDBPersona t=new TransaccionDBPersona(persona);
        //boolean r=con.execute(t);
        if (r) {
            System.out.println("ok");
        }else{
            System.out.println("error");
        }
    }
}
