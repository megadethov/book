import javax.jms.*;
import javax.naming.Context;
import javax.naming.InitialContext;

public class MessageReceiver4 {

    public static void main(String[] args) {

        try {
            Context ctx = new InitialContext();
            Queue queue = (Queue) ctx.lookup("jms/EmployeeManagementQueue");
            ConnectionFactory cf = (ConnectionFactory) ctx.lookup("jms/ConnectionFactory");
            Connection connection = cf.createConnection();
            Session session = connection.createSession(false, Session.DUPS_OK_ACKNOWLEDGE);

            MessageConsumer consumer = session.createConsumer(queue);
            consumer.setMessageListener(new MapMessageListener());

            connection.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
