/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_10_01_preview.implementation;

import com.microsoft.azure.management.sql.v2017_10_01_preview.InstanceFailoverGroup;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.sql.v2017_10_01_preview.InstanceFailoverGroupReadWriteEndpoint;
import com.microsoft.azure.management.sql.v2017_10_01_preview.InstanceFailoverGroupReadOnlyEndpoint;
import com.microsoft.azure.management.sql.v2017_10_01_preview.InstanceFailoverGroupReplicationRole;
import java.util.List;
import com.microsoft.azure.management.sql.v2017_10_01_preview.PartnerRegionInfo;
import com.microsoft.azure.management.sql.v2017_10_01_preview.ManagedInstancePairInfo;

class InstanceFailoverGroupImpl extends CreatableUpdatableImpl<InstanceFailoverGroup, InstanceFailoverGroupInner, InstanceFailoverGroupImpl> implements InstanceFailoverGroup, InstanceFailoverGroup.Definition, InstanceFailoverGroup.Update {
    private final SqlManager manager;
    private String resourceGroupName;
    private String locationName;
    private String failoverGroupName;

    InstanceFailoverGroupImpl(String name, SqlManager manager) {
        super(name, new InstanceFailoverGroupInner());
        this.manager = manager;
        // Set resource name
        this.failoverGroupName = name;
        //
    }

    InstanceFailoverGroupImpl(InstanceFailoverGroupInner inner, SqlManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.failoverGroupName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.locationName = IdParsingUtils.getValueFromIdByName(inner.id(), "locations");
        this.failoverGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "instanceFailoverGroups");
        //
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<InstanceFailoverGroup> createResourceAsync() {
        InstanceFailoverGroupsInner client = this.manager().inner().instanceFailoverGroups();
        return client.createOrUpdateAsync(this.resourceGroupName, this.locationName, this.failoverGroupName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<InstanceFailoverGroup> updateResourceAsync() {
        InstanceFailoverGroupsInner client = this.manager().inner().instanceFailoverGroups();
        return client.createOrUpdateAsync(this.resourceGroupName, this.locationName, this.failoverGroupName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<InstanceFailoverGroupInner> getInnerAsync() {
        InstanceFailoverGroupsInner client = this.manager().inner().instanceFailoverGroups();
        return client.getAsync(this.resourceGroupName, this.locationName, this.failoverGroupName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public List<ManagedInstancePairInfo> managedInstancePairs() {
        return this.inner().managedInstancePairs();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<PartnerRegionInfo> partnerRegions() {
        return this.inner().partnerRegions();
    }

    @Override
    public InstanceFailoverGroupReadOnlyEndpoint readOnlyEndpoint() {
        return this.inner().readOnlyEndpoint();
    }

    @Override
    public InstanceFailoverGroupReadWriteEndpoint readWriteEndpoint() {
        return this.inner().readWriteEndpoint();
    }

    @Override
    public InstanceFailoverGroupReplicationRole replicationRole() {
        return this.inner().replicationRole();
    }

    @Override
    public String replicationState() {
        return this.inner().replicationState();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public InstanceFailoverGroupImpl withExistingLocation(String resourceGroupName, String locationName) {
        this.resourceGroupName = resourceGroupName;
        this.locationName = locationName;
        return this;
    }

    @Override
    public InstanceFailoverGroupImpl withManagedInstancePairs(List<ManagedInstancePairInfo> managedInstancePairs) {
        this.inner().withManagedInstancePairs(managedInstancePairs);
        return this;
    }

    @Override
    public InstanceFailoverGroupImpl withPartnerRegions(List<PartnerRegionInfo> partnerRegions) {
        this.inner().withPartnerRegions(partnerRegions);
        return this;
    }

    @Override
    public InstanceFailoverGroupImpl withReadWriteEndpoint(InstanceFailoverGroupReadWriteEndpoint readWriteEndpoint) {
        this.inner().withReadWriteEndpoint(readWriteEndpoint);
        return this;
    }

    @Override
    public InstanceFailoverGroupImpl withReadOnlyEndpoint(InstanceFailoverGroupReadOnlyEndpoint readOnlyEndpoint) {
        this.inner().withReadOnlyEndpoint(readOnlyEndpoint);
        return this;
    }

}