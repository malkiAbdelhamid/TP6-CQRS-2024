package com.esi.mscommandlibrarybookstored.Aggregate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.EntityId;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Book {
    @Id
    @EntityId
    private String isbn;
    private String title;
    private String editeurId;
    @ManyToOne
    private Library library;

}
