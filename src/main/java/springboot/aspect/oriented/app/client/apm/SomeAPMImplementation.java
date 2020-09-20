package springboot.aspect.oriented.app.client.apm;

import org.springframework.stereotype.Component;

@Component
public class SomeAPMImplementation implements APMClient {

    public void incrementCount(String metric) {
        // call library methods
    }
}
