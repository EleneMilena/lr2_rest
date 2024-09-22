package ru.arkhipov.MySecondTestAppSpringBoot.model;

import lombok.Builder;
import lombok.Data;


@Data
@Builder

public class Response {

    private String uid;
    private String operationUid;
    private String systemName;
    private String systemTime;
    private String source;
    private String code;
    private String errorCode;
    private String errorMessage;
    private int conmunicationId;
    private int templateld;
    private int productCode;
    private int smsCode;
}



