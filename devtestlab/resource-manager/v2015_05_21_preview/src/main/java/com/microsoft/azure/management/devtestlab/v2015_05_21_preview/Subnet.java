/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2015_05_21_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Subnet model.
 */
public class Subnet {
    /**
     * The resourceId property.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * The labSubnetName property.
     */
    @JsonProperty(value = "labSubnetName")
    private String labSubnetName;

    /**
     * Possible values include: 'Default', 'Deny', 'Allow'.
     */
    @JsonProperty(value = "allowPublicIp")
    private UsagePermissionType allowPublicIp;

    /**
     * Get the resourceId value.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId value.
     *
     * @param resourceId the resourceId value to set
     * @return the Subnet object itself.
     */
    public Subnet withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the labSubnetName value.
     *
     * @return the labSubnetName value
     */
    public String labSubnetName() {
        return this.labSubnetName;
    }

    /**
     * Set the labSubnetName value.
     *
     * @param labSubnetName the labSubnetName value to set
     * @return the Subnet object itself.
     */
    public Subnet withLabSubnetName(String labSubnetName) {
        this.labSubnetName = labSubnetName;
        return this;
    }

    /**
     * Get possible values include: 'Default', 'Deny', 'Allow'.
     *
     * @return the allowPublicIp value
     */
    public UsagePermissionType allowPublicIp() {
        return this.allowPublicIp;
    }

    /**
     * Set possible values include: 'Default', 'Deny', 'Allow'.
     *
     * @param allowPublicIp the allowPublicIp value to set
     * @return the Subnet object itself.
     */
    public Subnet withAllowPublicIp(UsagePermissionType allowPublicIp) {
        this.allowPublicIp = allowPublicIp;
        return this;
    }

}