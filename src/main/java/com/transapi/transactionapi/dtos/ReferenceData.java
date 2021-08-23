package com.transapi.transactionapi.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ReferenceData{

	@JsonProperty("ReferenceItem")
	private com.transapi.transactionapi.dtos.ReferenceItem referenceItem;
}