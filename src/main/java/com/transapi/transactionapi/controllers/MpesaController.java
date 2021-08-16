package com.transapi.transactionapi.controllers;


import com.transapi.transactionapi.dtos.*;
import com.transapi.transactionapi.services.TransacApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("transact")
public class MpesaController {

    private final TransacApi transacApi;
    private final AcknowledgeResponse acknowledgeResponse;

    public MpesaController(TransacApi transacApi, AcknowledgeResponse acknowledgeResponse) {
        this.transacApi = transacApi;

        this.acknowledgeResponse = acknowledgeResponse;
    }

    @GetMapping(path = "/token", produces = "application/json")
    public ResponseEntity<AccessTokenResponse> getAccessToken() {
        return ResponseEntity.ok(transacApi.getAccessToken());
    }

    @PostMapping(path = "/register-url", produces = "application/json")
    public ResponseEntity<RegisterUrlResponse> registerUrl() {

        return ResponseEntity.ok(transacApi.registerUrl());
    }

    @PostMapping(path = "/validation", produces = "application/json")
    public ResponseEntity<AcknowledgeResponse> mpesaValidation(@RequestBody MpesaValidationResponse mpesaValidationResponse) {
        return ResponseEntity.ok(acknowledgeResponse);
    }

    @PostMapping(path = "/simulate-c2b", produces = "application/json")
    public ResponseEntity<SimulateTransactionResponse> simulateB2CTransaction(@RequestBody SimulateTransactionRequest simulateTransactionRequest) {
        return ResponseEntity.ok(transacApi.simulateC2BTransaction(simulateTransactionRequest));
    }
}
