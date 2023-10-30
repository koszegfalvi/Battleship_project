package hu.progmatic.demo.service;

import hu.progmatic.demo.model.UserProfile;
import hu.progmatic.demo.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserProfileService {
    private final UserProfileRepository userProfileRepository;

   // @Autowired
    public UserProfileService(UserProfileRepository userProfileRepository) {
        this.userProfileRepository = userProfileRepository;
    }

    public UserProfile getUserProfileById(Long id) {
        return userProfileRepository.findById(id).orElse(null);
    }
}
