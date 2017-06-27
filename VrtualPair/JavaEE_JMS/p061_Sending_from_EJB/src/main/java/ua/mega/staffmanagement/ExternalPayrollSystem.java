package ua.mega.staffmanagement;

import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(mappedName = "jms/EmployeeManagementQueue")
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

            // System crush emulation
            throw new NullPointerException();

        } catch (JMSException e) {
            throw new RuntimeException(e);
        }

    }
}
