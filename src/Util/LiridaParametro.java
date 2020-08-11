/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author bruno
 */
public class LiridaParametro {

    String campo;
    String valor;

    public LiridaParametro(String campo, String valor) {
        this.campo = campo;
        this.valor = valor;
    }

    public LiridaParametro() {
    }

    
    
    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
