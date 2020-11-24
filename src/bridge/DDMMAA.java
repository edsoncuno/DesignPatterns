package bridge;

import java.time.LocalDateTime;

public class DDMMAA implements Date {

    private LocalDateTime objLocalDateTime;

    @Override
    public String today() {
        objLocalDateTime = LocalDateTime.now();
        return String.valueOf(this.objLocalDateTime.getDayOfMonth()) + "-" + this.objLocalDateTime.getMonthValue() + "-"
                + this.objLocalDateTime.getYear();
    }

    @Override
    public String tomorrow() {
        objLocalDateTime = LocalDateTime.now().plusDays(1L);
        return String.valueOf(this.objLocalDateTime.getDayOfMonth()) + "-" + this.objLocalDateTime.getMonthValue() + "-"
                + this.objLocalDateTime.getYear();
    }

    @Override
    public String yesterday() {
        objLocalDateTime = LocalDateTime.now().plusDays(-1L);
        return String.valueOf(this.objLocalDateTime.getDayOfMonth()) + "-" + this.objLocalDateTime.getMonthValue() + "-"
                + this.objLocalDateTime.getYear();
    }

}
