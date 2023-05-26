package pract10.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import pract10.components.Junior;
import pract10.components.Middle;
import pract10.components.Senior;
import pract10.interfaces.Programmer;

@Configuration
@Component
public class BeanConfig {
    @Bean("Junior")
    public Programmer junior() {
        return new Junior();
    }

    @Bean("Middle")
    public Programmer middle() {
        return new Middle();
    }

    @Bean("Senior")
    public Programmer senior() {
        return new Senior();
    }
}
