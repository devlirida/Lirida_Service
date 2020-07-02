/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import ClausulaSQL.ClausulaWhere;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author bruno
 */
public interface IDAO {

    public HashMap<String, String> inserir(Object pObject);

    public Object novo(Object pObject);

    public HashMap<String, String> alterar(Object pObject);

    public List<Object> listar(ClausulaWhere sClausula);
    
    public Object buscar(ClausulaWhere sClausula);

    public HashMap<String, String> deletar(Object pObject);

}
