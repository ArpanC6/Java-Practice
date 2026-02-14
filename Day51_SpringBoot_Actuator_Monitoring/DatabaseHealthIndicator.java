package com.example.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DatabaseHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {

        boolean databaseUp = true; // assume DB is running

        if (databaseUp) {
            return Health.up()
                    .withDetail("Database", "MySQL is running properly")
                    .withDetail("Status Code", 200)
                    .build();
        } else {
            return Health.down()
                    .withDetail("Database", "MySQL is DOWN")
                    .withDetail("Status Code", 500)
                    .build();
        }
    }
}
