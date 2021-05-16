package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {

    private Egg6 еgg;

    @Autowired
    public void setEgg(Egg6 еgg) {
        this.еgg = еgg;
    }

    @Override
    public String toString() {
        return ", в утке яйцо " + еgg.toString();
    }
}
