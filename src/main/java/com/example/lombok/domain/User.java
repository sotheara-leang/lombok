package com.example.lombok.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = "id")
public class User {

	private Long id;
	private String lastName;
	private String firstName;
}
