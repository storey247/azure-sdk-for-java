/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.authorization.v2018_09_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Classic Administrators.
 */
@JsonFlatten
public class ClassicAdministratorInner {
    /**
     * The ID of the administrator.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The name of the administrator.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The type of the administrator.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The email address of the administrator.
     */
    @JsonProperty(value = "properties.emailAddress")
    private String emailAddress;

    /**
     * The role of the administrator.
     */
    @JsonProperty(value = "properties.role")
    private String role;

    /**
     * Get the ID of the administrator.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the ID of the administrator.
     *
     * @param id the id value to set
     * @return the ClassicAdministratorInner object itself.
     */
    public ClassicAdministratorInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name of the administrator.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the administrator.
     *
     * @param name the name value to set
     * @return the ClassicAdministratorInner object itself.
     */
    public ClassicAdministratorInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type of the administrator.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type of the administrator.
     *
     * @param type the type value to set
     * @return the ClassicAdministratorInner object itself.
     */
    public ClassicAdministratorInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the email address of the administrator.
     *
     * @return the emailAddress value
     */
    public String emailAddress() {
        return this.emailAddress;
    }

    /**
     * Set the email address of the administrator.
     *
     * @param emailAddress the emailAddress value to set
     * @return the ClassicAdministratorInner object itself.
     */
    public ClassicAdministratorInner withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Get the role of the administrator.
     *
     * @return the role value
     */
    public String role() {
        return this.role;
    }

    /**
     * Set the role of the administrator.
     *
     * @param role the role value to set
     * @return the ClassicAdministratorInner object itself.
     */
    public ClassicAdministratorInner withRole(String role) {
        this.role = role;
        return this;
    }

}
