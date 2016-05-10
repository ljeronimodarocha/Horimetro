/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomauricio.DAO;

import Objetos.Operacao;
import Util.JPAUtil;
import javax.persistence.EntityManager;

/**
 *
 * @author Lucas
 */
public class CadastraOperacao {

    EntityManager manager = new JPAUtil().criaEntityManager();
    boolean efetuado = false;

    public boolean CadastraOperação(Operacao operacao) {
        try {
            manager.getTransaction().begin();
            manager.persist(operacao);
            manager.getTransaction().commit();
            manager.close();
            efetuado = true;
        } catch (Exception e) {
            System.out.println(e);
            efetuado = false;
        }
        return efetuado;
    }

}
