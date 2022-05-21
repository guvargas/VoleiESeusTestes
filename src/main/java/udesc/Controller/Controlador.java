/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.Controller;

/**
 *
 * @author guand
 */
public class Controlador {

    private Jogo jogo;

    public String atualizarPontuacao(int timeA,int timeB) {
       return jogo.atualizarPontuacao(timeA,timeB);
       
    }
    
    public String getVencedor(){
        return jogo.vencedorJogo();
    }

    public int getSetAtual(){
        return jogo.getSetAtual();
    }
    
    public void criarJogo(String horario, String timeA, String timeB)
    {
        jogo =new Jogo(horario,timeA,timeB);
    }

    public String getTimeA(){
        return jogo.getTimeA();
    }

    public String getTimeB(){
        return jogo.getTimeB();
    }
}
