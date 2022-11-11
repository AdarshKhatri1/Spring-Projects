package com.masai.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {

	public static void main(String[] args) {			
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("adarsh");		
		EntityManager em = emf.createEntityManager();
		
		Department dep = new Department(2, "marketing", "delhi");
		
		Employee emp =new Employee(3, "koushik", 345);
		Employee emp1 =new Employee(4, "robin", 367);
		emp1.setDept(dep);
		emp.setDept(dep);
		
		dep.getEmps().add(emp);
		dep.getEmps().add(emp1);
		
		
		em.getTransaction().begin();
		em.persist(dep);
		
		
		
		em.getTransaction().commit();
		
		em.close();

System.out.println("success");
	}	
	
}
