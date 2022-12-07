package back_end_app.repository;

import back_end_app.domaine.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project,Long> {
    Project findByTitle(String title);
}
