package com.concur.repo;

import com.concur.model.Application;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by JVictorio on 1/8/16.
 */
public interface ApplicationRepository extends MongoRepository<Application, String>, ApplicationRepositoryCustom {
    public List<Application> findByAppName(String appName);
    public List<Application> findByAppNameAndEnvironment(String appName, String environment);

    @Query(value="{appName: ?0, server: ?1}")
    public List<Application> findByAppServer(String appName, String server);
}
