package back_end_app.repository;

import back_end_app.domaine.Imputation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImputationRepo extends JpaRepository<Imputation,Long> {

}

