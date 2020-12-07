/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;


/**
 *
 * @author CROSS
 */
public class Json {
    private boolean statusToken;
    private String token;
    private boolean resultado;
    private String msg;
    private Object json;

    /* GET SET */

    public boolean isStatusToken() {
        return statusToken;
    }

    public void setStatusToken(boolean statusToken) {
        this.statusToken = statusToken;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getJson() {
        return json;
    }

    public void setJson(Object json) {
        this.json = json;
    }
    


}
