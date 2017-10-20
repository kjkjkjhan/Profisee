
package org.mule.modules.profisee.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.profisee.ProfiseeConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>ProfiseeConnectorProcessAdapter</code> is a wrapper around {@link ProfiseeConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-10-03T02:01:25-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class ProfiseeConnectorProcessAdapter
    extends ProfiseeConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<ProfiseeConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, ProfiseeConnectorCapabilitiesAdapter> getProcessTemplate() {
        final ProfiseeConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,ProfiseeConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, ProfiseeConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, ProfiseeConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
