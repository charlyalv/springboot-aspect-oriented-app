package springboot.aspect.oriented.app.business;

import org.springframework.stereotype.Component;
import springboot.aspect.oriented.app.business.metric.IncrementCountMetric;

import static springboot.aspect.oriented.app.business.metric.Metrics.EXAMPLE;

@Component
public class BusinessObject {

    @IncrementCountMetric(metricName = EXAMPLE)
    public void doSomeBusinessOperation() {
        // do something
    }
}
