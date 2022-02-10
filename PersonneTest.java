import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonneTest {

    Montre montre = new Montre(10,25);
    Montre montre2 = new Montre(montre);

    Personne personne = new Personne("tagakou" ,montre);
    Personne personne2 = new Personne();

    // Test de la methode faire porter montre
    @Test
    void fairePorterMontre() {
        personne2.fairePorterMontre(montre2);
        Assertions.assertEquals("10 h 25 m" , personne2.donnerHeure());
    }

    // test de la methode enlever montre
    @Test
    void enleverMontre() {
        personne.enleverMontre();
        Assertions.assertEquals(null , personne.donnerHeure());
    }

    @Test
    void donnerHeure() {
    }
}