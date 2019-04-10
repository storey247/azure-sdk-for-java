/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_06_30;

import rx.Observable;

/**
 * Type representing ReservationsDetails.
 */
public interface ReservationsDetails {
    /**
     * Lists the reservations details for provided date range.
     *
     * @param reservationOrderId Order Id of the reservation
     * @param filter Filter reservation details by date range. The properties/UsageDate for start date and end date. The filter supports 'le' and  'ge'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReservationDetail> listByReservationOrderAsync(final String reservationOrderId, final String filter);

    /**
     * Lists the reservations details for provided date range.
     *
     * @param reservationOrderId Order Id of the reservation
     * @param reservationId Id of the reservation
     * @param filter Filter reservation details by date range. The properties/UsageDate for start date and end date. The filter supports 'le' and  'ge'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReservationDetail> listByReservationOrderAndReservationAsync(final String reservationOrderId, final String reservationId, final String filter);

}
