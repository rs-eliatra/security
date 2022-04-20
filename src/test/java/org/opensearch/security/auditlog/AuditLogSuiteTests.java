/*
 * Copyright OpenSearch Contributors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License").
 *  You may not use this file except in compliance with the License.
 *  A copy of the License is located at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  or in the "license" file accompanying this file. This file is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 *  express or implied. See the License for the specific language governing
 *  permissions and limitations under the License.
 */

package org.opensearch.security.auditlog;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import org.opensearch.security.auditlog.compliance.ComplianceAuditlogTests;
import org.opensearch.security.auditlog.compliance.RestApiComplianceAuditlogTests;
import org.opensearch.security.auditlog.impl.*;
import org.opensearch.security.auditlog.integration.BasicAuditlogTests;
import org.opensearch.security.auditlog.integration.SSLAuditlogTests;
import org.opensearch.security.auditlog.routing.FallbackTests;
import org.opensearch.security.auditlog.routing.RouterTests;
import org.opensearch.security.auditlog.routing.RoutingConfigurationTests;
import org.opensearch.security.auditlog.sink.KafkaSinkTests;
import org.opensearch.security.auditlog.sink.SinkProviderTLSTests;
import org.opensearch.security.auditlog.sink.SinkProviderTests;
import org.opensearch.security.auditlog.sink.WebhookAuditLogTests;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	ComplianceAuditlogTests.class,
	RestApiComplianceAuditlogTests.class,
	AuditlogTests.class,
	DelegateTests.class,
	DisabledCategoriesTests.class,
	IgnoreAuditUsersTests.class,
	TracingTests.class,
	BasicAuditlogTests.class,
	SSLAuditlogTests.class,
	FallbackTests.class,
	RouterTests.class,
	RoutingConfigurationTests.class,
	SinkProviderTests.class,
	SinkProviderTLSTests.class,
	WebhookAuditLogTests.class,
	KafkaSinkTests.class
})
public class AuditLogSuiteTests {

}
