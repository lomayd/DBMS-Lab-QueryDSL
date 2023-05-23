package lomayd.DBMSLabQueryDSL.api.domain.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lomayd.DBMSLabQueryDSL.api.domain.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>, UserRepositoryCustom {
    
}
