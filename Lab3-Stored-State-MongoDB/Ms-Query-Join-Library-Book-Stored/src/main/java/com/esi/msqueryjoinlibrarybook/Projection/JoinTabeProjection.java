package com.esi.msqueryjoinlibrarybook.Projection;

import com.esi.msqueryjoinlibrarybook.Document.JoinTable;
import com.esi.msqueryjoinlibrarybook.Repo.JointableRepository;
import com.example.coreapi.events.BookAddedEvent;
import com.example.coreapi.events.BookRemovedEvent;
import com.example.coreapi.events.LibraryCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class JoinTabeProjection {

    public final JointableRepository  jointableRepository;

    @EventHandler
    public void  AddLibrary(LibraryCreatedEvent event)
    {
        JoinTable join=new JoinTable(event.getLibraryId(),event.getName(),0);
        jointableRepository.save(join);
    }
    @EventHandler
    public void addBook(BookAddedEvent event){

        JoinTable join=jointableRepository.findById(event.getLibraryId()).get();
        join.setNbBooks(join.getNbBooks()+1);
        jointableRepository.save(join);
    }

    @EventHandler
    public void removebook(BookRemovedEvent event) {
        JoinTable join=jointableRepository.findById(event.getLibraryId()).get();
        join.setNbBooks(join.getNbBooks()-1);
        jointableRepository.save(join);
    }


}
