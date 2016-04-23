/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Objetos.Equipamento;
import Objetos.Usuario;
import java.util.List;
import javax.persistence.*;
import projetomauricio.DAO.CadastraEquipamento;

/**
 *
 * @author Lucas
 */
public class teste {

    public static void main(String[] args) {
        EntityManager manager = new JPAUtil().criaEntityManager();

        /*Usuario user = new Usuario("Lucas", "123");
        
        manager.getTransaction();
        manager.persist(user);
        manager.getTransaction().commit();
        manager.close();*/
        Equipamento equipamento = new Equipamento(1, "teste", "teste", "teste", "teste", 0.5, "teste");
        CadastraEquipamento cadastro = new CadastraEquipamento();
        cadastro.CadastroEquipalemto(equipamento);

    }

}
