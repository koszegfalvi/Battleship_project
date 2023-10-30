package hu.progmatic.demo.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    private String password;
    private int win;
    private int lose;

    // Getters and setters for the above fields

    public double getWinRatio() {
        if (lose == 0) {
            return 1.0; // To avoid division by zero
        }
        return (double) win / lose;
    }
}
