/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author li
 */
public class VeureEpisodi {
    public boolean ValidarUsuari(String usuari) {
        return usuari.equals("nuevo");
        /*En versiones posteriores se debe comprobar si el usuario está en la lista de usuarios registrados
        */
    }
    
    
    public boolean ValidarIP(String ip) {
        return ip.equals("10.133.32.49");

    }
    
       
    
    
}
