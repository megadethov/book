package ua.mega;

import java.util.*;

public class User {
    private int id;
    private String name;

    private ProteinData proteinData = new ProteinData();

    private Map<String, UserHistory> histories = new HashMap<>();

    public Map<String, UserHistory> getHistories() {
        return histories;
    }

    public void setHistories(Map<String, UserHistory> histories) {
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
