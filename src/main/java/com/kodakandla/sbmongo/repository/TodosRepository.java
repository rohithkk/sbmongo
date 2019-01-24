package com.kodakandla.sbmongo.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.kodakandla.sbmongo.model.Todos;

public interface TodosRepository extends MongoRepository<Todos, String>{

	Todos findBy_id(ObjectId _id);
}
