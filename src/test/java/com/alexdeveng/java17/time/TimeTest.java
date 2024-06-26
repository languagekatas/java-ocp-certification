package com.alexdeveng.java17.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import org.junit.jupiter.api.Test;

class TimeTest {

    @Test
    void x() {
        LocalDate localDate = LocalDate.now(ZoneId.systemDefault());
        LocalDateTime localDateTime = LocalDateTime.now();
        Duration duration = Duration.between(localDateTime, localDateTime.plus(Duration.ofHours(1)));
    }
}
