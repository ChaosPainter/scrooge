/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.SessionFactory;
import scrooge.models.Location;

/**
 *
 * @author Muman
 */
public class LocationDAOImpl implements LocationDAO{

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
    public void addLocation(Location location) {
        getSessionFactory().getCurrentSession().save(location);
    }

    @Override
    public void deleteLocation(Location location) {
        getSessionFactory().getCurrentSession().delete(location);
    }

    @Override
    public void updateLocation(Location location) {
        getSessionFactory().getCurrentSession().update(location);
    }

    @Override
    public Location getLocationById(int id) {
       List list = getSessionFactory().getCurrentSession().createQuery("from location where id=?").setParameter(0,id).list();
       return (Location)list.get(0);
    }

    @Override
    public List<Location> getAllLocations() {
        List list = getSessionFactory().getCurrentSession().createQuery("from location").list();
        return list;
    }
}
