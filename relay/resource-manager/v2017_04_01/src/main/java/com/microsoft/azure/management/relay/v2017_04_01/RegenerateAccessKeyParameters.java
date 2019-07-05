/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.relay.v2017_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters supplied to the regenerate authorization rule operation,
 * specifies which key neeeds to be reset.
 */
public class RegenerateAccessKeyParameters {
    /**
     * The access key to regenerate. Possible values include: 'PrimaryKey',
     * 'SecondaryKey'.
     */
    @JsonProperty(value = "keyType", required = true)
    private KeyType keyType;

    /**
     * Optional. If the key value is provided, this is set to key type, or
     * autogenerated key value set for key type.
     */
    @JsonProperty(value = "key")
    private String key;

    /**
     * Get the access key to regenerate. Possible values include: 'PrimaryKey', 'SecondaryKey'.
     *
     * @return the keyType value
     */
    public KeyType keyType() {
        return this.keyType;
    }

    /**
     * Set the access key to regenerate. Possible values include: 'PrimaryKey', 'SecondaryKey'.
     *
     * @param keyType the keyType value to set
     * @return the RegenerateAccessKeyParameters object itself.
     */
    public RegenerateAccessKeyParameters withKeyType(KeyType keyType) {
        this.keyType = keyType;
        return this;
    }

    /**
     * Get optional. If the key value is provided, this is set to key type, or autogenerated key value set for key type.
     *
     * @return the key value
     */
    public String key() {
        return this.key;
    }

    /**
     * Set optional. If the key value is provided, this is set to key type, or autogenerated key value set for key type.
     *
     * @param key the key value to set
     * @return the RegenerateAccessKeyParameters object itself.
     */
    public RegenerateAccessKeyParameters withKey(String key) {
        this.key = key;
        return this;
    }

}