package com.example.faacassessmenttest.dao;

import com.example.faacassessmenttest.model.User;
import com.example.faacassessmenttest.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
class UserTest {

    @Autowired
    private UserRepository userRepository;

    private User user;

    @BeforeEach
    public void setUp() {
        userRepository.deleteAll();

        user = new User();
        user.setUsername("Prova1");
        userRepository.save(user);
    }

    @Test
    public void whenFindByUsername_shouldReturnUserWithGivenUsername() {
        User retrievedUser = userRepository.findByUsername(user.getUsername());

        assertNotNull(retrievedUser);
        assertEquals(user.getUsername(), retrievedUser.getUsername());
    }
}
