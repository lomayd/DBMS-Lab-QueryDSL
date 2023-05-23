package lomayd.DBMSLabQueryDSL.api.domain.user.repository;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;

import lomayd.DBMSLabQueryDSL.api.domain.user.QUser;
import lomayd.DBMSLabQueryDSL.api.domain.user.User;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepositoryCustom {
    
    private final JPAQueryFactory jpaQueryFactory;
    QUser user = QUser.user;
    
    @Override
    public void saveUser(User newUser){
        jpaQueryFactory.insert(user).set(user.id, newUser.getId()).set(user.password, newUser.getPassword()).set(user.name, newUser.getName()).set(user.nickname, newUser.getNickname()).set(user.email, newUser.getEmail()).set(user.age, newUser.getAge());
    }
    
    @Override
    public User findUser(String id){
        return jpaQueryFactory.selectFrom(user).where(user.id.eq(id)).fetchFirst();
    }
    
    @Override
    @Transactional
    public void updateUser(String id, User newUser){
        jpaQueryFactory.update(user).set(user.password, newUser.getPassword()).set(user.name, newUser.getName()).set(user.nickname, newUser.getNickname()).set(user.email, newUser.getEmail()).set(user.age, newUser.getAge()).where(user.id.eq(id)).execute();
    }
    
    @Override
    @Transactional
    public void deleteUser(String id){
        jpaQueryFactory.delete(user).where(user.id.eq(id)).execute();
    }
}
