/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.spec.VeureEpisodi;



import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
import app.VeureEpisodi; // system under design


@RunWith(ConcordionRunner.class)


public class RegistradoTest {
    public boolean getEstadoLogIn(String usuari) { 

        VeureEpisodi veu = new VeureEpisodi();

        return veu.ValidarUsuari(usuari);

}

}
