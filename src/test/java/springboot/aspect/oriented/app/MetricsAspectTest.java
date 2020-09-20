package springboot.aspect.oriented.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springboot.aspect.oriented.app.business.BusinessObject;

@SpringBootTest
class MetricsAspectTest {

    @Autowired
    private BusinessObject businessObject;

    @Test
    void shouldCallAnAspectForMetrics() {
        businessObject.doSomeBusinessOperation();
    }
}
