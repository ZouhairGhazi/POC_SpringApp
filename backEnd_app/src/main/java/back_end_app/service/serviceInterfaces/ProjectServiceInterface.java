package back_end_app.service.serviceInterfaces;

import back_end_app.domaine.Project;

import java.util.List;

public interface ProjectServiceInterface {
    Project saveProject(Project project);
    Project getProject(Long id);

    Project getProjectByTitle(String title);
    List<Project> getProjects();
}
