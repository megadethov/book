import javax.jms.*;

public class MapMessageListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
        if (message instanceof MapMessage) {
            MapMessage msg = (MapMessage) message;
            try {
                String firstName = msg.getStringProperty("firstName");
                System.out.println("Employee name is: " + firstName + " with priority: " + msg.getJMSPriority());
            } catch (JMSException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Received unexpected message type");
        }
    }
}
