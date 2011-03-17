/* 
 * (C) Copyright 2006-2011 Nuxeo SA (http://nuxeo.com/) and contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Contributors:
 *     Nuxeo - initial API and implementation
 * $Id$
 */

package org.nuxeo.runtime.model;


/**
 * A component instance is a proxy to the component implementation object.
 * <p>
 * Component instance objects are created each time a component is
 * activated, and destroyed at component deactivation.
 *
 * @author  <a href="mailto:bs@nuxeo.com">Bogdan Stefanescu</a>
 */
public interface ComponentInstance extends ComponentContext, Extensible, Adaptable {

    /**
     * Gets the actual component implementation instance.
     *
     * @return the component implementation instance
     */
    Object getInstance();

    /**
     * Gets the name of the component.
     *
     * @return the component name
     */
    ComponentName getName();

    /**
     * Gets the runtime context attached to this instance.
     *
     * @return the runtime context
     */
    RuntimeContext getContext();

    /**
     * Activates the implementation instance.
     *
     * @throws Exception if any error occurs during activation
     */
    void activate() throws Exception;

    /**
     * Deactivates the implementation instance.
     *
     * @throws Exception if any error occurs during deactivation
     */
    void deactivate() throws Exception;

    /**
     * Destroys this instance.
     *
     * @throws Exception if any error occurs
     */
    void destroy() throws Exception;

    /**
     * Reload the component. All the extensions and registries are reloaded.
     * @throws Exception
     */
    void reload() throws Exception;

    /**
     * Gets the list of provided services, or null if no service is provided.
     *
     * @return an array containing the service class names or null if no service is provided
     */
    String[] getProvidedServiceNames();

}
