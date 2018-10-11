package com.forezp.eurekafeignclient.service;

import com.forezp.eurekafeignclient.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiService {
    @Autowired
    EurekaClientFeign eurekaClientFeign;

    public String sayHi(String name) {
        return eurekaClientFeign.sayHiFromClientEureka(name);
    }
}
