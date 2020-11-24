package bridge;

import java.time.LocalDateTime;

public class Unix implements Date {

    LocalDateTime objLocalDateTime;
    
    @Override
    public String today() {
        this.objLocalDateTime = LocalDateTime.now();
        return String.valueOf(this.objLocalDateTime.getYear()) + "-" + this.objLocalDateTime.getMonthValue() + "-" + this.objLocalDateTime.getDayOfMonth() + "T" + this.objLocalDateTime.getHour() + ":" + this.objLocalDateTime.getMinute() + ":" + this.objLocalDateTime.getSecond() + "Z";
    }
    
    @Override
    public String tomorrow() {
        this.objLocalDateTime = LocalDateTime.now().plusDays(1L);
        return String.valueOf(this.objLocalDateTime.getYear()) + "-" + this.objLocalDateTime.getMonthValue() + "-" + this.objLocalDateTime.getDayOfMonth() + "T" + this.objLocalDateTime.getHour() + ":" + this.objLocalDateTime.getMinute() + ":" + this.objLocalDateTime.getSecond() + "Z";
    }
    
    @Override
    public String yesterday() {
        this.objLocalDateTime = LocalDateTime.now().plusDays(-1L);
        return String.valueOf(this.objLocalDateTime.getYear()) + "-" + this.objLocalDateTime.getMonthValue() + "-" + this.objLocalDateTime.getDayOfMonth() + "T" + this.objLocalDateTime.getHour() + ":" + this.objLocalDateTime.getMinute() + ":" + this.objLocalDateTime.getSecond() + "Z";
    }
    
}

