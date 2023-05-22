package lomayd.DBMSLabQueryDSL.api.global.config;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.querydsl.jpa.impl.JPAQueryFactory;

@EnableJpaAuditing
@Configuration
public class QueryDslConfig {

  @PersistenceContext
  private EntityManager entityManager;

  public QueryDslConfig() {
  }

  @Bean
  public JPAQueryFactory jpaQueryFactory() {
    return new JPAQueryFactory(this.entityManager);
  }
}