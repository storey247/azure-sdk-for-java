/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Container network interface child resource.
 */
@JsonFlatten
public class ContainerNetworkInterface extends SubResource {
    /**
     * Container network interface configuration from which this container
     * network interface is created.
     */
    @JsonProperty(value = "properties.containerNetworkInterfaceConfiguration")
    private ContainerNetworkInterfaceConfiguration containerNetworkInterfaceConfiguration;

    /**
     * Reference to the container to which this container network interface is
     * attached.
     */
    @JsonProperty(value = "properties.container")
    private Container container;

    /**
     * Reference to the ip configuration on this container nic.
     */
    @JsonProperty(value = "properties.ipConfigurations")
    private List<ContainerNetworkInterfaceIpConfiguration> ipConfigurations;

    /**
     * The provisioning state of the container network interface resource.
     * Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The name of the resource. This name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Sub Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get container network interface configuration from which this container network interface is created.
     *
     * @return the containerNetworkInterfaceConfiguration value
     */
    public ContainerNetworkInterfaceConfiguration containerNetworkInterfaceConfiguration() {
        return this.containerNetworkInterfaceConfiguration;
    }

    /**
     * Set container network interface configuration from which this container network interface is created.
     *
     * @param containerNetworkInterfaceConfiguration the containerNetworkInterfaceConfiguration value to set
     * @return the ContainerNetworkInterface object itself.
     */
    public ContainerNetworkInterface withContainerNetworkInterfaceConfiguration(ContainerNetworkInterfaceConfiguration containerNetworkInterfaceConfiguration) {
        this.containerNetworkInterfaceConfiguration = containerNetworkInterfaceConfiguration;
        return this;
    }

    /**
     * Get reference to the container to which this container network interface is attached.
     *
     * @return the container value
     */
    public Container container() {
        return this.container;
    }

    /**
     * Set reference to the container to which this container network interface is attached.
     *
     * @param container the container value to set
     * @return the ContainerNetworkInterface object itself.
     */
    public ContainerNetworkInterface withContainer(Container container) {
        this.container = container;
        return this;
    }

    /**
     * Get reference to the ip configuration on this container nic.
     *
     * @return the ipConfigurations value
     */
    public List<ContainerNetworkInterfaceIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set reference to the ip configuration on this container nic.
     *
     * @param ipConfigurations the ipConfigurations value to set
     * @return the ContainerNetworkInterface object itself.
     */
    public ContainerNetworkInterface withIpConfigurations(List<ContainerNetworkInterfaceIpConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the provisioning state of the container network interface resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the name of the resource. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the ContainerNetworkInterface object itself.
     */
    public ContainerNetworkInterface withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get sub Resource type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set
     * @return the ContainerNetworkInterface object itself.
     */
    public ContainerNetworkInterface withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
