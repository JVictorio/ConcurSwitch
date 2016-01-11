package com.concur.repo;

import com.concur.model.Application;

import java.util.List;

/**
 * Created by JVictorio on 1/8/16.
 */
public interface ApplicationRepositoryCustom {

    public List<Application> findByCustomQuery(String appName, String environment);
}
