package io.github.y_okumura.example.jasper_reports.table_base;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class ExampleTest {
    @Test
    @DisplayName("3+4は8じゃないのでエラー")
    void failure() {
        assertEquals(8, 3 + 4);
    }
}
