package DAO;

import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import java.util.List;

public class DataDao {
    public void savaData(Student student){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        session.close();
    }
    public List<Student> getAll(){
        String hql = "from Student ";
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Student> students = session.createQuery(hql).getResultList();
        return students;
    }
    public void deleteData(Student data){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(data);
        transaction.commit();
        session.close();
    }
    public void updateData(Student data){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(data);
        transaction.commit();
        session.close();
    }
}
