package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class RouletteTest {

    @Test
    public void testLancerReturnsRandomNumber() throws InterruptedException {
        Roulette roulette = Mockito.spy(new Roulette());
        Mockito.doNothing().when(roulette).sleep(Mockito.anyLong());

        int nombreLancer = 1000;
        int resultat;

        for (int i = 0; i < nombreLancer; i++) {
            resultat = roulette.lancer();
            assertTrue(resultat >= 0 && resultat <= 36, "Le resultat doit etre compris entre 0 et 36");
        }
    }
}
