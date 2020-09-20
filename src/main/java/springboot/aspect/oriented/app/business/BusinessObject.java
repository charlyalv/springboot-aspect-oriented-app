package springboot.aspect.oriented.app.business;

import org.springframework.stereotype.Component;
import springboot.aspect.oriented.app.metric.IncrementCountMetric;

@Component
public class BusinessObject {

    @IncrementCountMetric
    public void doSomeBusinessOperation() {
        // do something
    }
}
