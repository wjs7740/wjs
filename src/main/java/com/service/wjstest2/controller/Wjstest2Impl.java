package com.service.wjstest2.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-06-28T01:19:05.089Z")

@RestSchema(schemaId = "wjstest2")
@RequestMapping(path = "/wjstest2", produces = MediaType.APPLICATION_JSON)
public class Wjstest2Impl {

    @Autowired
    private Wjstest2Delegate userWjstest2Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userWjstest2Delegate.helloworld(name);
    }

}
