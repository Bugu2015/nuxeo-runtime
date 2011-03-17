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
 *
 * $Id$
 */

package org.nuxeo.runtime.expression;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.jexl.JexlContext;

/**
 * @author  <a href="mailto:bs@nuxeo.com">Bogdan Stefanescu</a>
 * @author  <a href="mailto:rspivak@nuxeo.com">Ruslan Spivak</a>
 */
public class Context implements JexlContext {

    private Map<String, Object> vars = new HashMap<String, Object>();

    public Context() {
    }

    public Context(Map<String, Object> map) {
        vars = map;
    }

    @Override
    public Map<String, Object> getVars() {
        return vars;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void setVars(Map vars) {
        this.vars = vars;
    }

    public void put(String key, Object value) {
        vars.put(key, value);
    }
}
