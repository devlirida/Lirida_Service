/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author bruno
 */
public class LiridaUtil {

    public static HashMap<String, String> preencherRetorno(String pResult, String pMsg) {
        HashMap<String, String> retorno = new HashMap<String, String>();
        try {
            System.out.println(pResult + " - " + pMsg);
            retorno.put("msg", URLEncoder.encode(pMsg, "UTF-8"));
            retorno.put("result", pResult);

        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(LiridaUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }

    public static String retornarJson(Object pObjeto, boolean pResultado, String pMsg, String pToken) {
        Json json = new Json();
        json.setMsg(pMsg);
        json.setResultado(pResultado);
        json.setJson(pObjeto);
        json.setToken(pToken);

//        Usuario usuario = buscarUsuarioPorToken(pToken);
//        json.setStatusToken(false);
//        if (usuario != null) {
        json.setStatusToken(true);
        //    }
        Gson gson = new GsonBuilder().setDateFormat("dd-MM-yyyy'T'HH:mm:ss").create();

        return gson.toJson(json);

    }

    public static String gerarRandom() {

        Random gerador = new Random();

        return String.valueOf(gerador.nextInt()).substring(2, 8);
    }

    public static boolean stringVazia(String pString) {
        boolean retorno = false;

        if (pString == null) {
            retorno = true;
        } else if (pString.isEmpty()) {
            retorno = true;
        }
        return retorno;
    }

    public static String lerJson(String pJson, String pCampo) {
        String retorno = "";
        try {
            JSONObject obj = new JSONObject(pJson);

            retorno = obj.getString(pCampo);

        } catch (JSONException ex) {
            Logger.getLogger(LiridaUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;

    }

}
