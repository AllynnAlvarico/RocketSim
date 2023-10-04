public class ClockSystem {
    private int tick;
    private int second;
    private int minute;
    private int hour;
    public void setTick(){
        this.tick += 1;
    }
    public void setTime(int second){
        setSecond(second);
        setMinute(second);
        setHour(second);
    }
    public void setSecond(int second){
        this.second = second % 60;
    }
    public void setMinute(int second){
        this.minute = (second / 60) % 60;
    }
    public void setHour(int second) {
        this.hour = second / 3600;
    }
    public int getTick() {
        return this.tick;
    }
    public int getSecond(){
        return this.second;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getHour() {
        return this.hour;
    }
}