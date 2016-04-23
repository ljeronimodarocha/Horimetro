/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Lucas
 */
public class JPAUtil {

	public static EntityManager criaEntityManager()
        {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("database");
		return factory.createEntityManager();
	}
}
