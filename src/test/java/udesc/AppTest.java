package udesc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import javax.sound.sampled.Control;

import org.junit.Test;

import udesc.Controller.Controlador;

/**
 * Unit test for simple App.
 */
public class AppTest {
  

    @Test
    public void oTimeAdeveGanharOSet() {
        Controlador c = new Controlador();
        c.criarJogo("12:00", "Time A", "Time B");
        assertEquals(c.atualizarPontuacao(25, 0), "Time A");
    }

    @Test
    public void nenhumTimeDeveGanharOSet(){
        Controlador c = new Controlador();
        c.criarJogo("12:00", "Time A", "Time B");
        assertEquals(c.atualizarPontuacao(0, 0), null);
    } 

    @Test
    public void oTimeBDeveGanharOSet(){
        Controlador c = new Controlador();
        c.criarJogo("12:00", "Time A", "Time B");
        assertEquals(c.atualizarPontuacao(0, 25), "Time B");
    }

    @Test
    public void oJogoDeveContinuar(){
        Controlador c = new Controlador();
        c.criarJogo("12:00", "Time A", "Time B");
        assertEquals(c.atualizarPontuacao(25, 25), null);
    }

    @Test
    public void oJogoDeveTerminarEOTimeAVencer(){
        Controlador c = new Controlador();
        c.criarJogo("12:00", "Time A", "Time B");
        assertEquals(c.atualizarPontuacao(25, 0), "Time A");
        assertEquals(c.atualizarPontuacao(25, 0), "Time A");
        assertEquals(c.atualizarPontuacao(25, 0), "Time A");
        assertEquals(c.getVencedor(), "Time A");
    }

    @Test
    public void oJogoNaoTemVencedor(){
        Controlador c = new Controlador();
        c.criarJogo("12:00", "Time A", "Time B");
        assertEquals(c.atualizarPontuacao(25, 0), "Time A");
        assertEquals(c.atualizarPontuacao(25, 0), "Time A");
        assertEquals(c.atualizarPontuacao(25,27), "Time B");
        assertEquals(c.getVencedor(), null);
    }



    @Test
    public void quintoSetEhAteh15(){
        Controlador c = new Controlador();
        c.criarJogo("12:00", "Time A", "Time B");
        assertEquals(c.atualizarPontuacao(25, 0), "Time A");
        assertEquals(c.atualizarPontuacao(25, 0), "Time A");
        assertEquals(c.atualizarPontuacao(25, 27), "Time B");
        assertEquals(c.atualizarPontuacao(25, 27), "Time B");
        assertEquals(c.atualizarPontuacao(15, 10), "Time A");
    }
}
