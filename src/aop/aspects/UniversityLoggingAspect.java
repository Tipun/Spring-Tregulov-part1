package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvise(){
//        System.out.println("beforeGetStudentsLoggingAdvise: логируем получение списка студентов перед методом" +
//                " getStudents");
//    }
//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsLoggingAdvise(List<Student>students){
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvrGrade();
//        avgGrade = avgGrade + 1;
//        firstStudent.setAvrGrade(avgGrade);
//
//        System.out.println("beforeGetStudentsLoggingAdvise: логируем получение списка студентов после работы метода" +
//                " getStudents");
//
//    }
//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvise(Throwable exception){
//        System.out.println("afterThrowingGetStudentsLoggingAdvise: логируем выброс исключения" );
//    }
    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice : логируем нормальное окончание работы метода или" +
                " выброс исключения");
    }


}
