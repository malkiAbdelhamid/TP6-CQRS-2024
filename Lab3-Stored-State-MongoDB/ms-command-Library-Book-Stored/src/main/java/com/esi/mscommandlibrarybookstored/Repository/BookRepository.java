package com.esi.mscommandlibrarybookstored.Repository;

import com.esi.mscommandlibrarybookstored.Aggregate.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}
