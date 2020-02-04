/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.beanclass;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ClassEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "cache": ((ClassEndpoint) target).setCache(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "method": ((ClassEndpoint) target).setMethod(property(camelContext, java.lang.String.class, value)); return true;
        case "scope": ((ClassEndpoint) target).setScope(property(camelContext, org.apache.camel.BeanScope.class, value)); return true;
        case "lazyStartProducer": ((ClassEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((ClassEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "parameters": ((ClassEndpoint) target).setParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "synchronous": ((ClassEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "cache": ((ClassEndpoint) target).setCache(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "method": ((ClassEndpoint) target).setMethod(property(camelContext, java.lang.String.class, value)); return true;
        case "scope": ((ClassEndpoint) target).setScope(property(camelContext, org.apache.camel.BeanScope.class, value)); return true;
        case "lazystartproducer": ((ClassEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((ClassEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "parameters": ((ClassEndpoint) target).setParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "synchronous": ((ClassEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}
