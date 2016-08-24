package com.projecteight.context;

import org.baracus.annotations.Bean;
import org.baracus.lifecycle.ApplicationContextInitializer;
import org.baracus.util.Logger;
import com.projecteight.service.ConfigurationService;
import com.projecteight.service.CustomerDataService;

/**
 * Created by marcus on 16.07.14.
 */
public class ApplicationInitializerCallback implements ApplicationContextInitializer {

    Logger logger = new Logger(ApplicationInitializerCallback.class);

    @Bean
    CustomerDataService customerDataService;

    @Bean
    ConfigurationService configurationService;

    @Override
    public void afterContextIsBuilt() {
        if (!configurationService.isApplicationInitializationDone()) {
            logger.info("Application data is not initialized. Will init now");
            customerDataService.initializeApplicationData();
            configurationService.setApplicationInitializationDone(true);
        } else {
            logger.info("Application is initialized. Nothing to be done.");
        }
    }
}
