package bridge;

import java.time.LocalDateTime;

public class BigEndian implements Date {

    private LocalDateTime objLocalDateTime;

    @Override
    public String today() {
        objLocalDateTime = LocalDateTime.now();
        return String.valueOf(this.objLocalDateTime.getYear()) + "-" + this.objLocalDateTime.getMonthValue() + "-"
                + this.objLocalDateTime.getDayOfMonth();
    }

    @Override
    public String tomorrow() {
        objLocalDateTime = LocalDateTime.now().plusDays(1L);
        return String.valueOf(this.objLocalDateTime.getYear()) + "-" + this.objLocalDateTime.getMonthValue() + "-"
                + this.objLocalDateTime.getDayOfMonth();
    }

    @Override
    public String yesterday() {
        objLocalDateTime = LocalDateTime.now().plusDays(-1L);
        return String.valueOf(this.objLocalDateTime.getYear()) + "-" + this.objLocalDateTime.getMonthValue() + "-"
                + this.objLocalDateTime.getDayOfMonth();
    }

}