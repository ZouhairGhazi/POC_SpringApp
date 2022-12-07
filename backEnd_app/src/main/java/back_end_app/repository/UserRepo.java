package back_end_app.repository;

import back_end_app.domaine.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
