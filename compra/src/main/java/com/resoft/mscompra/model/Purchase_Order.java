package com.resoft.mscompra.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Purchase_Order {
	
	private String name;
	private Long product;
	private BigDecimal price;
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date purchaseDate;
	private String cpfClient;
    private String zipCode;
}
