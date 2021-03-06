/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for VirtualMachineCreationSource.
 */
public final class VirtualMachineCreationSource extends ExpandableStringEnum<VirtualMachineCreationSource> {
    /** Static value FromCustomImage for VirtualMachineCreationSource. */
    public static final VirtualMachineCreationSource FROM_CUSTOM_IMAGE = fromString("FromCustomImage");

    /** Static value FromGalleryImage for VirtualMachineCreationSource. */
    public static final VirtualMachineCreationSource FROM_GALLERY_IMAGE = fromString("FromGalleryImage");

    /** Static value FromSharedGalleryImage for VirtualMachineCreationSource. */
    public static final VirtualMachineCreationSource FROM_SHARED_GALLERY_IMAGE = fromString("FromSharedGalleryImage");

    /**
     * Creates or finds a VirtualMachineCreationSource from its string representation.
     * @param name a name to look for
     * @return the corresponding VirtualMachineCreationSource
     */
    @JsonCreator
    public static VirtualMachineCreationSource fromString(String name) {
        return fromString(name, VirtualMachineCreationSource.class);
    }

    /**
     * @return known VirtualMachineCreationSource values
     */
    public static Collection<VirtualMachineCreationSource> values() {
        return values(VirtualMachineCreationSource.class);
    }
}
