/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5AINFO
 */


public class Test {
  
    public void testSomma() {
        Somma somma = new Somma();
        int risultato = somma.somma(2, 3);
        assertEquals(5, risultato, "");
    }

    private void assertEquals(int i, int risultato, String test) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}