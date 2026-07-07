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
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
            // Create user
            SocialUser user1 = new SocialUser();
            SocialUser user2 = new SocialUser();
            SocialUser user3 = new SocialUser();

            // Save users
            userRepository.save(user1);
            userRepository.save(user2);
            userRepository.save(user3);

            // Create Groups
            SocialGroup group1 = new SocialGroup();
            SocialGroup group2 = new SocialGroup();

            // add users to each group
            group1.getSocialUsers().add(user1);
            group1.getSocialUsers().add(user2);

            group2.getSocialUsers().add(user1);
            group2.getSocialUsers().add(user3);

            // Save Groups
            groupRepository.save(group1);
            groupRepository.save(group2);

            // Create Posts
            SocialPost socialPost1 = new SocialPost();
            SocialPost socialPost2 = new SocialPost();
            SocialPost socialPost3 = new SocialPost();

            // Associate post with user
            socialPost1.setSocialUser(user1);
            socialPost2.setSocialUser(user2);
            socialPost3.setSocialUser(user3);

            // save
            postRepository.save(socialPost1);
            postRepository.save(socialPost2);
            postRepository.save(socialPost3);



            // Create Profile
            SocialProfile socialProfile1 = new SocialProfile();
            SocialProfile socialProfile2 = new SocialProfile();
            SocialProfile socialProfile3 = new SocialProfile();

            // Associate user with profile
            socialProfile1.setUser(user1);
            socialProfile1.setUser(user2);
            socialProfile1.setUser(user3);

            // Save
            profileRepository.save(socialProfile1);
            profileRepository.save(socialProfile2);
            profileRepository.save(socialProfile3);

        });
    }
}
