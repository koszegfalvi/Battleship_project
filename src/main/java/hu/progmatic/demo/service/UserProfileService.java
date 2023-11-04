package hu.progmatic.demo.service;

import hu.progmatic.demo.model.User;
import hu.progmatic.demo.repository.UserProfileRepository;

import org.springframework.stereotype.Service;

@Service
public class UserProfileService {
    private final UserProfileRepository userProfileRepository;


    public UserProfileService(UserProfileRepository userProfileRepository) {
        this.userProfileRepository = userProfileRepository;
    }



    public User getUserProfileByName(String userName) {
        return userProfileRepository.findByUserName(userName);
    }
}
