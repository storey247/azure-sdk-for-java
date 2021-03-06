/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2018_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the server certificate details using common name.
 */
public class ServerCertificateCommonName {
    /**
     * The common name of the server certificate.
     */
    @JsonProperty(value = "certificateCommonName", required = true)
    private String certificateCommonName;

    /**
     * The issuer thumbprint of the server certificate.
     */
    @JsonProperty(value = "certificateIssuerThumbprint", required = true)
    private String certificateIssuerThumbprint;

    /**
     * Get the common name of the server certificate.
     *
     * @return the certificateCommonName value
     */
    public String certificateCommonName() {
        return this.certificateCommonName;
    }

    /**
     * Set the common name of the server certificate.
     *
     * @param certificateCommonName the certificateCommonName value to set
     * @return the ServerCertificateCommonName object itself.
     */
    public ServerCertificateCommonName withCertificateCommonName(String certificateCommonName) {
        this.certificateCommonName = certificateCommonName;
        return this;
    }

    /**
     * Get the issuer thumbprint of the server certificate.
     *
     * @return the certificateIssuerThumbprint value
     */
    public String certificateIssuerThumbprint() {
        return this.certificateIssuerThumbprint;
    }

    /**
     * Set the issuer thumbprint of the server certificate.
     *
     * @param certificateIssuerThumbprint the certificateIssuerThumbprint value to set
     * @return the ServerCertificateCommonName object itself.
     */
    public ServerCertificateCommonName withCertificateIssuerThumbprint(String certificateIssuerThumbprint) {
        this.certificateIssuerThumbprint = certificateIssuerThumbprint;
        return this;
    }

}
