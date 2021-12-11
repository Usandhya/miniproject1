package com.ashokit.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerators;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.Generated;
import lombok.Getter;
@Entity
@Table(name="CONTACTS_DETAILS")
@Data
public class Contacts {
	@Id
	@GeneratedValue
	@Column(name="CONTACT_ID")
	private Integer contactId;
	@Column(name="CONTACT_NAME")
	private String contactName;
	@Column(name="CONTACT_PHONENO")
	private long contactPhoneno;
	@Column(name="CONTACT_EMAIL")
	private String contactEmail;
	@Column(name="ACTIVESW")
	private String activesw;
	@CreationTimestamp
	@Column(name="CREATEDDATE")
	private LocalDate createdDate;
	@UpdateTimestamp
	@Column(name="UPDATEDDATE")
	private LocalDate updatedDate;

}
