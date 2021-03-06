package com.lilas.demo.websecurity;

import com.lilas.demo.constatns.KeyConstants;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController(KeyConstants.LOGIN_KEY).setViewName(KeyConstants.LOGIN_VIEW_KEY);
    }

}
