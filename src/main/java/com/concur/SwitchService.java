package com.concur;

import com.concur.model.Application;
import com.concur.repo.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by JVictorio on 1/11/16.
 */
@Service
public class SwitchService {

    @Autowired
    private ApplicationRepository applicationRepository;

    public SwitchService() {
    }

    public List<Application> getApplicationInfo(final String appName, final String env) {
        return applicationRepository.findByAppNameAndEnvironment(appName, env);
    }
}
