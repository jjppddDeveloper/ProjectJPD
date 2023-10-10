package com.example.sampleapi.entity;

import java.time.LocalDateTime;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

public class Todo {

	// タスクID
	private int id;

	// タスク
	@NotEmpty
	@Max(200)
	private String todo;

	// 概要
	@NotEmpty
	@Max(200)
	private String description;

	// 期限
	@NotEmpty
	@Max(200)
	private LocalDateTime period;

	// Setter & Getter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getPeriod() {
		return period;
	}

	public void setPeriod(LocalDateTime limit) {
		this.period = period;
	}

}
