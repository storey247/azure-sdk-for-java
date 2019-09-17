/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Network interface and all its associated security rules.
 */
public class SecurityGroupNetworkInterface {
    /**
     * ID of the network interface.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * All security rules associated with the network interface.
     */
    @JsonProperty(value = "securityRuleAssociations")
    private SecurityRuleAssociations securityRuleAssociations;

    /**
     * Get iD of the network interface.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set iD of the network interface.
     *
     * @param id the id value to set
     * @return the SecurityGroupNetworkInterface object itself.
     */
    public SecurityGroupNetworkInterface withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get all security rules associated with the network interface.
     *
     * @return the securityRuleAssociations value
     */
    public SecurityRuleAssociations securityRuleAssociations() {
        return this.securityRuleAssociations;
    }

    /**
     * Set all security rules associated with the network interface.
     *
     * @param securityRuleAssociations the securityRuleAssociations value to set
     * @return the SecurityGroupNetworkInterface object itself.
     */
    public SecurityGroupNetworkInterface withSecurityRuleAssociations(SecurityRuleAssociations securityRuleAssociations) {
        this.securityRuleAssociations = securityRuleAssociations;
        return this;
    }

}
