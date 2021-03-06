/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.datamigration.v2018_07_15_preview.implementation.ServicesInner;
import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.datamigration.v2018_07_15_preview.AvailableServiceSku;

/**
 * Type representing Services.
 */
public interface Services extends SupportsCreating<DataMigrationService.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<DataMigrationService>, SupportsListingByResourceGroup<DataMigrationService>, SupportsListing<DataMigrationService>, HasInner<ServicesInner> {
    /**
     * Check service health status.
     * The services resource is the top-level resource that represents the Database Migration Service. This action performs a health check and returns the status of the service and virtual machine size.
     *
     * @param groupName Name of the resource group
     * @param serviceName Name of the service
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DataMigrationServiceStatusResponse> checkStatusAsync(String groupName, String serviceName);

    /**
     * Start service.
     * The services resource is the top-level resource that represents the Database Migration Service. This action starts the service and the service can be used for data migration.
     *
     * @param groupName Name of the resource group
     * @param serviceName Name of the service
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable startAsync(String groupName, String serviceName);

    /**
     * Stop service.
     * The services resource is the top-level resource that represents the Database Migration Service. This action stops the service and the service cannot be used for data migration. The service owner won't be billed when the service is stopped.
     *
     * @param groupName Name of the resource group
     * @param serviceName Name of the service
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable stopAsync(String groupName, String serviceName);

    /**
     * Check nested resource name validity and availability.
     * This method checks whether a proposed nested resource name is valid and available.
     *
     * @param groupName Name of the resource group
     * @param serviceName Name of the service
     * @param parameters Requested name to validate
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NameAvailabilityResponse> checkChildrenNameAvailabilityAsync(String groupName, String serviceName, NameAvailabilityRequest parameters);

    /**
     * Get compatible SKUs.
     * The services resource is the top-level resource that represents the Database Migration Service. The skus action returns the list of SKUs that a service resource can be updated to.
     *
     * @param groupName Name of the resource group
     * @param serviceName Name of the service
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AvailableServiceSku> listSkusAsync(final String groupName, final String serviceName);

    /**
     * Check name validity and availability.
     * This method checks whether a proposed top-level resource name is valid and available.
     *
     * @param location The Azure region of the operation
     * @param parameters Requested name to validate
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NameAvailabilityResponse> checkNameAvailabilityAsync(String location, NameAvailabilityRequest parameters);

}
