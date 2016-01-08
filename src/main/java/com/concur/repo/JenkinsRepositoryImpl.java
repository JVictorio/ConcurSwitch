package com.concur.repo;

import com.concur.model.Jenkins;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

/**
 * Created by JVictorio on 1/8/16.
 */
public class JenkinsRepositoryImpl implements JenkinsRepositoryCustom {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Jenkins> findByCustomQuery(String appName, String environment) {
        Criteria criteria = Criteria.where("appName").is(appName).andOperator(
            Criteria.where("environment").is(environment));
        return mongoTemplate.find(Query.query(criteria), Jenkins.class);
    }
}
