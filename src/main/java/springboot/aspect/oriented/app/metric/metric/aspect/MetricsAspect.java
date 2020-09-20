package springboot.aspect.oriented.app.metric.metric.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MetricsAspect {

    @Around("@annotation(springboot.aspect.oriented.app.metric.IncrementCountMetric)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("This concern is being called");
        return joinPoint.proceed();
    }
}