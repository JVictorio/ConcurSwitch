package com.concur.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by JVictorio on 1/8/16.
 */
@Document(collection = "appjenkins")
public class Application {

    @Id
    private String id;

    private String appName;
    private String environment;
    private String server;
    private List<AppTest> tests;

    public Application() {
    }

    public Application(String appName, String environment, String server) {
        this.appName = appName;
        this.environment = environment;
        this.server = server;
    }

    public Application(String appName, String environment, String server, List<AppTest> tests) {
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

    public List<AppTest> getTests() {
        return tests;
    }

    public void setTests(List<AppTest> tests) {
        this.tests = tests;
    }

    @Override
    public String toString() {
        return String.format("Application[id=%s, appName='%s', environment='%s', server='%s']",
            id, appName, environment, server);

    }
}
