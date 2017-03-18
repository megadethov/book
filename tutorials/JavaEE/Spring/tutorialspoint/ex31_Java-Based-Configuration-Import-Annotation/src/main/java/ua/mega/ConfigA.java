package ua.mega;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ConfigB.class)
public class ConfigA {

    @Bean
    public A a() {
        return new A();
    }
}
