/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomauricio.DAO;

import Objetos.Usuario;
import Util.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.smartcardio.ATR;

/**
 *
 * @author ljrocha
 */
public class VerificaUsuario {

    EntityManager manager = new JPAUtil().criaEntityManager();
    boolean logado = false;

    public boolean verificaUsuario(Usuario usuario) {
        try {
            Query query = manager.createQuery("select u from Usuario as u where u.nome = :nome and u.senha = :senha");
            query.setParameter("nome", usuario.getNome());
            query.setParameter("senha", usuario.getSenha());
            List<Usuario> usuarios = query.getResultList();
            
            for(Usuario user : usuarios) {
                System.out.println(user.getNome());
                logado = true;
            }
        } catch (Exception e) {
            logado = false;
            e.printStackTrace();
        }
        return logado;
    }
}
