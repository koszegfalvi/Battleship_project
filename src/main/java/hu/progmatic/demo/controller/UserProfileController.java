package hu.progmatic.demo.controller;

import hu.progmatic.demo.model.UserProfile;
import hu.progmatic.demo.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class UserProfileController {


    @Autowired
    private UserProfileRepository userProfileRepository;

    @GetMapping("/profile")
    public String userProfile(Model model) {
        UserProfile userProfile = userProfileRepository.findById(1L).orElse(new UserProfile());
        model.addAttribute("userProfile", userProfile);
        return "profile";
    }


}
