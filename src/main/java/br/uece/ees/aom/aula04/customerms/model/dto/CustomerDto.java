package br.uece.ees.aom.aula04.customerms.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerDto {

	private Long id;
	
	@JsonProperty("nome")
	private String name;
	@JsonProperty("idade")
	private Integer age;
	@JsonProperty("email")
	private String email;
	@JsonProperty("ativo")
	private Boolean active;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
}
