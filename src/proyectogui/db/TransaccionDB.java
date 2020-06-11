/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogui.db;

import java.sql.Connection;

/**
 *
 * @author gabrielhs
 */
public abstract class TransaccionDB {
    public abstract void execute(Connection conn);
}
