package com.ibhatech.opendata.reports;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Configuration
public class AppConfiguration {
  private String[] CLASSPATH_RESOURCE_LOCATIONS = new String[]{
    "classpath:/META-INF/resources/", "classpath:/resources/", "classpath:/static/", "classpath:/public/"
  };


}
