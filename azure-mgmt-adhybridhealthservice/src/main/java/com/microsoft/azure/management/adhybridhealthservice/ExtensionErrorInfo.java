/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The extension error details.
 */
public class ExtensionErrorInfo {
    /**
     * The extension name.
     */
    @JsonProperty(value = "extensionName")
    private String extensionName;

    /**
     * The extension context.
     */
    @JsonProperty(value = "extensionContext")
    private String extensionContext;

    /**
     * The call stack for the error.
     */
    @JsonProperty(value = "callStack")
    private String callStack;

    /**
     * Get the extension name.
     *
     * @return the extensionName value
     */
    public String extensionName() {
        return this.extensionName;
    }

    /**
     * Set the extension name.
     *
     * @param extensionName the extensionName value to set
     * @return the ExtensionErrorInfo object itself.
     */
    public ExtensionErrorInfo withExtensionName(String extensionName) {
        this.extensionName = extensionName;
        return this;
    }

    /**
     * Get the extension context.
     *
     * @return the extensionContext value
     */
    public String extensionContext() {
        return this.extensionContext;
    }

    /**
     * Set the extension context.
     *
     * @param extensionContext the extensionContext value to set
     * @return the ExtensionErrorInfo object itself.
     */
    public ExtensionErrorInfo withExtensionContext(String extensionContext) {
        this.extensionContext = extensionContext;
        return this;
    }

    /**
     * Get the call stack for the error.
     *
     * @return the callStack value
     */
    public String callStack() {
        return this.callStack;
    }

    /**
     * Set the call stack for the error.
     *
     * @param callStack the callStack value to set
     * @return the ExtensionErrorInfo object itself.
     */
    public ExtensionErrorInfo withCallStack(String callStack) {
        this.callStack = callStack;
        return this;
    }

}