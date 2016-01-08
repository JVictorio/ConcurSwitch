package com.concur.repo;

import com.concur.model.Jenkins;

import java.util.List;

/**
 * Created by JVictorio on 1/8/16.
 */
public interface JenkinsRepositoryCustom {

    public List<Jenkins> findByCustomQuery(String appName, String environment);
}
