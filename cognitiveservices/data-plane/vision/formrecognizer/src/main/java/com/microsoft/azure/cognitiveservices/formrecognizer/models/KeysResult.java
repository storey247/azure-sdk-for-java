/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.formrecognizer.models;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result of an operation to get
 * the keys extracted by a model.
 */
public class KeysResult {
    /**
     * Object mapping ClusterIds to Key lists.
     */
    @JsonProperty(value = "clusters")
    private Map<String, List<String>> clusters;

    /**
     * Get object mapping ClusterIds to Key lists.
     *
     * @return the clusters value
     */
    public Map<String, List<String>> clusters() {
        return this.clusters;
    }

    /**
     * Set object mapping ClusterIds to Key lists.
     *
     * @param clusters the clusters value to set
     * @return the KeysResult object itself.
     */
    public KeysResult withClusters(Map<String, List<String>> clusters) {
        this.clusters = clusters;
        return this;
    }

}