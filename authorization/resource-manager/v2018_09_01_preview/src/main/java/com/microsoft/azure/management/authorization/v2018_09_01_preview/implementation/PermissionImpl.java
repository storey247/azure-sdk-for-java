/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.authorization.v2018_09_01_preview.implementation;

import com.microsoft.azure.management.authorization.v2018_09_01_preview.Permission;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class PermissionImpl extends WrapperImpl<PermissionInner> implements Permission {
    private final AuthorizationManager manager;
    PermissionImpl(PermissionInner inner, AuthorizationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AuthorizationManager manager() {
        return this.manager;
    }

    @Override
    public List<String> actions() {
        return this.inner().actions();
    }

    @Override
    public List<String> dataActions() {
        return this.inner().dataActions();
    }

    @Override
    public List<String> notActions() {
        return this.inner().notActions();
    }

    @Override
    public List<String> notDataActions() {
        return this.inner().notDataActions();
    }

}
