/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.SessionFactory;
import models.Report;
import models.Users;

/**
 *
 * @author Muman
 */
public class ReportDAOImpl implements ReportDAO{

    private SessionFactory sessionFactory;

     /**
     * @return the SessionFactory
     */
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    /**
     * @param SessionFactory the SessionFactory to set
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void addReport(Report report) {
        getSessionFactory().getCurrentSession().save(report);
    }

    @Override
    public void deleteReport(Report report) {
        getSessionFactory().getCurrentSession().delete(report);
    }

    @Override
    public void updateReport(Report report) {
        getSessionFactory().getCurrentSession().update(report);
    }

    @Override
    public Report getReportById(int id) {
       List list = getSessionFactory().getCurrentSession().createQuery("from report where id=?").setParameter(0,id).list();
       return (Report)list.get(0);
    }

    @Override
    public List<Report> getAllRepors() {
        List list = getSessionFactory().getCurrentSession().createQuery("from report").list();
        return list;
    }
}