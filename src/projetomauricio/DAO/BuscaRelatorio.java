/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomauricio.DAO;

import Objetos.Operacao;
import Util.JPAUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Lucas
 */
public class BuscaRelatorio {

    EntityManager manager = new JPAUtil().criaEntityManager();

    public List<Operacao> Relatorio(int id, Date inicial, Date fim) {
        Query query = manager.createQuery("select o from Operacao o where o.equipamento.id = :id and o.data >= :inicial and o.data <= :final");
        List<Operacao> operacoes = new ArrayList<>();
        query.setParameter("id", id);
        query.setParameter("inicial", inicial);
        query.setParameter("final", fim);
        operacoes = query.getResultList();
        return operacoes;
    }

}
