/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomauricio.DAO;

import Objetos.Equipamento;
import Util.JPAUtil;
import javax.persistence.EntityManager;

/**
 *
 * @author Lucas
 */
public class AtualizaEquipamento {

    public void Atualiza(Equipamento equipamento) {
        EntityManager manager = new JPAUtil().criaEntityManager();
        
        manager.getTransaction().begin();
        manager.merge(equipamento);

        manager.getTransaction().commit();
        manager.close();
    }

}
