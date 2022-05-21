/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.Controller;

import java.util.ArrayList;

/**
 *
 * @author guand
 */
public class Jogo {

    private String timeA, timeB;
    private String horario;
    private ArrayList<Set> setsDoJogo;
    private int setAtual = 0;

    public Jogo(String horario, String timeA, String timeB) {
        setsDoJogo = new ArrayList<Set>();
        this.horario = horario;
        this.timeA = timeA;
        this.timeB = timeB;
        setsDoJogo.add(new Set());
    }

    public String getTimeA(){
        return timeA;
    }

    public String getTimeB(){
        return timeB;
    }
    public String atualizarPontuacao(int timeA, int timeB) {
        setsDoJogo.get(setAtual).setPontuacaoA(timeA);
        setsDoJogo.get(setAtual).setPontuacaoB(timeB);
        return retornaVencedorEsseSet();
    }

    public int getSetAtual(){
        return setAtual;
    }
    public String vencedorJogo() {
        String resultado = null;
        if (timeAVezesVenceu == 3) {
            resultado = timeA;
        }

        if (timeBVezesVenceu == 3) {
            resultado = timeB;
        }
        return resultado;

    }

    private int timeAVezesVenceu = 0;
    private int timeBVezesVenceu = 0;

    private String retornaVencedorEsseSet() {
        String resultado = setsDoJogo.get(setAtual).retornaVencedor(setAtual);
        if (resultado == null) {
            //jogo ainda nao acabou

        } else {
            if (resultado.equals("A")) {
                timeAVezesVenceu++;
                resultado = timeA;
            } else if (resultado.equals("B")) {
                timeBVezesVenceu++;
                resultado = timeB;
            }
            setsDoJogo.add(new Set());
            setAtual++;
        }
        
        

        return resultado;
    }
}
