/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pruebaejbservice;

import com.carlos.pruebaejbservice.entity.Movimiento;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Carlos
 */
@Stateless
public class MovimientoServiceImpl implements MovimientoServiceLocal {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void insertar(Movimiento movimiento) {
        entityManager.persist(movimiento);
    }

    @Override
    public Movimiento buscar(Long id) {
        Movimiento movimientoEncontrado;

        movimientoEncontrado = entityManager.find(Movimiento.class, id);

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
