/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package  udesc.Controller;

/**
 *
 * @author guand
 */
public class Time {

    private String nome;
    private int pontos;

    public Time(String nome) {
        this.nome= nome;
    }

    void atualizarPontuacao(int pontos) {
        this.pontos = pontos;
    }

}
