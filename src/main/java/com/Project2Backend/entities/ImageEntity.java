package com.Project2Backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.core.io.ByteArrayResource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//using a many to many table atm, needs conversion with for @manytomany annotations later
@Table(name="images")
public class ImageEntity {
	@Id
	@Column(name = "image_id")
	private int imageId = 0;
	@Column(name="employee_id")
	private int employeeId = 0;
	@Column(name="image")
	private Byte[] image = null;	
}