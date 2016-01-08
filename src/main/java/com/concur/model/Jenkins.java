package com.concur.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by JVictorio on 1/8/16.
 */
@Document(collection = "appjenkins")
public class Jenkins {

    @Id
    private String id;

    private String appName;
    private String environment;
    private String server;
    private List<Tests> tests;

    public Jenkins() {
    }

    public Jenkins(String appName, String environment, String server) {
        this.appName = appName;
        this.environment = environment;
        this.server = server;
    }

    public Jenkins(String appName, String environment, String server, List<Tests> tests) {
        this.appName = appName;
        this.environment = environment;
        this.server = server;
        this.tests = tests;
    }

    public String getId() {
        return id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public List<Tests> getTests() {
        return tests;
    }

    public void setTests(List<Tests> tests) {
        this.tests = tests;
    }

    @Override
    public String toString() {
        return String.format("Jenkins[id=%s, appName='%s', environment='%s', server='%s']",
            id, appName, environment, server);

    }
}
