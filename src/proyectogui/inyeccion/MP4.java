/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogui.inyeccion;

/**
 *
 * @author gabrielhs
 */
public class MP4 implements IMedio{

    @Override
    public void beginplay() {
         System.out.println("Inicia tocar mp4");
    }

    @Override
    public void stoplay() {
        System.out.println("Detiene tocar MP4");
    }
    
}
