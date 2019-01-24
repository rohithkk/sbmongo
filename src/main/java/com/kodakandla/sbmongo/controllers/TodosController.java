package com.kodakandla.sbmongo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kodakandla.sbmongo.model.Todos;
import com.kodakandla.sbmongo.repository.TodosRepository;

@RestController
@RequestMapping("/todos")
public class TodosController {

	@Autowired
	private TodosRepository repository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Todos> getAllTodos() {
		return repository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Todos getTodoById(@PathVariable("id") ObjectId id) {
		return repository.findBy_id(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void modifyTodoById(@PathVariable("id") ObjectId id, @Valid @RequestBody Todos todo) {
		todo.set_id(id);
		repository.save(todo);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Todos createTodo(@Valid @RequestBody Todos todo) {
		todo.set_id(ObjectId.get());
		repository.save(todo);
		return todo;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteTodo(@PathVariable ObjectId id) {
		repository.delete(repository.findBy_id(id));
	}
}
