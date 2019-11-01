package FieldGame;

import org.junit.Test;

import static org.junit.Assert.*;

public class KontoTest {

    @Test
    public void træk() {
        Konto konto = new Konto();
        konto.træk(500);
        assertEquals(500, 500);
    }
}