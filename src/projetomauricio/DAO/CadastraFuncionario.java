/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomauricio.DAO;

import Objetos.Usuario;
import Util.JPAUtil;
import javax.persistence.EntityManager;

/**
 *
 * @author ljrocha
 */
public class CadastraFuncionario {

    EntityManager manager = new JPAUtil().criaEntityManager();
    boolean Registrado = false;

    public boolean InsereUsuario(Usuario usuario) {
        try {
            manager.getTransaction().begin();
            manager.persist(usuario);
            manager.getTransaction().commit();
            manager.close();
            Registrado = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Registrado;
    }
}
