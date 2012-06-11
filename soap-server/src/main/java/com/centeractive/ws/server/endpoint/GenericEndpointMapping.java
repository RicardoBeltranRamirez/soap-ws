/**
 * Copyright (c) 2012 centeractive ag. All Rights Reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.centeractive.ws.server.endpoint;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.mapping.AbstractEndpointMapping;

/**
 * @author Tom Bujok
 * @since 1.0.0
 */
public class GenericEndpointMapping extends AbstractEndpointMapping {

    private final static Log log = LogFactory.getLog(GenericEndpointMapping.class);

    private ContextPayloadEndpoint genericEndpoint;

    @Override
    protected Object getEndpointInternal(MessageContext messageContext) throws Exception {
        return genericEndpoint;
    }

    public ContextPayloadEndpoint getGenericEndpoint() {
        return genericEndpoint;
    }

    public void setGenericEndpoint(ContextPayloadEndpoint genericEndpoint) {
        this.genericEndpoint = genericEndpoint;
    }
}
