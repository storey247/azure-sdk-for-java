/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway.v2019_03_01.implementation;

import com.microsoft.azure.management.edgegateway.v2019_03_01.NetworkSettings;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.edgegateway.v2019_03_01.NetworkAdapter;

class NetworkSettingsImpl extends WrapperImpl<NetworkSettingsInner> implements NetworkSettings {
    private final DataBoxEdgeManager manager;
    NetworkSettingsImpl(NetworkSettingsInner inner, DataBoxEdgeManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DataBoxEdgeManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<NetworkAdapter> networkAdapters() {
        return this.inner().networkAdapters();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
