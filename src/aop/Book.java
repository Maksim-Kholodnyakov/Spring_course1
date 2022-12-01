package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Книга1")
    private String name;
    @Value("Ф.М. Достоевский")
    private String author;

    public String getAuthor() {
        return author;
    }

    public String getYearsOfPublication() {
        return yearsOfPublication;
    }

    @Value("1866")
    private String yearsOfPublication;
    public String getName() {
        return name;
    }
}
