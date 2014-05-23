/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author z ventas
 */
@Stateless
public class VehiculoFacade extends AbstractFacade<Vehiculo> {
    @PersistenceContext(unitName = "ExamenUPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VehiculoFacade() {
        super(Vehiculo.class);
    }
    
}
