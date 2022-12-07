package back_end_app.service.serviceInterfaces;

import back_end_app.domaine.Imputation;

import java.util.List;

public interface ImputationServiceInterface {
    Imputation saveImputation(Imputation project);
    Imputation getImputation(Long id);

    List<Imputation> getImputations();
}
