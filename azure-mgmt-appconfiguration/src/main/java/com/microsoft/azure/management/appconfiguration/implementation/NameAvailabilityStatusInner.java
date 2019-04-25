/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appconfiguration.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The result of a request to check the availability of a resource name.
 */
public class NameAvailabilityStatusInner {
    /**
     * The value indicating whether the resource name is available.
     */
    @JsonProperty(value = "nameAvailable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean nameAvailable;

    /**
     * If any, the error message that provides more detail for the reason that
     * the name is not available.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * If any, the reason that the name is not available.
     */
    @JsonProperty(value = "reason", access = JsonProperty.Access.WRITE_ONLY)
    private String reason;

    /**
     * Get the value indicating whether the resource name is available.
     *
     * @return the nameAvailable value
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Get if any, the error message that provides more detail for the reason that the name is not available.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get if any, the reason that the name is not available.
     *
     * @return the reason value
     */
    public String reason() {
        return this.reason;
    }

}
