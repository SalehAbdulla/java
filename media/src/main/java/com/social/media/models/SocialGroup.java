package com.social.media.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocialGroup {
    @Id
    private Long id;

    @ManyToMany(mappedBy = "groups") // its mappedBy again, do not show it
    private Set<SocialUser> users = new HashSet<>();
}
