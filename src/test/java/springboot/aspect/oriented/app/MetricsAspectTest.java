package springboot.aspect.oriented.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import springboot.aspect.oriented.app.business.BusinessObject;
import springboot.aspect.oriented.app.client.apm.APMClient;

import static org.mockito.Mockito.verify;

@SpringBootTest
class MetricsAspectTest {

    @Autowired
    private BusinessObject businessObject;

    @MockBean
    private APMClient apmClient;

    @Test
    void shouldCallAnAspectForMetrics() {
        businessObject.doSomeBusinessOperation();

        verify(apmClient).incrementCount("xxx");
    }
}
