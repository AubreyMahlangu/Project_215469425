package Service;


import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Entities.EmployeeEntity;

/**
 * Session Bean implementation class EmployeeEJB
 */
@Stateless
@LocalBean
public class EmployeeEJB {

    /**
     * Default constructor. 
     */
    @PersistenceContext
    	private EntityManager em;
    	
        public EmployeeEJB() {
            // TODO Auto-generated constructor stub
        }
        
        public void addNew(EmployeeEntity employeeEntity)
        {
        	System.out.println("============================");
        	System.out.println(employeeEntity.getName());
        	em.persist(employeeEntity);
        	System.out.println("============================");
        }
    }


