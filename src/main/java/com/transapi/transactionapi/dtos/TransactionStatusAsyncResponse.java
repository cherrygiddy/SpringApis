package com.transapi.transactionapi.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TransactionStatusAsyncResponse{

	@JsonProperty("Result")
	private Result result;
}