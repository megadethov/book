package ua.mega.lecture3.Practice2;

/**
 * Created by Yefremov Yuriy
 */
public class Baby {
    int rank;
    String mailName;
    String femaleName;

    public Baby(int rank, String mailName, String femaleName) {
        this.rank = rank;
        this.mailName = mailName;
        this.femaleName = femaleName;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getMailName() {
        return mailName;
    }

    public void setMailName(String mailName) {
        this.mailName = mailName;
    }

    public String getFemaleName() {
        return femaleName;
    }

    public void setFemaleName(String femaleName) {
        this.femaleName = femaleName;
    }

    @Override
    public String toString() {
        return "Baby{" +
                "rank=" + rank +
                ", mailName='" + mailName + '\'' +
                ", femaleName='" + femaleName + '\'' +
                '}';
    }
}
