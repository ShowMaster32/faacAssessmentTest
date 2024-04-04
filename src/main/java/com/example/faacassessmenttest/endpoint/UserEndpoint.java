package com.example.faacassessmenttest.endpoint;

import com.example.faacassessmenttest.model.User;
import com.example.faacassessmenttest.repository.UserRepository;
import com.example.faacassessmenttest.request.UserRequest;
import com.example.faacassessmenttest.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {

    @Autowired
    UserRepository userRepository;

    private static final String NAMESPACE_URI = "https://localhost:8080/users";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UserRequest")
    @ResponsePayload
    public UserResponse getUser(@RequestPayload UserRequest request) {
        UserResponse response = new UserResponse();

        String username = request.getUsername();
        if (userRepository.existsByUsername(username)) {
            User user = userRepository.findByUsername(username);

            if ("admin".equalsIgnoreCase(user.getUsername())) {
                response.setMessage("Benvenuto, AMMINISTRATORE " + username + "!");
            } else {
                response.setMessage("Benvenuto, " + username + "!");
            }
        } else {
            response.setMessage("L'utente deve ancora effettuare l'accesso.");
        }

        return response;
    }
}