package com.adelacebal.core;

import com.adelacebal.user.User;
import com.adelacebal.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader {
    private final UserRepository users;

    @Autowired
    public DatabaseLoader(UserRepository users) {
        this.users = users;
    }

    public void run(ApplicationArguments args) throws Exception {
        users.save(new User("adelacebal", "Adel", "Acebal", "1234", new String[]{"ROLE_USER", "ROLE_ADMIN"}));
    }
}
