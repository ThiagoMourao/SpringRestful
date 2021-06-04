package com.thiagomourao.exercising.praticSpringMongoDB.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.thiagomourao.exercising.praticSpringMongoDB.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
