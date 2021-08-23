package com.transapi.transactionapi.services;


import com.transapi.transactionapi.dtos.*;

public interface TransacApi {

    /**
     * @return Returns Daraja API Access Token Response
     */
    AccessTokenResponse getAccessToken();

    RegisterUrlResponse registerUrl();

    SimulateTransactionResponse simulateC2BTransaction(SimulateTransactionRequest simulateTransactionRequest);

    B2CTransactionSyncResponse performB2CTransaction(InternalB2CTransactionRequest internalB2CTransactionRequest);

}
