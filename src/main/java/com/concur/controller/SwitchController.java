package com.concur.controller;

import com.concur.SwitchService;
import com.concur.model.Application;
import com.fasterxml.jackson.databind.JsonNode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by JVictorio on 1/11/16.
 */

@RestController
@RequestMapping(value = "/switch")
@Api(value="Switch", description="Switch REST API Service Endpoints",
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
public class SwitchController {
    private static final Logger LOG = LoggerFactory.getLogger(SwitchController.class);

    @Autowired
    SwitchService switchService;

    @ApiOperation(value="Disable All Application Tests", position=1, response=Application[].class)
    @ApiResponses(value={
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad request."),
        @ApiResponse(code = 409, message = "Request was either not fulfilled or it was fulfilled just partially."),
        @ApiResponse(code = 500, message = "Internal service error."),
    })
    @RequestMapping(value="/application/{application}/environment/{environment}",
        method = RequestMethod.GET)
    public List<Application> switchAppllication(
        @ApiParam(value="Application Value", name = "Application Name")
        @PathVariable("application") final String application,
        @ApiParam(value="Environment Value", name = "Environment Name")
        @PathVariable("environment") final String environment) throws Exception {

        String msg =  String.format("Application Name: ['%s'], Environment: ['%s']", application, environment);

        System.out.println(msg);
        return switchService.getApplicationInfo(application, environment);
    }

}
