package com.spboot.cloudexamplesecond.service;

import com.spboot.feignexample.client.UserClient;
import com.spboot.feignexample.model.User;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class CloudService {

    @Autowired
    private UserClient userClient;

    public User getUser() {
        return userClient.getUser();
    }
}
