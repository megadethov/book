package speltesting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SimpleBeanB {

    @Value("#{simpleBeanA.SimpleValue}")
    private String SimpleValue;

    @Value("#{(T(java.lang.Math).random()*10) + 1}")
    private int random;

    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
    }

    public String getSimpleValue() {
        return SimpleValue;
    }

    public void setSimpleValue(String simpleValue) {
        SimpleValue = simpleValue;
    }
}
