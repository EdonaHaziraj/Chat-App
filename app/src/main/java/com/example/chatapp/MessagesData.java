package com.example.chatapp;

public class MessagesData {
    String heading, messages;
    public MessagesData(String head, String mess) {
        heading = head;
        messages = mess;
    }

    public String getHeading() {
        return heading;
    }

    public String getMessages() {
        return messages;
    }
}
