package springboot.aspect.oriented.app.business.metric.metric.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import springboot.aspect.oriented.app.client.apm.APMClient;

@Aspect
@Component
public class MetricsAspect {

    private final APMClient client;

    public MetricsAspect(APMClient client) {
        this.client = client;
    }

    @Around("@annotation(springboot.aspect.oriented.app.business.metric.IncrementCountMetric)")
    public Object incrementCount(ProceedingJoinPoint joinPoint) throws Throwable {
        client.incrementCount("xxx");
        return joinPoint.proceed();
    }
}