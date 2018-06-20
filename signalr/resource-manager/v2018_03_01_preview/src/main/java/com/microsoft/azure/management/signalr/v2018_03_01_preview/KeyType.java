/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2018_03_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for KeyType.
 */
public final class KeyType extends ExpandableStringEnum<KeyType> {
    /** Static value Primary for KeyType. */
    public static final KeyType PRIMARY = fromString("Primary");

    /** Static value Secondary for KeyType. */
    public static final KeyType SECONDARY = fromString("Secondary");

    /**
     * Creates or finds a KeyType from its string representation.
     * @param name a name to look for
     * @return the corresponding KeyType
     */
    @JsonCreator
    public static KeyType fromString(String name) {
        return fromString(name, KeyType.class);
    }

    /**
     * @return known KeyType values
     */
    public static Collection<KeyType> values() {
        return values(KeyType.class);
    }
}