package back_end_app.api;

import back_end_app.domaine.Imputation;
import back_end_app.domaine.Project;
import back_end_app.service.ImputationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/imputations")
public class ImputationRessource {
    @Autowired
    ImputationService imputationService;

    @GetMapping
    public List<Imputation> getImputations(){
        return imputationService.getImputations();
    }

    @GetMapping("/{id}")
    public Imputation getImputation(@PathVariable Long id){
        return imputationService.getImputation(id);
    }

    @PostMapping
    public Imputation addImputation(@RequestBody Imputation imputation){
        return imputationService.saveImputation(imputation);
    }


}
