import javax.jms.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Date;

public class MessageSender {

    public static void main(String[] args) {
        Connection connection = null;
        try {
            Context ctx = new InitialContext();
            Queue queue = (Queue) ctx.lookup("jms/EmployeeManagementQueue");
            ConnectionFactory cf = (ConnectionFactory) ctx.lookup("jms/ConnectionFactory");
            connection = cf.createConnection();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer messageProducer = session.createProducer(queue);

            /*TextMessage message = session.createTextMessage();
            message.setText("The time is now " + new Date());*/

            MapMessage message = session.createMapMessage();
            message.setStringProperty("firstName", "Vasya");
            message.setStringProperty("surname", "Pupkin");
            message.setInt("salary", 100);

//            messageProducer.setDeliveryMode(DeliveryMode.NON_PERSISTENT); // switch Message Persistence off
//            messageProducer.send(message);

//            messageProducer.setPriority(7);
            messageProducer.send(message, DeliveryMode.PERSISTENT, 1, 0);

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
