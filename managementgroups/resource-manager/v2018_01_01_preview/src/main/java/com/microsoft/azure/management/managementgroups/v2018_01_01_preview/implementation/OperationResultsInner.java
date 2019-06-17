/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2018_01_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The results of an asynchronous operation.
 */
@JsonFlatten
public class OperationResultsInner {
    /**
     * The fully qualified ID for the management group.  For example,
     * /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The type of the resource.  For example,
     * /providers/Microsoft.Management/managementGroups.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * The name of the management group. For example,
     * 00000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Provisioning State.
     * Possible values include: 'Updating'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the fully qualified ID for the management group.  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the type of the resource.  For example, /providers/Microsoft.Management/managementGroups.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the name of the management group. For example, 00000000-0000-0000-0000-000000000000.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get possible values include: 'Updating'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set possible values include: 'Updating'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the OperationResultsInner object itself.
     */
    public OperationResultsInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

}
