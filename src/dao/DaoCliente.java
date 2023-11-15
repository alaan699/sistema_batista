/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.AcsCliente;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author ENTERPRISE
 */
public class DaoCliente extends DaoAbstract {

    @Override
    public void insert(Object object) {
       session.beginTransaction(); 
       session.save(object);
       session.getTransaction().commit(); 
    }

    @Override
    public void update(Object object) {
       session.beginTransaction();
       session.flush(); 
       session.clear();
       session.update(object);
       session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
       session.beginTransaction();
       session.flush(); 
       session.clear();
       session.delete(object);
       session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(AcsCliente.class); 
        criteria.add(Restrictions.eq("id", id)); 
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista; 
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(AcsCliente.class); 
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista; 
    }
        public List listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(AcsCliente.class);
        criteria.add(Restrictions.like("acsNome", "%" + nome+ "%"));
        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    
    
    }
    public List listEstadoCivil(int EstadoCivil) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(AcsCliente.class);
        criteria.add(Restrictions.eq("acsEstadoCivil", EstadoCivil));
        List results = criteria.list();
        session.getTransaction().commit();  
        return results;
     }    
    public List listNomeEstadoCivil(String nome, int EstadoCivil) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(AcsCliente.class);
        criteria.add(Restrictions.like("acsNome", "%" + nome + "%"));
        criteria.add(Restrictions.eq("acsEstadoCivil", EstadoCivil));

        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    
    
}
    
}
