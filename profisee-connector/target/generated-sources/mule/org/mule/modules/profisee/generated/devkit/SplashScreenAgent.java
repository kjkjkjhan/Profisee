
package org.mule.modules.profisee.generated.devkit;

import javax.annotation.Generated;


/**
 * Marks DevKit {@link org.mule.api.agent.Agent} implementations to take care of logging information at Mule app level mainly for troubleshooting purposes.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-10-03T02:01:25-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public interface SplashScreenAgent {

      /**
     * Print version information for all the modules used by the application
     */
    void splash();

    /**
     * Retrieve the count of modules used by the application
     *
     * @return
     */
    int getExtensionsCount();
}