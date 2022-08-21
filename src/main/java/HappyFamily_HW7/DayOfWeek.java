package HappyFamily_HW7;

public enum DayOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    public final String label;

    DayOfWeek(String label) {
        this.label = label;
    }
}
