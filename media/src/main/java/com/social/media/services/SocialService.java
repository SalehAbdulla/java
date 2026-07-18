package com.social.media.services;

import com.social.media.models.SocialGroup;
import com.social.media.models.SocialUser;
import com.social.media.repositories.SocialUserRepository;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialService {

    @Autowired
    private SocialUserRepository socialUserRepository;

    public List<SocialUser> getAllUsers(){
        return socialUserRepository.findAll();
    }

}
