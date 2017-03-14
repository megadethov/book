package ua.mega;

/*Spring's event handling is single-threaded so if an event is published,
until and unless all the receivers get the message, the processes are blocked
and the flow will not continue*/

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class CStartEventHandler implements ApplicationListener<ContextStartedEvent> {
    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("ContextStartedEvent Received");
    }
}
