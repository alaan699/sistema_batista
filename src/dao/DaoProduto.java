/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.AcsProduto;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author ENTERPRISE
 */
public class DaoProduto extends DaoAbstract {

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
        Criteria criteria = session.createCriteria(AcsProduto.class); 
        criteria.add(Restrictions.eq("idProduto", id)); 
        List lista = criteria.list();
        session.getTransaction().commit();
        return(ArrayList) lista; 
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(AcsProduto.class); 
        List lista = criteria.list();
        session.getTransaction().commit();
        return(ArrayList) lista; 
    }
        public List listPeso(String peso) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(AcsProduto.class);
        criteria.add(Restrictions.like("acsPeso", "%" + peso+ "%"));
        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    }
    public List listTempopreparo(int Tempopreparo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(AcsProduto.class);
        criteria.add(Restrictions.eq("acsTempopreparo", Tempopreparo));
        List results = criteria.list();
        session.getTransaction().commit();  
        return results;
     }    
    public List listPesoTempopreparo(String peso, int Tempopreparo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(AcsProduto.class);
        criteria.add(Restrictions.like("acsPeso", "%" + peso + "%"));
        criteria.add(Restrictions.eq("acsTempopreparo", Tempopreparo));

        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    
    
}
    
}

