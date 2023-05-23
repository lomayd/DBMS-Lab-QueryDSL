package lomayd.DBMSLabQueryDSL.api.domain.user.repository;

import org.springframework.stereotype.Repository;

import lomayd.DBMSLabQueryDSL.api.domain.user.User;

@Repository
public interface UserRepositoryCustom {
    
    void saveUser(User user);
    
    User findUser(String id);
    
    void updateUser(String id, User user);
    
    void deleteUser(String id);
}
