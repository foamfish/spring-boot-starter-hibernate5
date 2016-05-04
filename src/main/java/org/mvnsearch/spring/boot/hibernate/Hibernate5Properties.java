package org.mvnsearch.spring.boot.hibernate;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * hibernate properties
 *
 * @author linux_china
 */
@ConfigurationProperties(
        prefix = "spring.hibernate5"
)
public class Hibernate5Properties {
    /**
     * hibernate config
     */
    private String config = "classpath:hibernate.cfg.xml";

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
