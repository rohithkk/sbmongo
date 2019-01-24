package com.kodakandla.sbmongo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="Todos")
public class Todos {

	@Id
	private ObjectId _id;
	
	private String text;
	private boolean completed;
	private String name;
	private String deadline;
	
	public String get_id() {
		return _id.toHexString();
	}
	
}
