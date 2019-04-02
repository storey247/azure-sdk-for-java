/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_08_31;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.consumption.v2018_08_31.implementation.ForecastInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.consumption.v2018_08_31.implementation.ConsumptionManager;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Type representing Forecast.
 */
public interface Forecast extends HasInner<ForecastInner>, HasManager<ConsumptionManager> {
    /**
     * @return the charge value.
     */
    BigDecimal charge();

    /**
     * @return the chargeType value.
     */
    ChargeType chargeType();

    /**
     * @return the confidenceLevels value.
     */
    List<ForecastPropertiesConfidenceLevelsItem> confidenceLevels();

    /**
     * @return the currency value.
     */
    String currency();

    /**
     * @return the grain value.
     */
    Grain grain();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the usageDate value.
     */
    String usageDate();

}