package com.social.media.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocialUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
                                        // Casecade will allow us to insert a new user along with its SocialProfile
    @OneToOne(mappedBy = "socialUser", cascade = CascadeType.ALL) // its mappedBy, means do not show it in JPA DB.
    private SocialProfile socialProfile;

    @OneToMany(mappedBy = "socialUser") // its mappedBy again, do not show it
    private Set<SocialPost> posts = new HashSet<>();

    @ManyToMany
    // JoinTable annotation to change the names, cus its join table right.
    @JoinTable(
            name = "user_groups",
            joinColumns =  @JoinColumn(name = "user_id"),
            inverseJoinColumns   = @JoinColumn(name = "group_id")
    )
    private Set<SocialGroup> groups = new HashSet<>();

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
