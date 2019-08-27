package org.apache.fineract.portfolio.savings.data;

/*
 *{
  "amount": "string",
  "currency": "AED",
  "type": "billpay",
  "subType": "string",
  "descriptionText": "string",
  "requestDate": "2019-07-18T19:20:40.512Z",
  "requestingOrganisationTransactionReference": "string",
  "oneTimeCode": "string",
  "geoCode": "string",
  "debitParty": [
    {
      "key": "string",
      "value": "string"
    }
  ],
  "creditParty": [
    {
      "key": "string",
      "value": "string"
    }
  ],
  "senderKyc": {
    "nationality": "AD",
    "dateOfBirth": "string",
    "occupation": "string",
    "employerName": "string",
    "contactPhone": "string",
    "gender": "m",
    "idDocument": [
      {
        "idType": "passport",
        "idNumber": "string",
        "issueDate": "string",
        "expiryDate": "string",
        "issuer": "string",
        "issuerPlace": "string",
        "issuerCountry": "AD",
        "otherIdDescription": "string"
      }
    ],
    "postalAddress": {
      "addressLine1": "string",
      "addressLine2": "string",
      "addressLine3": "string",
      "city": "string",
      "stateProvince": "string",
      "postalCode": "string",
      "country": "AD"
    },
    "subjectName": {
      "title": "string",
      "firstName": "string",
      "middleName": "string",
      "lastName": "string",
      "fullName": "string",
      "nativeName": "string"
    },
    "emailAddress": "string",
    "birthCountry": "AD"
  },
  "recipientKyc": {
    "nationality": "AD",
    "dateOfBirth": "string",
    "occupation": "string",
    "employerName": "string",
    "contactPhone": "string",
    "gender": "m",
    "idDocument": [
      {
        "idType": "passport",
        "idNumber": "string",
        "issueDate": "string",
        "expiryDate": "string",
        "issuer": "string",
        "issuerPlace": "string",
        "issuerCountry": "AD",
        "otherIdDescription": "string"
      }
    ],
    "postalAddress": {
      "addressLine1": "string",
      "addressLine2": "string",
      "addressLine3": "string",
      "city": "string",
      "stateProvince": "string",
      "postalCode": "string",
      "country": "AD"
    },
    "subjectName": {
      "title": "string",
      "firstName": "string",
      "middleName": "string",
      "lastName": "string",
      "fullName": "string",
      "nativeName": "string"
    },
    "emailAddress": "string",
    "birthCountry": "AD"
  },
  "originalTransactionReference": "string",
  "servicingIdentity": "string",
  "requestingLei": "string",
  "receivingLei": "string",
  "metadata": [
    {
      "key": "string",
      "value": "string"
    }
  ],
  "transactionStatus": "string",
  "creationDate": "2019-07-18T19:20:40.512Z",
  "modificationDate": "2019-07-18T19:20:40.513Z",
  "transactionReference": "string",
  "transactionReceipt": "string",
  "internationalTransferInformation": {
    "originCountry": "AD",
    "quotationReference": "string",
    "quoteId": "string",
    "receivingCountry": "AD",
    "remittancePurpose": "string",
    "relationshipSender": "string",
    "deliveryMethod": "directtoaccount",
    "senderBlockingReason": "string",
    "recipientBlockingReason": "string"
  }
}
 *
 */

import java.util.Arrays;

public class PaymentHubTransactionDTO {

    String amount;
    String currency;
    /*String currency {

        AED, AFN, ALL, AMD, ANG, AOA, ARS, AUD, AWG, AZN, BAM, BBD, BDT, BGN, BHD, BIF, BMD, BND, BOB, BOV, BRL, BSD,
        BTN, BWP, BYR, BZD, CAD, CDF, CHE, CHF, CHW, CLF, CLP, CNY, COP, COU, CRC, CUC, CUP, CVE, CZK, DJF, DKK, DOP,
        DZD, EGP, ERN, ETB, EUR, FJD, FKP, GBP, GEL, GHS, GIP, GMD, GNF, GTQ, GYD, HKD, HNL, HRK, HTG, HUF, IDR, ILS,
        INR, IQD, IRR, ISK, JMD, JOD, JPY, KES, KGS, KHR, KMF, KPW, KRW, KWD, KYD, KZT, LAK, LBP, LKR, LRD, LSL, LYD,
        MAD, MDL, MGA, MKD, MMK, MNT, MOP, MRO, MUR, MVR, MWK, MXN, MXV, MYR, MZN, NAD, NGN, NIO, NOK, NPR, NZD, OMR,
        PAB, PEN, PGK, PHP, PKR, PLN, PYG, QAR, RON, RSD, RUB, RWF, SAR, SBD, SCR, SDG, SEK, SGD, SHP, SLL, SOS, SRD,
        SSP, STD, SVC, SYP, SZL, THB, TJS, TMT, TND, TOP, TRY, TTD, TWD, TZS, UAH, UGX, USD, USN, UYI, UYU, UZS, VEF,
        VND, VUV, WST, XAF, XAG, XAU, XBA, XBB, XBC, XBD, XCD, XDR, XOF, XPD, XPF, XPT, XSU, XTS, XUA, XXX, YER, ZAR,
        ZMW, ZWL;
    }*/
    String type;
    String subType;
    String descriptionText;
    String date;
    String requestingOrganisationTransactionReference;
    String oneTimeCode;
    String geoCode;

