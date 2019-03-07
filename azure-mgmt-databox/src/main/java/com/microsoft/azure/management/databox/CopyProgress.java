/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Copy progress.
 */
public class CopyProgress {
    /**
     * Name of the storage account where the data needs to be uploaded.
     */
    @JsonProperty(value = "storageAccountName", access = JsonProperty.Access.WRITE_ONLY)
    private String storageAccountName;

    /**
     * Id of the account where the data needs to be uploaded.
     */
    @JsonProperty(value = "accountId", access = JsonProperty.Access.WRITE_ONLY)
    private String accountId;

    /**
     * The bytesSentToCloud property.
     */
    @JsonProperty(value = "bytesSentToCloud", access = JsonProperty.Access.WRITE_ONLY)
    private String bytesSentToCloud;

    /**
     * Total amount of data to be processed by the job.
     */
    @JsonProperty(value = "totalBytesToProcess", access = JsonProperty.Access.WRITE_ONLY)
    private Long totalBytesToProcess;

    /**
     * Number of files processed by the job as of now.
     */
    @JsonProperty(value = "filesProcessed", access = JsonProperty.Access.WRITE_ONLY)
    private Long filesProcessed;

    /**
     * Total number of files to be processed by the job.
     */
    @JsonProperty(value = "totalFilesToProcess", access = JsonProperty.Access.WRITE_ONLY)
    private Long totalFilesToProcess;

    /**
     * Get name of the storage account where the data needs to be uploaded.
     *
     * @return the storageAccountName value
     */
    public String storageAccountName() {
        return this.storageAccountName;
    }

    /**
     * Get id of the account where the data needs to be uploaded.
     *
     * @return the accountId value
     */
    public String accountId() {
        return this.accountId;
    }

    /**
     * Get the bytesSentToCloud value.
     *
     * @return the bytesSentToCloud value
     */
    public String bytesSentToCloud() {
        return this.bytesSentToCloud;
    }

    /**
     * Get total amount of data to be processed by the job.
     *
     * @return the totalBytesToProcess value
     */
    public Long totalBytesToProcess() {
        return this.totalBytesToProcess;
    }

    /**
     * Get number of files processed by the job as of now.
     *
     * @return the filesProcessed value
     */
    public Long filesProcessed() {
        return this.filesProcessed;
    }

    /**
     * Get total number of files to be processed by the job.
     *
     * @return the totalFilesToProcess value
     */
    public Long totalFilesToProcess() {
        return this.totalFilesToProcess;
    }

}