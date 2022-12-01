package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(String aop.UniLibrary.returnBook())")
    public Object aroundReturnBookLoggingAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAspect в библиотеку пытается вернуть книгу");
        Object targetMethodresult = proceedingJoinPoint.proceed();
        System.out.println("aroundReturnBookLoggingAspect в библиотеку возвращают книгу");
        return targetMethodresult;
    }
}
