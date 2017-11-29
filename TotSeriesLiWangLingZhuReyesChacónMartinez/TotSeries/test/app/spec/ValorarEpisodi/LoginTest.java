/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.spec.ValorarEpisodi;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
import app.ValorarEpisodi;

@RunWith(ConcordionRunner.class)


public class LoginTest {
    
    public boolean getEstadoLogIn(String usuari) { 
        ValorarEpisodi val = new ValorarEpisodi();
        return val.ValidarUsuari(usuari);
    }
    
}




