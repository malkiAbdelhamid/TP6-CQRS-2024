package com.esi.mscommandlibrarybookstored.Projection;

import com.esi.mscommandlibrarybookstored.Aggregate.Book;
import com.esi.mscommandlibrarybookstored.Aggregate.Library;
import com.esi.mscommandlibrarybookstored.Repository.BookRepository;
import com.esi.mscommandlibrarybookstored.Repository.LibraryRepository;
import com.example.coreapi.events.BookAddedEvent;
import com.example.coreapi.events.BookRemovedEvent;
import com.example.coreapi.events.LibraryCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LibraryProjection {

    public final LibraryRepository libraryRepository;
    public final BookRepository bookRepository;

    @EventHandler
    public void  AddLibrary(LibraryCreatedEvent event)
    {
        Library library=new Library(event.getLibraryId(), event.getName(), null);
        libraryRepository.save(library);
    }

    @EventHandler
    public void addBook(BookAddedEvent event){
        Library library=libraryRepository.findById(event.getLibraryId()).get();

        bookRepository.save(
                new Book(event.getIsbn(), event.getTitle(),  event.getEditeurId(),library));
    }

    @EventHandler
    public void removebook(BookRemovedEvent event) {

        bookRepository.deleteById(event.getIsbn());
    }
}
