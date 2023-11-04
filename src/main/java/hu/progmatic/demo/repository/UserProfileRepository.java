package hu.progmatic.demo.repository;

import hu.progmatic.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<User, Integer> {
    User findByUserName(String userName);
}
