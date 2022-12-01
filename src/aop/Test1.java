package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
//        uniLibrary.addBook();
//        uniLibrary.returnMagazine();
        uniLibrary.addBook("Max", book);
        uniLibrary.getBook();
        uniLibrary.getMagazine();
//        uniLibrary.getBook();
//        uniLibrary.returnBook();

//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary",SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();

    }
}
