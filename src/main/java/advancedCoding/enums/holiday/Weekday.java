package advancedCoding.enums.holiday;

public enum Weekday {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private final boolean isWeekDay;

    Weekday(boolean isWeekDay) {
        this.isWeekDay = isWeekDay;
    }

    public boolean isWeekDay() {
        return isWeekDay;
//        return this != SATURDAY && this != SUNDAY;
    }

    public boolean isHoliday() {
        return !isWeekDay;
//        return this == SATURDAY || this == SUNDAY;
    }

    public void whichIsGreater(Weekday day) {
        int comparison = this.compareTo(day);
//        if (this.ordinal() < day.ordinal())
        if (comparison < 0) {
            System.out.println(this.name() + " is the predecessor of " + day.name());
        } else if (comparison > 0) {
            System.out.println(this.name() + " is the successor of " + day.name());
        } else {
            System.out.println(this.name() + " and " + day.name() + " are the same day");
        }
    }
}
