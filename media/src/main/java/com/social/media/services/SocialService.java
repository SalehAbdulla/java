package com.social.media.services;

import com.social.media.models.SocialUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SocialService {
    List<SocialUser> getAllUsers();
    SocialUser saveUser(SocialUser socialUser);
    SocialUser deleteUser(Long socialUserId);
}
