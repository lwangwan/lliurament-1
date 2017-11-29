/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;


public class ValorarEpisodi {
    
    
    public boolean ValidarUsuari(String usuari) {
        return usuari.equals("nuevo");
        /*En versiones posteriores se debe comprobar si el usuario está en la lista de usuarios registrados
        */
    }
    
    public boolean ComprovarVisualitzacions(String usuari){
        return true; 
        /* La idea es tener un estructura de datos; como por ejemplo un ArrayList, en la que se 
        almacenen los episodios visualizados y/o valorados*/
    }
    
    public boolean ComprovarValoracions(String usuari){
        return false; 
        /* La idea es tener un estructura de datos; como por ejemplo un ArrayList, en la que se 
        almacenen las valoraciones hechas, si encuentra que ya había hecho una valoración del episodio, 
        retorna false, si no true.
        
        La idea es hacer esta función en la clase UsuariRegistrado, pero encontrabamos un problema que no 
        sabíamos solucionar, igual que en la función ComprovarVisualizacion
        */
    }
    
    
}
