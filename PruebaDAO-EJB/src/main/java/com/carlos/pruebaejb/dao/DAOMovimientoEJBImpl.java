/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pruebaejb.dao;

import com.carlos.pruebaentity.Movimiento;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author martin
 */
@Stateless
public class DAOMovimientoEJBImpl implements DAOMovimientoEJBLocal {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void insertar(Movimiento movimiento) {
        entityManager.persist(movimiento);
    }

    @Override
    public Movimiento buscar(Long id) {
        
        Movimiento movimientoEncontrado = entityManager.find(Movimiento.class, id);

        return movimientoEncontrado;
    }

    @Override
    public List<Movimiento> buscarTodos() {
        
        CriteriaQuery cq = entityManager.getCriteriaBuilder().createQuery();
        
        cq.select(cq.from(Movimiento.class));
        
        Query q = entityManager.createQuery(cq);

        return q.getResultList();
    }

}
