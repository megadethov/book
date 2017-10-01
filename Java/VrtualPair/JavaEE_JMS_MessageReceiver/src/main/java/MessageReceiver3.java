import javax.jms.*;
import javax.naming.Context;
import javax.naming.InitialContext;

public class MessageReceiver3 {

    public static void main(String[] args) {

        try {
            Context ctx = new InitialContext();
            Queue queue = (Queue) ctx.lookup("jms/EmployeeManagementQueue");
            ConnectionFactory cf = (ConnectionFactory) ctx.lookup("jms/ConnectionFactory");
            Connection connection = cf.createConnection();
            Session session = connection.createSession(false, Session.CLIENT_ACKNOWLEDGE);

            MessageConsumer consumer = session.createConsumer(queue);
//            consumer.setMessageListener(new MapMessageListener());

            connection.start();

            Message msg = consumer.receive();
            msg.acknowledge();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
