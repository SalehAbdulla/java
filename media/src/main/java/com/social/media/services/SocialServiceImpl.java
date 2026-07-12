package com.social.media.services;

import com.social.media.models.SocialUser;
import com.social.media.repositories.SocialUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialServiceImpl implements SocialService {

    @Autowired
    private SocialUserRepository socialUserRepository;

    @Override
    public List<SocialUser> getAllUsers() {
        return socialUserRepository.findAll();
    }

    @Override
    public SocialUser saveUser(SocialUser socialUser) {
        return socialUserRepository.save(socialUser);
    }

    @Override
    public SocialUser deleteUser(Long socialUserId) {
        SocialUser socialUser = socialUserRepository.findById(socialUserId)
        .orElseThrow(() -> new RuntimeException("user not found"));
        socialUserRepository.delete(socialUser);
        return socialUser;
    }
}
