package com.transapi.transactionapi.services;


import com.transapi.transactionapi.dtos.AccessTokenResponse;
import com.transapi.transactionapi.dtos.RegisterUrlResponse;
import com.transapi.transactionapi.dtos.SimulateTransactionRequest;
import com.transapi.transactionapi.dtos.SimulateTransactionResponse;

public interface TransacApi {

    /**
     * @return Returns Daraja API Access Token Response
     */
    AccessTokenResponse getAccessToken();
    RegisterUrlResponse registerUrl();

    SimulateTransactionResponse simulateC2BTransaction(SimulateTransactionRequest simulateTransactionRequest);
}
