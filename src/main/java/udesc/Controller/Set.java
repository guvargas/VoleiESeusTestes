/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package  udesc.Controller;

/**
 *
 * @author guand
 */
public class Set {

    private int pontuacaoA, pontuacaoB;

    public void setPontuacaoA(int pontuacao) {
        pontuacaoA = pontuacao;
    }

    public void setPontuacaoB(int pontuacao) {
        pontuacaoB = pontuacao;
    }

    public int getPontuacaoA() {
        return pontuacaoA;
    }

    public int getPontuacaoB() {
        return pontuacaoB;
    }

    public String retornaVencedor(int set) {

        //caso seja o quinto set
        if (set == 4) {
            if (pontuacaoA >= 15 && pontuacaoB < pontuacaoA - 1) {
                return "A";
            }

            if (pontuacaoB >= 15 && pontuacaoA < pontuacaoB - 1) {
                return "B";
            }

        } else {
            if (pontuacaoA >= 25 && pontuacaoB < pontuacaoA - 1) {
                return "A";
            }

            if (pontuacaoB >= 25 && pontuacaoA < pontuacaoB - 1) {
                return "B";
            }
        }

        return null;
    }
}
