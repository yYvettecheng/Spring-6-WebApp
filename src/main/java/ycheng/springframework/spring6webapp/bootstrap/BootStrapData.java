/**
 * Created by Yiwen Cheng on 2/19/25
 */

package ycheng.springframework.spring6webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ycheng.springframework.spring6webapp.domain.Author;
import ycheng.springframework.spring6webapp.domain.Book;
import ycheng.springframework.spring6webapp.domain.Publisher;
import ycheng.springframework.spring6webapp.repositories.AuthorRepository;
import ycheng.springframework.spring6webapp.repositories.BookRepository;
import ycheng.springframework.spring6webapp.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123456");

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        Book noEJB = new Book();
        noEJB.setTitle("J2EE Development without EJB");
        noEJB.setIsbn("234567");

        Author rodSaved = authorRepository.save(rod);
        Book noEJBSaved = bookRepository.save(noEJB);

        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);

        Publisher harvard = new Publisher();
        harvard.setPublisherName("Harvard");
        harvard.setAddress("79 Garden Street");
        harvard.setCity("Cambridge");
        harvard.setState("Massachusetts");
        harvard.setZip("02138");

        Publisher harvardSaved = publisherRepository.save(harvard);
        dddSaved.setPublisher(harvardSaved);
        noEJBSaved.setPublisher(harvardSaved);

        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);
        bookRepository.save(dddSaved);
        bookRepository.save(noEJBSaved);

        System.out.println("Author count: " + authorRepository.count());
        System.out.println("Book count: " + bookRepository.count());
        System.out.println("Publisher count: " + publisherRepository.count());
    }
}