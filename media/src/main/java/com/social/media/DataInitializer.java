package com.social.media;

import com.social.media.models.SocialGroup;
import com.social.media.models.SocialPost;
import com.social.media.models.SocialProfile;
import com.social.media.models.SocialUser;
import com.social.media.repositories.SocialGroupRepository;
import com.social.media.repositories.SocialPostRepository;
import com.social.media.repositories.SocialProfileRepository;
import com.social.media.repositories.SocialUserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Data
@AllArgsConstructor
@Configuration
public class DataInitializer {
    private final SocialUserRepository userRepository;
    private final SocialGroupRepository groupRepository;
    private final SocialPostRepository postRepository;
    private final SocialProfileRepository profileRepository;

    @Bean
    public CommandLineRunner initializeData(){
        return (args -> {
            SocialUser user1 = new SocialUser();
            SocialUser user2 = new SocialUser();
            SocialUser user3 = new SocialUser();

            userRepository.save(user1);
            userRepository.save(user2);
            userRepository.save(user3);

            // Create groups
            SocialGroup group1 = new SocialGroup();
            SocialGroup group2 = new SocialGroup();

            groupRepository.save(group1);
            groupRepository.save(group2);
            // add from group side
            group1.getSocialUsers().add(user1);
            group1.getSocialUsers().add(user2);

            // add from user side
            user1.getGroups().add(group1);
            user2.getGroups().add(group1);

            group2.getSocialUsers().add(user1);
            group2.getSocialUsers().add(user3);
            
            user1.getGroups().add(group2);
            user3.getGroups().add(group2);

            groupRepository.save(group1);
            groupRepository.save(group2);
            
            userRepository.save(user1);
            userRepository.save(user2);
            userRepository.save(user3);


            // Create posts
            SocialPost socialPost1 = new SocialPost();
            SocialPost socialPost2 = new SocialPost();
            SocialPost socialPost3 = new SocialPost();

            socialPost1.setSocialUser(user1);
            socialPost2.setSocialUser(user2);
            socialPost3.setSocialUser(user3);

            postRepository.save(socialPost1);
            postRepository.save(socialPost2);
            postRepository.save(socialPost3);

            // Create profiles
            SocialProfile socialProfile1 = new SocialProfile();
            SocialProfile socialProfile2 = new SocialProfile();
            SocialProfile socialProfile3 = new SocialProfile();

            socialProfile1.setUser(user1);
            socialProfile2.setUser(user2);
            socialProfile3.setUser(user3);

            profileRepository.save(socialProfile1);
            profileRepository.save(socialProfile2);
            profileRepository.save(socialProfile3);
        });
    }
}
