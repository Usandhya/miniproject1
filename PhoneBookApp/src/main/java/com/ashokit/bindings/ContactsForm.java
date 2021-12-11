package com.ashokit.bindings;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ContactsForm {
	private Integer contactId;
	private String contactName;
	private String contactEmail;
	private Long contactPhoneno;
	private LocalDate createdDate;
	private LocalDate updatedDate;
	private String activesw;
}