public class TimeConverter {
    public static int convertHoursToMinutes(int hours) {
        // Your task: complete this method
        return hours >= 0 ? hours * 60 : -1;
    }
    
    public static int convertDaysToMinutes(int days) {
        // Your task: complete this method
        return days >= 0 ?  days * 1440 : -1;
    }
}