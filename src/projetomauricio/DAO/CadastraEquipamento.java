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
public class CadastraEquipamento {

    EntityManager manager = new JPAUtil().criaEntityManager();
    boolean efetuado = false;

    public boolean CadastroEquipalemto(Equipamento equipamento) {
        try {
            manager.getTransaction().begin();
            manager.persist(equipamento);
            manager.getTransaction().commit();
            manager.close();
            efetuado = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return efetuado;
    }

}
