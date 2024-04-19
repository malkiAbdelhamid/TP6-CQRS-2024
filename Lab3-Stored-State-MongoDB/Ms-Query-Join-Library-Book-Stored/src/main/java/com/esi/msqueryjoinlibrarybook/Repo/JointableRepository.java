package com.esi.msqueryjoinlibrarybook.Repo;

import com.esi.msqueryjoinlibrarybook.Document.JoinTable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JointableRepository extends MongoRepository<JoinTable,String> {
}
