/*
 * Copyright 2015-2018 _floragunn_ GmbH
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

/*
 * Portions Copyright OpenSearch Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.opensearch.node;

import java.util.Arrays;
import java.util.Collections;

import org.opensearch.common.settings.Settings;
import org.opensearch.plugins.Plugin;

public class PluginAwareNode extends Node {
    
    private final boolean masterEligible;

    @SafeVarargs
    public PluginAwareNode(boolean masterEligible, final Settings preparedSettings, final Class<? extends Plugin>... plugins) {
    	super(InternalSettingsPreparer.prepareEnvironment(preparedSettings, Collections.emptyMap(), null, () -> System.getenv("HOSTNAME")), Arrays.asList(plugins), true);
        this.masterEligible = masterEligible;
    }
    

    public boolean isMasterEligible() {
        return masterEligible;
    }
}
