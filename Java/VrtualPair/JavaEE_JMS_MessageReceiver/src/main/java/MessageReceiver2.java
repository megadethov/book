import javax.jms.*;
import javax.naming.Context;
import javax.naming.InitialContext;

public class MessageReceiver2 {

    public static void main(String[] args) {

        try {
            Context ctx = new InitialContext();
            Queue queue = (Queue) ctx.lookup("jms/EmployeeManagementQueue");
            ConnectionFactory cf = (ConnectionFactory) ctx.lookup("jms/ConnectionFactory");
            Connection connection = cf.createConnection();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            MessageConsumer consumer = session.createConsumer(queue);

            connection.start();

            Message message = consumer.receive(10000);
//            Message message2 = consumer.receive();
//            Message message3 = consumer.receive();

            if (message == null) {
                System.out.println("No messages received in time");
            } else {
                MapMessage mapMessage = (MapMessage) message;
                System.out.println("Message received for the employee " + mapMessage.getString("surname"));
            }

            connection.close();
            System.exit(0);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
