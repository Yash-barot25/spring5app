package com.company.yash.spring5app.bootstrap;

import com.company.yash.spring5app.model.Author;
import com.company.yash.spring5app.model.Book;
import com.company.yash.spring5app.model.Publisher;
import com.company.yash.spring5app.repositories.AuthorRepository;
import com.company.yash.spring5app.repositories.BookRepository;
import com.company.yash.spring5app.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;
    private PublisherRepository publisherRepository;

    public DevBootStrap(BookRepository bookRepository, AuthorRepository authorRepository, PublisherRepository publisherRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        intiMethod();
    }

    private void intiMethod() {


        Author author1 = new Author("yash", "barot");
        Publisher publisher1 = new Publisher();
        publisher1.setName("me");
        publisher1.setAddress("430 mcmurchy ave south");
        Book book1 = new Book("java", "852456", publisher1);

        author1.getBooks().add(book1);
        book1.getAuthors().add(author1);

        publisherRepository.save(publisher1);
        authorRepository.save(author1);
        bookRepository.save(book1);

        Author author2 = new Author("gabbaru", "javan");
        Publisher publisher2 = new Publisher();
        publisher2.setName("me2");
        publisher2.setAddress("1111,430 mcmurchy ave south");
        Book book2 = new Book("python", "123456", publisher2);

        author2.getBooks().add(book2);
        book2.getAuthors().add(author2);

        publisherRepository.save(publisher2);
        authorRepository.save(author2);
        bookRepository.save(book2);


    }
}
