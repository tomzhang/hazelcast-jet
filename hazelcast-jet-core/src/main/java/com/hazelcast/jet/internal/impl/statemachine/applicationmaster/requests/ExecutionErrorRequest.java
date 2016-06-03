/*
 * Copyright (c) 2008-2016, Hazelcast, Inc. All Rights Reserved.
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

package com.hazelcast.jet.internal.impl.statemachine.applicationmaster.requests;

import com.hazelcast.jet.internal.api.statemachine.container.ContainerRequest;
import com.hazelcast.jet.internal.api.statemachine.container.applicationmaster.ApplicationMasterEvent;

public class ExecutionErrorRequest implements ContainerRequest<ApplicationMasterEvent, Throwable> {
    private final Throwable error;

    public ExecutionErrorRequest(Throwable error) {
        this.error = error;
    }

    @Override
    public ApplicationMasterEvent getContainerEvent() {
        return ApplicationMasterEvent.EXECUTION_ERROR;
    }

    @Override
    public Throwable getPayLoad() {
        return this.error;
    }
}