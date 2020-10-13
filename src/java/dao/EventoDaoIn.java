/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import jpa.entities.Evento;

/**
 *
 * @author Casa
 */
public interface EventoDaoIn {
     void salva(Evento e);  
     
   List <Evento>listar ();
   Evento recupera (String chave);
     
   Evento buscarPorChavePrimaria(String chave);
    

   void excluir(Evento obj);

    }