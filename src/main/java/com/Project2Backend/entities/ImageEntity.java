package com.Project2Backend.entities;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;



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
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "image_id")
	private int imageId = 0;
	@Column(name="content_type")
	private String contentType;
	@Column(name="image_size")
	private long size;
	@Column(name="image_name")
	private String name;
	@Lob
	@Column(name="image")
	private byte[] image;	
}