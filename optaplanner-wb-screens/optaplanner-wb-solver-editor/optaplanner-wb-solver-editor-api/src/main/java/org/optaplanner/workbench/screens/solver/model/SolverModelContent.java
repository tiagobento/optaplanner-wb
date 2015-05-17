/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.optaplanner.workbench.screens.solver.model;

import org.guvnor.common.services.shared.metadata.model.Overview;
import org.jboss.errai.common.client.api.annotations.Portable;
import org.uberfire.commons.validation.PortablePreconditions;

@Portable
public class SolverModelContent {

    private String config;
    private Overview overview;

    public SolverModelContent() {
        //Errai marshalling
    }

    public SolverModelContent( final String config,
                               final Overview overview ) {
        this.config = PortablePreconditions.checkNotNull( "config",
                                                          config );
        this.overview = PortablePreconditions.checkNotNull( "overview",
                                                            overview );
    }

    public String getConfig() {
        return this.config;
    }

    public Overview getOverview() {
        return overview;
    }
}