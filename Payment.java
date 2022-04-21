package com.company;

public class Payment {

    private String cardNumber;
    private boolean isSuccessfullyPurchased;


    public Payment(String cardNumber, boolean isSuccessfullyPurchased) {
        this.cardNumber = cardNumber;
        this.isSuccessfullyPurchased = isSuccessfullyPurchased;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public boolean isSuccessfullyPurchased() {
        return isSuccessfullyPurchased;
    }

    public void setSuccessfullyPurchased(boolean successfullyPurchased) {
        isSuccessfullyPurchased = successfullyPurchased;
    }
}
