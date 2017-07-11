package ua.mega.services.diary;

import org.springframework.transaction.annotation.Transactional;
import ua.mega.dataaccess.ActionDao;
import ua.mega.domain.Action;

import java.util.List;

@Transactional
public class DiaryManagementServiceProductionImpl implements DiaryManagementService {

    private ActionDao dao;

    public DiaryManagementServiceProductionImpl(ActionDao dao) {
        this.dao = dao;
    }

    @Override
    public void recordAction(Action action) {
        dao.create(action);
    }

    @Override
    public List<Action> getAllIncompleteActions(String requiredUser) {
        return dao.getIncompleteActions(requiredUser);
    }
}
