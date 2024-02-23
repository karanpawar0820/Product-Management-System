package com.cts.web.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {
	@Id
	@Column(name = "Email")
	private String email;
	@Column(name = "Password")
	private String password;

}
