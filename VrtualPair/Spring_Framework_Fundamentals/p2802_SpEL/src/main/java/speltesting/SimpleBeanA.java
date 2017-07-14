package speltesting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SimpleBeanA {

    @Value("TEST_NAME")
    private String SimpleValue;

    public String getSimpleValue() {
        return SimpleValue;
    }

    public void setSimpleValue(String simpleValue) {
        SimpleValue = simpleValue;
    }
}
