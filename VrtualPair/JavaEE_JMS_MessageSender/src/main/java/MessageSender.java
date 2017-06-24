import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Date;

public class MessageSender {



    public static void main(String[] args) {
        try {
            Context ctx = new InitialContext();
            Queue queue = (Queue) ctx.lookup("jms/EmployeeManagementQueue");
            ConnectionFactory cf = (ConnectionFactory) ctx.lookup("jms/ConnectionFactory");
            Connection connection = cf.createConnection();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer messageProducer = session.createProducer(queue);

            TextMessage message = session.createTextMessage();
            message.setText("The time is now " + new Date());
            messageProducer.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
