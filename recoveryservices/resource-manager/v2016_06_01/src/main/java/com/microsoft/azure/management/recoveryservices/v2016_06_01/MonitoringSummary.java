/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Summary of the replication monitoring data for this vault.
 */
public class MonitoringSummary {
    /**
     * Count of unhealthy VMs.
     */
    @JsonProperty(value = "unHealthyVmCount")
    private Integer unHealthyVmCount;

    /**
     * Count of unhealthy replication providers.
     */
    @JsonProperty(value = "unHealthyProviderCount")
    private Integer unHealthyProviderCount;

    /**
     * Count of all critical warnings.
     */
    @JsonProperty(value = "eventsCount")
    private Integer eventsCount;

    /**
     * Count of all deprecated recovery service providers.
     */
    @JsonProperty(value = "deprecatedProviderCount")
    private Integer deprecatedProviderCount;

    /**
     * Count of all the supported recovery service providers.
     */
    @JsonProperty(value = "supportedProviderCount")
    private Integer supportedProviderCount;

    /**
     * Count of all the unsupported recovery service providers.
     */
    @JsonProperty(value = "unsupportedProviderCount")
    private Integer unsupportedProviderCount;

    /**
     * Get count of unhealthy VMs.
     *
     * @return the unHealthyVmCount value
     */
    public Integer unHealthyVmCount() {
        return this.unHealthyVmCount;
    }

    /**
     * Set count of unhealthy VMs.
     *
     * @param unHealthyVmCount the unHealthyVmCount value to set
     * @return the MonitoringSummary object itself.
     */
    public MonitoringSummary withUnHealthyVmCount(Integer unHealthyVmCount) {
        this.unHealthyVmCount = unHealthyVmCount;
        return this;
    }

    /**
     * Get count of unhealthy replication providers.
     *
     * @return the unHealthyProviderCount value
     */
    public Integer unHealthyProviderCount() {
        return this.unHealthyProviderCount;
    }

    /**
     * Set count of unhealthy replication providers.
     *
     * @param unHealthyProviderCount the unHealthyProviderCount value to set
     * @return the MonitoringSummary object itself.
     */
    public MonitoringSummary withUnHealthyProviderCount(Integer unHealthyProviderCount) {
        this.unHealthyProviderCount = unHealthyProviderCount;
        return this;
    }

    /**
     * Get count of all critical warnings.
     *
     * @return the eventsCount value
     */
    public Integer eventsCount() {
        return this.eventsCount;
    }

    /**
     * Set count of all critical warnings.
     *
     * @param eventsCount the eventsCount value to set
     * @return the MonitoringSummary object itself.
     */
    public MonitoringSummary withEventsCount(Integer eventsCount) {
        this.eventsCount = eventsCount;
        return this;
    }

    /**
     * Get count of all deprecated recovery service providers.
     *
     * @return the deprecatedProviderCount value
     */
    public Integer deprecatedProviderCount() {
        return this.deprecatedProviderCount;
    }

    /**
     * Set count of all deprecated recovery service providers.
     *
     * @param deprecatedProviderCount the deprecatedProviderCount value to set
     * @return the MonitoringSummary object itself.
     */
    public MonitoringSummary withDeprecatedProviderCount(Integer deprecatedProviderCount) {
        this.deprecatedProviderCount = deprecatedProviderCount;
        return this;
    }

    /**
     * Get count of all the supported recovery service providers.
     *
     * @return the supportedProviderCount value
     */
    public Integer supportedProviderCount() {
        return this.supportedProviderCount;
    }

    /**
     * Set count of all the supported recovery service providers.
     *
     * @param supportedProviderCount the supportedProviderCount value to set
     * @return the MonitoringSummary object itself.
     */
    public MonitoringSummary withSupportedProviderCount(Integer supportedProviderCount) {
        this.supportedProviderCount = supportedProviderCount;
        return this;
    }

    /**
     * Get count of all the unsupported recovery service providers.
     *
     * @return the unsupportedProviderCount value
     */
    public Integer unsupportedProviderCount() {
        return this.unsupportedProviderCount;
    }

    /**
     * Set count of all the unsupported recovery service providers.
     *
     * @param unsupportedProviderCount the unsupportedProviderCount value to set
     * @return the MonitoringSummary object itself.
     */
    public MonitoringSummary withUnsupportedProviderCount(Integer unsupportedProviderCount) {
        this.unsupportedProviderCount = unsupportedProviderCount;
        return this;
    }

}
