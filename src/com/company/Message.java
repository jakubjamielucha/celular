package com.company;

public class Message {

    private String text;
    private String recipient;

    public Message(String text, String recipient){
        this.text = text;
        this.recipient = recipient;
    }

    @Override
    public String toString() {
        return   "Recipient: " + recipient + "  text: " + text;
    }
}
