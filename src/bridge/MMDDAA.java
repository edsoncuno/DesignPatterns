package bridge;

import java.time.LocalDateTime;

public class MMDDAA implements Date {

    private LocalDateTime objLocalDateTime;

    @Override
    public String today() {
        this.objLocalDateTime = LocalDateTime.now();
        return String.valueOf(this.objLocalDateTime.getMonthValue()) + "-" + this.objLocalDateTime.getDayOfMonth() + "-"
                + this.objLocalDateTime.getYear();
    }

    @Override
    public String tomorrow() {
        this.objLocalDateTime = LocalDateTime.now().plusDays(1L);
        return String.valueOf(this.objLocalDateTime.getMonthValue()) + "-" + this.objLocalDateTime.getDayOfMonth() + "-"
                + this.objLocalDateTime.getYear();
    }

    @Override
    public String yesterday() {
        this.objLocalDateTime = LocalDateTime.now().plusDays(-1L);
        return String.valueOf(this.objLocalDateTime.getMonthValue()) + "-" + this.objLocalDateTime.getDayOfMonth() + "-"
                + this.objLocalDateTime.getYear();
    }

}