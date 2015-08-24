
package com.aliashik;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;
import org.hibernate.Transaction;

@ManagedBean
@SessionScoped
public class UserBean {
    
    
    private HibernateUtil helper;
    private Session session;
    
    public String insert(){
        
        try{
            session = helper.getSessionFactory().openSession();
            
            try{
                Transaction transaction = session.beginTransaction();
                TestTable obj = new TestTable("Ashik");
                session.save(obj);
                transaction.commit();
            }finally{
                session.close();
            }
        }catch(Exception ex){
            
        }
        
        return "success";
    }
}
