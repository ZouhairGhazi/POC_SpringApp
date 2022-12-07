package back_end_app.api;

import back_end_app.domaine.Project;
import back_end_app.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectRessource {
    @Autowired
    ProjectService projectService;

    @GetMapping
    public List<Project> getProjects(){
        return projectService.getProjects();
    }

    @GetMapping("/{id}")
    public Project getProject(@PathVariable Long id){
        return projectService.getProject(id);
    }

    @PostMapping
    public Project addProject(@RequestBody Project project){
        return projectService.saveProject(project);
    }


}