    PaymentHubParty[] debitParty;
    PaymentHubParty[] creditParty;

    PaymentHubKyc senderKyc;
    PaymentHubKyc receiverKyc;

    String originalTransactionReference;

    String servicingIdentity;
    String requestingLei;
    String recievingLei;

    PaymentHubParty[] metadata;

    String transactionStatus;
    String creationDate;
    String modificationDate;
    String transactionReference;
    String transactionReceipt;

    PaymentHubInternationalTransferInformation internationalTransferInformation;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getDescriptionText() {
        return descriptionText;
    }

    public void setDescriptionText(String descriptionText) {
        this.descriptionText = descriptionText;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRequestingOrganisationTransactionReference() {
        return requestingOrganisationTransactionReference;
    }

    public void setRequestingOrganisationTransactionReference(String requestingOrganisationTransactionReference) {
        this.requestingOrganisationTransactionReference = requestingOrganisationTransactionReference;
    }

    public String getOneTimeCode() {
        return oneTimeCode;
    }

    public void setOneTimeCode(String oneTimeCode) {
        this.oneTimeCode = oneTimeCode;
    }

    public String getGeoCode() {
        return geoCode;
    }

    public void setGeoCode(String geoCode) {
        this.geoCode = geoCode;
    }

    public PaymentHubKyc getSenderKyc() {
        return senderKyc;
    }

    public void setSenderKyc(PaymentHubKyc senderKyc) {
        this.senderKyc = senderKyc;
    }

    public PaymentHubKyc getReceiverKyc() {
        return receiverKyc;
    }

    public void setReceiverKyc(PaymentHubKyc receiverKyc) {
        this.receiverKyc = receiverKyc;
    }

    public String getOriginalTransactionReference() {
        return originalTransactionReference;
    }

    public void setOriginalTransactionReference(String originalTransactionReference) {
        this.originalTransactionReference = originalTransactionReference;
    }

    public String getServicingIdentity() {
        return servicingIdentity;
    }

    public void setServicingIdentity(String servicingIdentity) {
        this.servicingIdentity = servicingIdentity;
    }

    public String getRequestingLei() {
        return requestingLei;
    }

    public void setRequestingLei(String requestingLei) {
        this.requestingLei = requestingLei;
    }

    public String getRecievingLei() {
        return recievingLei;
    }

    public void setRecievingLei(String recievingLei) {
        this.recievingLei = recievingLei;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(String modificationDate) {
        this.modificationDate = modificationDate;
    }

    public String getTransactionReference() {
        return transactionReference;
    }

    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }

    public String getTransactionReceipt() {
        return transactionReceipt;
    }

    public void setTransactionReceipt(String transactionReceipt) {
        this.transactionReceipt = transactionReceipt;
    }

    public PaymentHubInternationalTransferInformation getInternationalTransferInformation() {
        return internationalTransferInformation;
    }

    public void setInternationalTransferInformation(PaymentHubInternationalTransferInformation internationalTransferInformation) {
        this.internationalTransferInformation = internationalTransferInformation;
    }

    public PaymentHubParty[] getDebitParty() {
        return debitParty;
    }

    public void setDebitParty(PaymentHubParty[] debitParty) {
        this.debitParty = debitParty;
    }

    public PaymentHubParty[] getCreditParty() {
        return creditParty;
    }

    public void setCreditParty(PaymentHubParty[] creditParty) {
        this.creditParty = creditParty;
    }

    public PaymentHubParty[] getMetadata() {
        return metadata;
    }

    public void setMetadata(PaymentHubParty[] metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return "TransactionObject{" +
                "amount='" + amount + '\'' +
                ", currency='" + currency + '\'' +
                ", type='" + type + '\'' +
                ", subType='" + subType + '\'' +
                ", descriptionText='" + descriptionText + '\'' +
                ", date='" + date + '\'' +
                ", requestingOrganisationTransactionReference='" + requestingOrganisationTransactionReference + '\'' +
                ", oneTimeCode='" + oneTimeCode + '\'' +
                ", geoCode='" + geoCode + '\'' +
                ", debitParty=" + Arrays.toString(debitParty) +
                ", creditParty=" + Arrays.toString(creditParty) +
                ", senderKyc=" + senderKyc +
                ", receiverKyc=" + receiverKyc +
                ", originalTransactionReference='" + originalTransactionReference + '\'' +
                ", servicingIdentity='" + servicingIdentity + '\'' +
                ", requestingLei='" + requestingLei + '\'' +
                ", recievingLei='" + recievingLei + '\'' +
                ", metadata=" + Arrays.toString(metadata) +
                ", transactionStatus='" + transactionStatus + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", modificationDate='" + modificationDate + '\'' +
                ", transactionReference='" + transactionReference + '\'' +
                ", transactionReceipt='" + transactionReceipt + '\'' +
                ", internationalTransferInformation=" + internationalTransferInformation +
                '}';
    }
}

