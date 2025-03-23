package com.airport;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = AirportManagementApplication.class) // ✅ Ensure it points to the correct main class
class AirportManagementApplicationTests {

    @Test
    void contextLoads() {
    }
}
