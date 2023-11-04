package hu.progmatic.demo.model;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity

public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private int score;
    private int wins;
    private int losses;
    private double winLossRatio;
    @OneToOne(mappedBy = "userProfile")
    private User user;


    public double getWinRatio() {
        if (losses == 0) {
            return 1.0;
        }
        return (double) wins / losses;
    }
}
