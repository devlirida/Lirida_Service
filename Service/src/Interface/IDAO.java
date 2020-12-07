/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.List;

/**
 *
 * @author bruno
 */

public interface IDAO {

    public String inserir(Object pObject);

    public Object novo(Object pObject);

    public String alterar(Object pObject);

    public List<Object> listar(String pData);
    
    public Object buscar(String pData);

    public String deletar(String pCodigo);

}
