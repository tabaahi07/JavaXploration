package com.example.WebSocket;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

// This is where we create the behavior for the WebSocket.
public class EchoWebSocketHandler extends TextWebSocketHandler{
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        // Get the message sent by the client
        String receivedMessage = message.getPayload();
        // Send a response back to the client
        session.sendMessage(new TextMessage("Echo: " + receivedMessage));
    }
}
