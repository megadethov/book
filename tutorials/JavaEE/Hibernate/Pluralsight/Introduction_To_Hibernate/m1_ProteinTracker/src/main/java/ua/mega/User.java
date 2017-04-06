package ua.mega;

import java.util.HashSet;
import java.util.Set;

public class User {
    private int id;
    private String name;

    private ProteinData proteinData = new ProteinData();

    private Set<UserHistory> histories = new HashSet<>();

    public Set<UserHistory> getHistories() {
        return histories;
    }

    public void setHistories(Set<UserHistory> histories) {
        this.histories = histories;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProteinData getProteinData() {
        return proteinData;
    }

    public void setProteinData(ProteinData proteinData) {
        this.proteinData = proteinData;
    }
}
