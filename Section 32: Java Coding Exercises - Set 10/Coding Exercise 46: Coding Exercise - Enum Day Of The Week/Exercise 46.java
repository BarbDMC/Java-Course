enum DaysOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private String name;

    DaysOfWeek(String name) {
        this.name = name;
    }

    public String getName() {
        // Write your code here to return the name of the day
        return name;
    }

    public boolean isWeekday() {
        // Write your code here to check if this day is a weekday
        switch(this) {
            case SATURDAY:
                return false;
             case SUNDAY:
                return false;
            default:
                return true;
        }
    }

    public boolean isHoliday() {
        // Write your code here to check if this day is a holiday
          switch(this) {
            case SATURDAY:
                return true;
             case SUNDAY:
                return true;
            default:
                return false;
        }
    }
}