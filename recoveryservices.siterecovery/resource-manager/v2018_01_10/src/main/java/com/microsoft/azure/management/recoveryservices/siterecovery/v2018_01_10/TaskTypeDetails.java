/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Task details based on specific task type.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("TaskTypeDetails")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AutomationRunbookTaskDetails", value = AutomationRunbookTaskDetails.class),
    @JsonSubTypes.Type(name = "ConsistencyCheckTaskDetails", value = ConsistencyCheckTaskDetails.class),
    @JsonSubTypes.Type(name = "FabricReplicationGroupTaskDetails", value = FabricReplicationGroupTaskDetails.class),
    @JsonSubTypes.Type(name = "JobTaskDetails", value = JobTaskDetails.class),
    @JsonSubTypes.Type(name = "ManualActionTaskDetails", value = ManualActionTaskDetails.class),
    @JsonSubTypes.Type(name = "ScriptActionTaskDetails", value = ScriptActionTaskDetails.class),
    @JsonSubTypes.Type(name = "VirtualMachineTaskDetails", value = VirtualMachineTaskDetails.class),
    @JsonSubTypes.Type(name = "VmNicUpdatesTaskDetails", value = VmNicUpdatesTaskDetails.class)
})
public class TaskTypeDetails {
}
