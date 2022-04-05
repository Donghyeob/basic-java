package accessmodifier;

public class AccessModifierExam {
    private int hour; // 외부에서 접근이 불가능
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        if (hour < 0 || hour > 23) return;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) return;
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        if (second < 0 || second > 59) return;
        this.second = second;
    }
}