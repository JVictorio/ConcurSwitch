package com.concur.repo;

import com.concur.model.Jenkins;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by JVictorio on 1/8/16.
 */
public interface JenkinsRepository extends MongoRepository<Jenkins, String>, JenkinsRepositoryCustom {
    public List<Jenkins> findByAppName(String appName);
    public List<Jenkins> findByAppNameAndEnvironment(String appName, String environment);

    @Query(value="{appName: ?0, server: ?1}")
    public List<Jenkins> findByAppServer(String appName, String server);
}
