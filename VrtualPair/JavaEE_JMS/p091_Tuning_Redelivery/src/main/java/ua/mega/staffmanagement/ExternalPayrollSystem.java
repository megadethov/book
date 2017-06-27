package ua.mega.staffmanagement;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(mappedName="jms/EmployeeManagementQueue",
        messageListenerInterface=MessageListener.class,
        activationConfig = {
                @ActivationConfigProperty( propertyName="endpointExceptionRedeliveryAttempts",
                        propertyValue="10" )

                // add in more properties here if desired.
        } )
public class ExternalPayrollSystem implements MessageListener {

    @Override
    public void onMessage(Message message) {

        MapMessage msg = (MapMessage) message;

        try {
            String firstName = msg.getString("firstName");
            String surname = msg.getString("surname");
            int salary = msg.getInt("salary");

            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                //NOP
            }

            System.out.println(firstName + " " + surname + " salary = " + salary);

            // external System not available at 50% of time
            if (Math.random() > 0.5)
                throw new NullPointerException();

        } catch (JMSException e) {
            throw new RuntimeException(e);
        }

    }
}
