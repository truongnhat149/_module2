package java_exercise_youtube.ManagerComputer;

public class Issue {
    private int date, month, year;

    public Issue(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public Issue(){}

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Issue{" +
                "date=" + date +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
