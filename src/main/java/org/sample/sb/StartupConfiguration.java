package org.sample.sb;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class StartupConfiguration {

    @PostConstruct
    public void init() {
        new VelocityEngine();
    }
}
