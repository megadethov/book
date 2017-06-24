import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class TextMessageListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
        if (message instanceof TextMessage) {
            TextMessage msg = (TextMessage) message;
            try {
                System.out.println(msg.getText());
            } catch (JMSException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Received unexpected message type");
        }
    }
}
