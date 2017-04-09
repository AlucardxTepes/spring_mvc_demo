package com.alucard.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by Alucard on 4/9/2017.
 */
@Configuration
public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer{
  protected Class<?>[] getRootConfigClasses() {
    return new Class[] { RootConfig.class};
  }
  
  protected Class<?>[] getServletConfigClasses() {
    return new Class[] { WebConfig.class };
  }
  
  protected String[] getServletMappings() {
    return new String[] { "/"};
  }
}
