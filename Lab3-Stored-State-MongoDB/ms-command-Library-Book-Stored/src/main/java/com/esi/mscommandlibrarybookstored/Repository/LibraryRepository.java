package com.esi.mscommandlibrarybookstored.Repository;

import com.esi.mscommandlibrarybookstored.Aggregate.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, String> {
}
