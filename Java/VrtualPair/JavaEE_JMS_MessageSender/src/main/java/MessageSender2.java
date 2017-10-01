import javax.jms.*;
import javax.naming.Context;
import javax.naming.InitialContext;

public class MessageSender2 {

    public static void main(String[] args) {
        Connection connection = null;
        try {
            Context ctx = new InitialContext();
            Queue queue = (Queue) ctx.lookup("jms/EmployeeManagementQueue");
            ConnectionFactory cf = (ConnectionFactory) ctx.lookup("jms/ConnectionFactory");
            connection = cf.createConnection();
//            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//            Session session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE); // true=batch
            Session session = connection.createSession(true, 0); // true=batch
            MessageProducer messageProducer = session.createProducer(queue);

            MapMessage message = session.createMapMessage();
            message.setStringProperty("firstName", "Vasya");
            message.setStringProperty("surname", "Pupkin");
            message.setInt("salary", 100);

            messageProducer.send(message);
            messageProducer.send(message);
            messageProducer.send(message);
            messageProducer.send(message);
            messageProducer.send(message);

            session.commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
            System.exit(0);
        }
    }
}
