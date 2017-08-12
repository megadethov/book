package ua.mega.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.mega.domain.Action;
import ua.mega.domain.Call;
import ua.mega.domain.Customer;
import ua.mega.services.calls.CallHandlingService;
import ua.mega.services.customers.CustomerManagementService;
import ua.mega.services.customers.CustomerNotFoundException;
import ua.mega.services.diary.DiaryManagementService;

public class SimpleClientTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application.xml");

        try {
            CustomerManagementService customerService = container.getBean(CustomerManagementService.class);
            CallHandlingService callService = container.getBean(CallHandlingService.class);
            DiaryManagementService diaryService = container.getBean(DiaryManagementService.class);

            try {
                System.out.println(customerService.findCustomerById("12345").getCompanyName());
            } catch (CustomerNotFoundException e) {
                e.printStackTrace();
            }

			/*try
            {
			CustomerXML oldCustomer = customerService.findCustomerById("CS03939");
			customerService.deleteCustomer(oldCustomer);
			}
			catch (CustomerNotFoundException e)
			{
				System.out.println("Sorry, that customer doesn't exisit");
			}
			
			// begin
			customerService.newCustomer(new CustomerXML("CS03939", "Acme", "Good CustomerXML"));
			// commit

			Call newCall = new Call("Larry Wall called from Acme Corp");
			Action action1 = new Action("Call back Larry to ask how things are going", new GregorianCalendar(2016, 0, 0), "rac");
			Action action2 = new Action("Check our sales dept to make sure Larry is being tracked", new GregorianCalendar(2016, 0, 0), "rac");

			List<Action> actions = new ArrayList<Action>();
			actions.add(action1);
			actions.add(action2);

			// begin
			try
			{
				callService.recordCall("CS03939", newCall, actions);
			}
			catch (CustomerNotFoundException e)
			{
				System.out.println("That customer doesn't exist");
			}
			// commit

			System.out.println("Here are the outstanding actions:");
			Collection<Action> incompleteActions = diaryService.getAllIncompleteActions("rac");
			for (Action next: incompleteActions)
			{
				System.out.println(next);
			}*/
        } finally {
            container.close();
        }
    }

}
