package springboot.aspect.oriented.app.business.metric.metric.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import springboot.aspect.oriented.app.business.metric.IncrementCountMetric;
import springboot.aspect.oriented.app.client.apm.APMClient;

@Aspect
@Component
public class MetricsAspect {

    private final APMClient client;

    public MetricsAspect(APMClient client) {
        this.client = client;
    }

    @Around("@annotation(incrementCountMetric)")
    public Object incrementCount(ProceedingJoinPoint joinPoint,
                                 IncrementCountMetric incrementCountMetric) throws Throwable {

        final Object proceed = joinPoint.proceed();
        client.incrementCount(incrementCountMetric.metricName());
        return proceed;
    }
}