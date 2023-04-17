package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Roulette implements Sleeper {

    private ArrayList<Case> cases;
    private final int nbCases = 36;
    private final Random random = new Random();

    public Roulette() throws InterruptedException {
        this.cases = new ArrayList<Case>();
        for (int i = 0; i < this.nbCases; i++) {
            if (i == 0 || i == 14) {
                this.cases.add(i, new Case(CaseCouleurs.VERT, i));
            } else if (i % 2 == 0) {
                this.cases.add(i, new Case(CaseCouleurs.NOIR, i));
            } else {
                this.cases.add(i, new Case(CaseCouleurs.ROUGE, i));
            }
        }
    }

    public int lancer() throws InterruptedException {
        int randomCase = this.random.nextInt(nbCases);
        sleep(20000);
        return this.cases.get(randomCase).getNumero();
    }

    @Override
    public void sleep(long millis) throws InterruptedException {
        Thread.sleep(millis);
    }
}
