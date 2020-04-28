package chapter1.section2;

public class Date implements Comparable<Date> {
    private final int month;
    private final int day;
    private final int year;

    /**
     * a Date constructor by specifying month, day and year
     * WARNING: no legal check here
     *
     * @param month
     * @param day
     * @param year
     */
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int month() {
        return month;
    }

    public int day() {
        return day;
    }

    public int year() {
        return year;
    }

    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }

    public int compareTo(Date o) {
        if (this.year > o.year) return 1;
        else if (this.year < o.year) return -1;
        else {
            if (this.month > o.month) return 1;
            else if (this.month < o.month) return -1;
            else {
                if (this.day > o.day) return 1;
                else if (this.day < o.day) return -1;
                else return 0;
            }
        }
    }
}
