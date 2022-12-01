package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before("execution(* getStudents())")
    public void beforeGetUniversityLoggingAdvice() {
        System.out.println("beforeGetUniversityLoggingAdvice логгируем получение"
                + "списка студентов перед методом getStudents");

    }

//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetUniversityLoggingAdvice(List<Student> students) {
//
//        Student firstStudent = students.get(0);
//
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterReturningGetUniversityLoggingAdvice логгируем получение"
//                + "списка студентов перед методом getStudents");
//    }

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    public void afterThrowingGetStudentLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingGetStudentLoggingAdvice: Логгируем выброс исключения " + exception);
    }
}
