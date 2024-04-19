package com.esi.msqueryjoinlibrarybook.Document;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data @AllArgsConstructor @NoArgsConstructor
public class JoinTable {

    @Id
    private String libraryId;
    private String name;
    private int nbBooks;
}
