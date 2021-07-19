package net.reappay.pg.payments.paymentsback.entity;

import lombok.Data;

@Data
public class TbTranCardPg {

    private String tableNm;
    private String tranSeq;
    private String massageType;
    private String cardNum;
    private String appDt;
    private String appTm;
    private String appNo;
    private String totAmt;
    private String pgSeq;
    private String payChnCate;
    private String tid;
    private String pgTid;
    private String wcc;
    private String cardCate;
    private String orderSeq;
    private String tranDt;
    private String tranTm;
    private String tranCate;
    private String taxAmt;
    private String svcAmt;
    private String currency;
    private String issCd;
    private String issNm;
    private String merchNo;
    private String orgMerchNo;
    private String resultCd;
    private String resultMsg;
    private String orgAppDd;
    private String orgAppNo;
    private String cnclReason;
    private String tranStatus;
    private String resultStatus;
    private String tranStep;
    private String cnclDt;
    private String pgTidPayAmt;
    private String pgTidCommision;
    private String pgTidVat;
    private String clientIp;
    private String userType;
    private String membUserNo;
    private String userNo;
    private String userId;
    private String userNm;
    private String userMail;
    private String userPhone1;
    private String userAddr;
    private String productType;
    private String productNm;
    private String tradChkFlag;
    private String accChkFlag;
    private String insDt;
    private String modDt;
    private String insUser;
    private String modUser;
    private String orgPgSeq;
    private String pgMerchNo;
    private String buyerId;
    private String buyerNo;
    private String buyerNm;
    private String buyerEmail;
    private String buyerTel;
    private String buyerAddr;
    private String installment;
    private String filter;
}
