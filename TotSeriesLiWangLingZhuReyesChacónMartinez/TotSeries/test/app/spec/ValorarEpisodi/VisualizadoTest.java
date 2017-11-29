/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.spec.ValorarEpisodi;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
//import app.UsuariRegistrat;
import app.ValorarEpisodi;
@RunWith(ConcordionRunner.class)


public class VisualizadoTest {
    /*queriamos poner 
    public boolean getEstadoVisualizacion(UsuariRegistrat usuari) { 
        return usuari.ComprovarVisualitzacions();
    }
    pero nos sale error de Unable to convert type java.lang.String of to type of app.UsuariRegistrat*/
    public boolean getEstadoVisualizacion(String usuari) { 
        ValorarEpisodi val = new ValorarEpisodi();
        return val.ComprovarVisualitzacions(usuari);
    }
    
}
