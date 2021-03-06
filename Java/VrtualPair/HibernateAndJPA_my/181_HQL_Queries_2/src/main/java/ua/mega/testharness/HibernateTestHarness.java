package ua.mega.testharness;

import ua.mega.domain.Student;
import ua.mega.domain.Subject;
import ua.mega.domain.Tutor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

public class HibernateTestHarness {
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("myDatabaseConfig");

    public static void main(String[] args) {

        String requiredName = "David Banks";
        String city = "Georgia";

        setUpData();
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

//        Tutor tutor = em.find(Tutor.class, 1);
//        Query q = em.createQuery("from Student as student where student.supervisor = :tutor");
//        q.setParameter("tutor", tutor);

//        Query q = em.createQuery("from Student as student where student.supervisor.name=:name");
//        q.setParameter("name", requiredName);

//        Query q = em.createQuery("from Tutor as tutor where tutor.supervisionGroup is empty ");
//        Query q = em.createQuery("from Tutor as tutor where tutor.supervisionGroup is not empty ");

       /* Subject subject = em.find(Subject.class, 1);
        Query q = em.createQuery("from Tutor as tutor where :subject member of tutor.taughtSubjects");
        q.setParameter("subject", subject);
        List<Tutor> result = q.getResultList();*/

        /*Subject subject = em.find(Subject.class, 2);
        Query q = em.createQuery("from  Student as student where :subject member of student.supervisor.taughtSubjects");
        q.setParameter("subject", subject);
        List<Student> result = q.getResultList();*/

        /*Query q = em.createQuery("from Tutor as tutor join tutor.supervisionGroup as student where student.address.city='Georgia'");
        List<Object[]> result = q.getResultList();*/
        /*Query q = em.createQuery("select distinct tutor from Tutor as tutor join tutor.supervisionGroup as student where student.address.city='Georgia'");
        List<Tutor> result = q.getResultList();*/
       /* Query q = em.createQuery("select distinct student.supervisor from Student as student where student.address.city='Georgia'");
        List<Tutor> result = q.getResultList();*/

        List<Object[]> result = em.createQuery("from Tutor as tutor join tutor.supervisionGroup as student where student.address.city = :city")
                .setParameter("city", city)
                .getResultList();

        for (Object[] next : result) {
            System.out.println(next[0] + "--" + next[1]);
        }

        tx.commit();
        em.close();
    }

    private static void setUpData() {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        // Some Objects
        Subject mathematics = new Subject("Mathematics", 2);
        Subject science = new Subject("Science", 2);
        Subject history = new Subject("History", 3);
        em.persist(mathematics);
        em.persist(science);
        em.persist(history);

        // This tutor will be very busy, with lots of students 
        Tutor t1 = new Tutor("ABC123", "David Banks", 10000);
        t1.addSubjectToTutor(mathematics);
        t1.addSubjectToTutor(science);

        // This tutor is new and has no students
        // But he will be able to teach science and mathematics
        Tutor t2 = new Tutor("DEF456", "Alan Bridges", 15000);
        t2.addSubjectToTutor(mathematics);
        t2.addSubjectToTutor(science);

        // This tutor is the only tutor who can teach History
        Tutor t3 = new Tutor("GHI678", "Linda Histroia", 20000);
        t3.addSubjectToTutor(history);
        t3.addSubjectToTutor(science);

        em.persist(t1);
        em.persist(t2);
        em.persist(t3);

        // this only works because we are cascading from tutor to student
        t1.createStudentAndAddToSupervisionGroup("Marco Fortes", "1-FOR-2010", "1 The Street", "Georgia", "484848");
        t1.createStudentAndAddToSupervisionGroup("Kath Grainer", "2-GRA-2009", "2 Kaths Street", "Georgia", "939393");
        t3.createStudentAndAddToSupervisionGroup("Sandra Perkins", "3-PER-2009", "4 The Avenue", "Georgia", "939393");


        tx.commit();
        em.close();
    }
}
