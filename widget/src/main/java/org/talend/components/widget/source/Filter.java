/**
 * Copyright (C) 2006-2017 Talend Inc. - www.talend.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.talend.components.widget.source;

import static org.talend.components.widget.source.Filter.Operation.GREATER_THAN;

import java.io.Serializable;

import org.talend.sdk.component.api.configuration.Option;

/**
 * Represents a row in a table property
 */
public class Filter implements Serializable {
    
    @Option
    private String prefix;
    
    @Option
    private boolean include;
    
    @Option
    private Operation operation = GREATER_THAN;
    
    static enum Operation {
        GREATER_THAN,
        LESS_THAN,
        EQUALS
    }
    
}
