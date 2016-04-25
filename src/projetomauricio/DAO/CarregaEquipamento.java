/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomauricio.DAO;

import Objetos.Equipamento;
import Util.JPAUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Lucas
 */
public class CarregaEquipamento {

    EntityManager manager = new JPAUtil().criaEntityManager();

    public List<Equipamento> CarregaFrota() {
        List<Equipamento> equipamentos = new ArrayList<>();
        equipamentos = manager.createQuery("select e from Equipamento e").getResultList();
        manager.close();
        return equipamentos;
    }

    public List<Equipamento> CarregaEquipamento(int valor) {
        List<Equipamento> equipamentos = new ArrayList<>();
        Query query = manager.createQuery("select e from Equipamento e where e.frota = :valor");
        query.setParameter("valor", valor);
        equipamentos = query.getResultList();
        manager.close();
        return equipamentos;
    }
}
