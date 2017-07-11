package ua.mega.services.calls;

import java.util.Collection;

import org.springframework.transaction.annotation.Transactional;
import ua.mega.domain.Action;
import ua.mega.domain.Call;
import ua.mega.services.customers.CustomerManagementService;
import ua.mega.services.customers.CustomerNotFoundException;
import ua.mega.services.diary.DiaryManagementService;

@Transactional
public class CallHandlingServiceImpl implements CallHandlingService {
    private CustomerManagementService customerService;
    private DiaryManagementService diaryService;

    public CallHandlingServiceImpl(CustomerManagementService cms, DiaryManagementService dms) {
        this.customerService = cms;
        this.diaryService = dms;
    }


    @Override
    public void recordCall(String customerId, Call newCall, Collection<Action> actions) throws CustomerNotFoundException {
        // 1: call the customer service to record the call
        customerService.recordCall(customerId, newCall);

        // 2: call the diary service to record the actions
        for (Action nextAction : actions) {
            diaryService.recordAction(nextAction);
        }
    }

}
