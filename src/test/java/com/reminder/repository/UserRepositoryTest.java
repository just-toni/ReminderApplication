package com.reminder.repository;

import com.reminder.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    void registerUser(){
        User user1 = new User("tasha", "tasha@mail.com", "tasha123", false);
        userRepository.save(user1);
        assertThat(user1.getUserName()).isNotNull();
    }

    @Test
    void findUserById(){
        User user1 = new User("tasha", "tasha@mail.com", "tasha123", false);
        userRepository.save(user1);
        assertThat(user1.getUserName()).isNotNull();
        userRepository.findById(user1.getUserId());
        assertEquals(1L, userRepository.findById(user1.getUserId()));
    }

}