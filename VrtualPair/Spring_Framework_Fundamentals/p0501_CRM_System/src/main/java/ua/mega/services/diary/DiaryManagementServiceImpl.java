package ua.mega.services.diary;

import ua.mega.domain.Action;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DiaryManagementServiceImpl implements DiaryManagementService {

    private Set<Action> allActions = new HashSet<Action>();


    @Override

    public void recordAction(Action action) {
        allActions.add(action);
    }

    @Override
    public List<Action> getAllIncompleteActions(String requiredUser) {
        List<Action> results = new ArrayList<>();
        for (Action next : this.allActions) {
            if (next.getOwningUser().equals(requiredUser) && !next.isComplete()) {
                results.add(next);
            }
        }
        return results;
    }
}
