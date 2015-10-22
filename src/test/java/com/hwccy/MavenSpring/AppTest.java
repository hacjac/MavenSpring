package com.hwccy.MavenSpring;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hwccy.MavenHibernate.dao.CustomerDAO;
import com.hwccy.MavenHibernate.dao.OrderDAO;
import com.hwccy.MavenHibernate.dao.impl.CustomerDAOImpl;
import com.hwccy.MavenHibernate.dao.impl.OrderDAOImpl;
import com.hwccy.MavenHibernate.dao.impl.StudentDAOImpl;
import com.hwccy.MavenHibernate.entity.Customer;
import com.hwccy.MavenHibernate.entity.Order;
import com.hwccy.MavenHibernate.entity.Student;
import com.hwccy.MavenHibernate.util.HibernateUtil;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	/*Student student=new Student();
    	student.setName("whcy");
    	student.setAge(33);
    	StudentDAO studentDAO=new StudentDAOImpl();
    	studentDAO.save(student);
    	Map<String, Object> map=new HashMap<String, Object>();
    	map.put("name", "'whcy'");
    	map.put("age", 33);
    	map.put("id", 5);
    	List<Student> list= studentDAOImpl.select(map);
    	for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Student student2 = (Student) iterator.next();
			System.out.println(student2);
		}*/
    	/*Customer customer=new Customer();
    	Order order=new Order();
    	Order order2=new Order();
    	order.setOrderNumber("111");
    	order2.setOrderNumber("222");
    	order.setCustomer(customer);
    	order2.setCustomer(customer);
    	customer.setName("000");
    	customer.getSet().add(order);
    	customer.getSet().add(order2);
    	CustomerDAO customerDAO=new CustomerDAOImpl();
    	customerDAO.save(customer);
    	Map<String, Object> map=new HashMap<String,Object>();
    	map.put("name", "000");
    	
    	Order order3=new Order();
    	order3.setOrderNumber("333");
    	Customer customer3=new Customer();
    	customer3.setId(2);
    	order3.setCustomer(customer3);
    	OrderDAO orderDAO=new OrderDAOImpl();
    	orderDAO.save(order3);
    	Map<String, Object> map2=new HashMap<String, Object>();
    	map2.put("customer", customer3);
    	
    	List<Order> lis =orderDAO.select(map2);
    	List<Customer> list= customerDAO.select(map);
    	for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Customer customer2 = (Customer) iterator.next();
			System.out.println(customer2.toString2());
		}
    	for (Iterator iterator = lis.iterator(); iterator.hasNext();) {
			Order order4 = (Order) iterator.next();
			System.out.println(order4);
		}*/
        assertTrue( true );
    }
}
