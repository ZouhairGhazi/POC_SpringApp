package back_end_app.service;

import back_end_app.domaine.Project;
import back_end_app.repository.ProjectRepo;
import back_end_app.service.serviceInterfaces.ProjectServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectService implements ProjectServiceInterface {
    @Autowired
    ProjectRepo projectRepo;

    @Override
    public Project saveProject(Project project) {
        return projectRepo.save(project);
    }

    @Override
    public Project getProjectByTitle(String title) {
        return projectRepo.findByTitle(title);
    }

    @Override
    public Project getProject(Long id) {
        return projectRepo.findById(id).orElse(null);
    }

    @Override
    public List<Project> getProjects() {
        return projectRepo.findAll();
    }
}
