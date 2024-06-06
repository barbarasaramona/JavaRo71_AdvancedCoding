package advancedCoding.enums.holiday;

public class Main {
    public static void main(String[] args) {
        Weekday today = Weekday.WEDNESDAY;
        Weekday anotherDay = Weekday.FRIDAY;

        System.out.println(today.name() + " is a weekday: " + today.isWeekDay());
        System.out.println(today.name() + " is a holiday: " + today.isHoliday());

        System.out.println(anotherDay.name() + " is a weekday: " + anotherDay.isWeekDay());
        System.out.println(anotherDay.name() + " is a holiday: " + anotherDay.isHoliday());

        today.whichIsGreater(anotherDay);
        anotherDay.whichIsGreater(today);
    }
}
