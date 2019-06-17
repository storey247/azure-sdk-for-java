/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2018_03_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.managementgroups.v2018_03_01_preview.implementation.ManagementManager;
import com.microsoft.azure.management.managementgroups.v2018_03_01_preview.implementation.DescendantInfoInner;

/**
 * Type representing DescendantInfo.
 */
public interface DescendantInfo extends HasInner<DescendantInfoInner>, HasManager<ManagementManager> {
    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the parent value.
     */
    DescendantParentGroupInfo parent();

    /**
     * @return the type value.
     */
    String type();

}
