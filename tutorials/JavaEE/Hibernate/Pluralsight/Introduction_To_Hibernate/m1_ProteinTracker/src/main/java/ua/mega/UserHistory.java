package ua.mega;

import java.util.Date;

public class UserHistory {
    private Date entryTime;
    private String Entry;

    public UserHistory() {
    }

    public UserHistory(Date entryTime, String entry) {
        this.entryTime = entryTime;
        Entry = entry;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public String getEntry() {
        return Entry;
    }

    public void setEntry(String entry) {
        Entry = entry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserHistory that = (UserHistory) o;

        if (entryTime != null ? !entryTime.equals(that.entryTime) : that.entryTime != null) return false;
        return Entry != null ? Entry.equals(that.Entry) : that.Entry == null;
    }

    @Override
    public int hashCode() {
        int result = entryTime != null ? entryTime.hashCode() : 0;
        result = 31 * result + (Entry != null ? Entry.hashCode() : 0);
        return result;
    }
}

