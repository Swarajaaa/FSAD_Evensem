package com.klu;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class app {
    public static void main(String[] args) {
        // CREATE
        Session session = hibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        student s1 = new student(101, "Jay", "CSE");
        session.save(s1);
        tx.commit();
        session.close();
        System.out.println("Student Inserted");
        // READ
        session = hibernateUtil.getSessionFactory().openSession();
        student s = session.get(student.class, 101);
        System.out.println(s.getName() + " " + s.getDept());
        session.close();
        // UPDATE
        session = hibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        s.setDept("AI & DS");
        session.update(s);
        tx.commit();
        session.close();
        System.out.println("Student Updated");
        /*DELETE
        session = hibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        session.delete(s);
        tx.commit();
        session.close();
        System.out.println("Student Deleted");
        */
    }


}
