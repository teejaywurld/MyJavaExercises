package chapterFour;

public class Time {
    private int hour;
    private int minute;
    private int seconds;

    public Time(int hour, int minute, int seconds) {
        validate (hour, minute, seconds);

        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    private void validate(int hour, int minute, int seconds) {
        validateHour(hour);
        validateMinute(minute);
        validateSeconds(seconds);
    }

    private void validateSeconds(int seconds) {
        boolean secondsIsNotValid = seconds < 0 || seconds > 59;
        if(secondsIsNotValid) throw new IllegalArgumentException("Seconds is not valid");
    }

    private void validateMinute(int minute) {
        boolean minutesIsNotValid = minute < 0 || minute > 59;
        if(minutesIsNotValid) throw new IllegalArgumentException("Minutes is not valid");
    }

    private void validateHour(int hour) {
        boolean hourIsNotValid = hour < 0 || hour > 23;
        if(hourIsNotValid) throw new IllegalArgumentException("Hour is not valid");
    }

    //    @Override
    public String toString(){
        return hour+":"+minute+":"+seconds;
    }
}
