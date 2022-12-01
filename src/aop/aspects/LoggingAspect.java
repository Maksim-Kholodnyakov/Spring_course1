package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUiLibrary() {
//    }
//    @Pointcut("execution(void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {
//    }
//    @Pointcut("allMethodsFromUiLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUiLibrary() {
//    }
//    @Before("allMethodsExceptReturnMagazineFromUiLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice() {
//        System.out.println("Except ReturnMagazine");
//    }


//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {
//    }
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary() {
//    }
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethohdsFromUniLibrary() {
//
//    }
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("BeforeGetLoggingAdvice: writing log #1");
//    }
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("BeforeReturnLoggingAdvice: writing log #2");
//    }
//    @Before("allGetAndReturnMethohdsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("BeforeGetAndReturnLoggingAdvice: writing log #3");
//    }


//    @Pointcut("execution(* get*())")
//    private void allGetMethods() {
//    }

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void  beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("MethodSignature: " + methodSignature);
        System.out.println("MethodSignature.getMethod: " + methodSignature.getMethod());
        System.out.println("MethodSignature.getReturnType: " + methodSignature.getReturnType());
        System.out.println("MethodSignature.getName: " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook"))  {
            Object [] arguments = joinPoint.getArgs();
            for(Object obj:arguments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: " + myBook.getName()
                            + ", Информация о авторе: " + myBook.getAuthor()
                    + ", год издания: " + myBook.getYearsOfPublication());
                }
                else if (obj instanceof String) {
                    System.out.println("Книгу в библиотеку добавляет: " + obj);
                }
            }
        }


        System.out.println("beforeAddLoggingAdvice: попытка взять книгу/журнала");
        System.out.println("------------------------------------------------------");
    }

//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги/журнала");
//    }

//    @Before("execution(public void returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("попытка вернуть книга");
//    }
}
