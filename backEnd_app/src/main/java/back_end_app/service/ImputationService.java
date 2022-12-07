package back_end_app.service;

import back_end_app.domaine.Imputation;
import back_end_app.repository.ImputationRepo;
import back_end_app.service.serviceInterfaces.ImputationServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImputationService implements ImputationServiceInterface {
    @Autowired
    ImputationRepo imputationRepo;

    @Override
    public Imputation saveImputation(Imputation imputation) {
        return imputationRepo.save(imputation);
    }


    @Override
    public Imputation getImputation(Long id) {
        return imputationRepo.findById(id).orElse(null);
    }

    @Override
    public List<Imputation> getImputations() {
        return imputationRepo.findAll();
    }
}
