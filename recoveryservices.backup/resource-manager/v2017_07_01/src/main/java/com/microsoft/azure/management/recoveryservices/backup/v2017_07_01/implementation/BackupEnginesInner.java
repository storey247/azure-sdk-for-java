/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in BackupEngines.
 */
public class BackupEnginesInner {
    /** The Retrofit service to perform REST calls. */
    private BackupEnginesService service;
    /** The service client containing this operation class. */
    private RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of BackupEnginesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BackupEnginesInner(Retrofit retrofit, RecoveryServicesBackupClientImpl client) {
        this.service = retrofit.create(BackupEnginesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BackupEngines to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BackupEnginesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupEngines list" })
        @GET("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupEngines")
        Observable<Response<ResponseBody>> list(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Query("$filter") String filter, @Query("$skipToken") String skipToken, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupEngines get" })
        @GET("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupEngines/{backupEngineName}")
        Observable<Response<ResponseBody>> get(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("backupEngineName") String backupEngineName, @Query("api-version") String apiVersion, @Query("$filter") String filter, @Query("$skipToken") String skipToken, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupEngines listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Backup management servers registered to Recovery Services Vault. Returns a pageable list of servers.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;BackupEngineBaseResourceInner&gt; object if successful.
     */
    public PagedList<BackupEngineBaseResourceInner> list(final String vaultName, final String resourceGroupName) {
        ServiceResponse<Page<BackupEngineBaseResourceInner>> response = listSinglePageAsync(vaultName, resourceGroupName).toBlocking().single();
        return new PagedList<BackupEngineBaseResourceInner>(response.body()) {
            @Override
            public Page<BackupEngineBaseResourceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Backup management servers registered to Recovery Services Vault. Returns a pageable list of servers.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<BackupEngineBaseResourceInner>> listAsync(final String vaultName, final String resourceGroupName, final ListOperationCallback<BackupEngineBaseResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(vaultName, resourceGroupName),
            new Func1<String, Observable<ServiceResponse<Page<BackupEngineBaseResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<BackupEngineBaseResourceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Backup management servers registered to Recovery Services Vault. Returns a pageable list of servers.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;BackupEngineBaseResourceInner&gt; object
     */
    public Observable<Page<BackupEngineBaseResourceInner>> listAsync(final String vaultName, final String resourceGroupName) {
        return listWithServiceResponseAsync(vaultName, resourceGroupName)
            .map(new Func1<ServiceResponse<Page<BackupEngineBaseResourceInner>>, Page<BackupEngineBaseResourceInner>>() {
                @Override
                public Page<BackupEngineBaseResourceInner> call(ServiceResponse<Page<BackupEngineBaseResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Backup management servers registered to Recovery Services Vault. Returns a pageable list of servers.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;BackupEngineBaseResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<BackupEngineBaseResourceInner>>> listWithServiceResponseAsync(final String vaultName, final String resourceGroupName) {
        return listSinglePageAsync(vaultName, resourceGroupName)
            .concatMap(new Func1<ServiceResponse<Page<BackupEngineBaseResourceInner>>, Observable<ServiceResponse<Page<BackupEngineBaseResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<BackupEngineBaseResourceInner>>> call(ServiceResponse<Page<BackupEngineBaseResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Backup management servers registered to Recovery Services Vault. Returns a pageable list of servers.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;BackupEngineBaseResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<BackupEngineBaseResourceInner>>> listSinglePageAsync(final String vaultName, final String resourceGroupName) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2016-12-01";
        final String filter = null;
        final String skipToken = null;
        return service.list(vaultName, resourceGroupName, this.client.subscriptionId(), apiVersion, filter, skipToken, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<BackupEngineBaseResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<BackupEngineBaseResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<BackupEngineBaseResourceInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<BackupEngineBaseResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Backup management servers registered to Recovery Services Vault. Returns a pageable list of servers.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;BackupEngineBaseResourceInner&gt; object if successful.
     */
    public PagedList<BackupEngineBaseResourceInner> list(final String vaultName, final String resourceGroupName, final String filter, final String skipToken) {
        ServiceResponse<Page<BackupEngineBaseResourceInner>> response = listSinglePageAsync(vaultName, resourceGroupName, filter, skipToken).toBlocking().single();
        return new PagedList<BackupEngineBaseResourceInner>(response.body()) {
            @Override
            public Page<BackupEngineBaseResourceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Backup management servers registered to Recovery Services Vault. Returns a pageable list of servers.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<BackupEngineBaseResourceInner>> listAsync(final String vaultName, final String resourceGroupName, final String filter, final String skipToken, final ListOperationCallback<BackupEngineBaseResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(vaultName, resourceGroupName, filter, skipToken),
            new Func1<String, Observable<ServiceResponse<Page<BackupEngineBaseResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<BackupEngineBaseResourceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Backup management servers registered to Recovery Services Vault. Returns a pageable list of servers.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;BackupEngineBaseResourceInner&gt; object
     */
    public Observable<Page<BackupEngineBaseResourceInner>> listAsync(final String vaultName, final String resourceGroupName, final String filter, final String skipToken) {
        return listWithServiceResponseAsync(vaultName, resourceGroupName, filter, skipToken)
            .map(new Func1<ServiceResponse<Page<BackupEngineBaseResourceInner>>, Page<BackupEngineBaseResourceInner>>() {
                @Override
                public Page<BackupEngineBaseResourceInner> call(ServiceResponse<Page<BackupEngineBaseResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Backup management servers registered to Recovery Services Vault. Returns a pageable list of servers.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;BackupEngineBaseResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<BackupEngineBaseResourceInner>>> listWithServiceResponseAsync(final String vaultName, final String resourceGroupName, final String filter, final String skipToken) {
        return listSinglePageAsync(vaultName, resourceGroupName, filter, skipToken)
            .concatMap(new Func1<ServiceResponse<Page<BackupEngineBaseResourceInner>>, Observable<ServiceResponse<Page<BackupEngineBaseResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<BackupEngineBaseResourceInner>>> call(ServiceResponse<Page<BackupEngineBaseResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Backup management servers registered to Recovery Services Vault. Returns a pageable list of servers.
     *
    ServiceResponse<PageImpl<BackupEngineBaseResourceInner>> * @param vaultName The name of the recovery services vault.
    ServiceResponse<PageImpl<BackupEngineBaseResourceInner>> * @param resourceGroupName The name of the resource group where the recovery services vault is present.
    ServiceResponse<PageImpl<BackupEngineBaseResourceInner>> * @param filter OData filter options.
    ServiceResponse<PageImpl<BackupEngineBaseResourceInner>> * @param skipToken skipToken Filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;BackupEngineBaseResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<BackupEngineBaseResourceInner>>> listSinglePageAsync(final String vaultName, final String resourceGroupName, final String filter, final String skipToken) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2016-12-01";
        return service.list(vaultName, resourceGroupName, this.client.subscriptionId(), apiVersion, filter, skipToken, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<BackupEngineBaseResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<BackupEngineBaseResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<BackupEngineBaseResourceInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<BackupEngineBaseResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<BackupEngineBaseResourceInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<BackupEngineBaseResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<BackupEngineBaseResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Returns backup management server registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param backupEngineName Name of the backup management server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BackupEngineBaseResourceInner object if successful.
     */
    public BackupEngineBaseResourceInner get(String vaultName, String resourceGroupName, String backupEngineName) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName, backupEngineName).toBlocking().single().body();
    }

    /**
     * Returns backup management server registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param backupEngineName Name of the backup management server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BackupEngineBaseResourceInner> getAsync(String vaultName, String resourceGroupName, String backupEngineName, final ServiceCallback<BackupEngineBaseResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(vaultName, resourceGroupName, backupEngineName), serviceCallback);
    }

    /**
     * Returns backup management server registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param backupEngineName Name of the backup management server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BackupEngineBaseResourceInner object
     */
    public Observable<BackupEngineBaseResourceInner> getAsync(String vaultName, String resourceGroupName, String backupEngineName) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName, backupEngineName).map(new Func1<ServiceResponse<BackupEngineBaseResourceInner>, BackupEngineBaseResourceInner>() {
            @Override
            public BackupEngineBaseResourceInner call(ServiceResponse<BackupEngineBaseResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Returns backup management server registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param backupEngineName Name of the backup management server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BackupEngineBaseResourceInner object
     */
    public Observable<ServiceResponse<BackupEngineBaseResourceInner>> getWithServiceResponseAsync(String vaultName, String resourceGroupName, String backupEngineName) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (backupEngineName == null) {
            throw new IllegalArgumentException("Parameter backupEngineName is required and cannot be null.");
        }
        final String apiVersion = "2016-12-01";
        final String filter = null;
        final String skipToken = null;
        return service.get(vaultName, resourceGroupName, this.client.subscriptionId(), backupEngineName, apiVersion, filter, skipToken, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BackupEngineBaseResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<BackupEngineBaseResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BackupEngineBaseResourceInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Returns backup management server registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param backupEngineName Name of the backup management server.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BackupEngineBaseResourceInner object if successful.
     */
    public BackupEngineBaseResourceInner get(String vaultName, String resourceGroupName, String backupEngineName, String filter, String skipToken) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName, backupEngineName, filter, skipToken).toBlocking().single().body();
    }

    /**
     * Returns backup management server registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param backupEngineName Name of the backup management server.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BackupEngineBaseResourceInner> getAsync(String vaultName, String resourceGroupName, String backupEngineName, String filter, String skipToken, final ServiceCallback<BackupEngineBaseResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(vaultName, resourceGroupName, backupEngineName, filter, skipToken), serviceCallback);
    }

    /**
     * Returns backup management server registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param backupEngineName Name of the backup management server.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BackupEngineBaseResourceInner object
     */
    public Observable<BackupEngineBaseResourceInner> getAsync(String vaultName, String resourceGroupName, String backupEngineName, String filter, String skipToken) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName, backupEngineName, filter, skipToken).map(new Func1<ServiceResponse<BackupEngineBaseResourceInner>, BackupEngineBaseResourceInner>() {
            @Override
            public BackupEngineBaseResourceInner call(ServiceResponse<BackupEngineBaseResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Returns backup management server registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param backupEngineName Name of the backup management server.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BackupEngineBaseResourceInner object
     */
    public Observable<ServiceResponse<BackupEngineBaseResourceInner>> getWithServiceResponseAsync(String vaultName, String resourceGroupName, String backupEngineName, String filter, String skipToken) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (backupEngineName == null) {
            throw new IllegalArgumentException("Parameter backupEngineName is required and cannot be null.");
        }
        final String apiVersion = "2016-12-01";
        return service.get(vaultName, resourceGroupName, this.client.subscriptionId(), backupEngineName, apiVersion, filter, skipToken, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BackupEngineBaseResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<BackupEngineBaseResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BackupEngineBaseResourceInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BackupEngineBaseResourceInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BackupEngineBaseResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BackupEngineBaseResourceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Backup management servers registered to Recovery Services Vault. Returns a pageable list of servers.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;BackupEngineBaseResourceInner&gt; object if successful.
     */
    public PagedList<BackupEngineBaseResourceInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<BackupEngineBaseResourceInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<BackupEngineBaseResourceInner>(response.body()) {
            @Override
            public Page<BackupEngineBaseResourceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Backup management servers registered to Recovery Services Vault. Returns a pageable list of servers.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<BackupEngineBaseResourceInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<BackupEngineBaseResourceInner>> serviceFuture, final ListOperationCallback<BackupEngineBaseResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<BackupEngineBaseResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<BackupEngineBaseResourceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Backup management servers registered to Recovery Services Vault. Returns a pageable list of servers.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;BackupEngineBaseResourceInner&gt; object
     */
    public Observable<Page<BackupEngineBaseResourceInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<BackupEngineBaseResourceInner>>, Page<BackupEngineBaseResourceInner>>() {
                @Override
                public Page<BackupEngineBaseResourceInner> call(ServiceResponse<Page<BackupEngineBaseResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Backup management servers registered to Recovery Services Vault. Returns a pageable list of servers.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;BackupEngineBaseResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<BackupEngineBaseResourceInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<BackupEngineBaseResourceInner>>, Observable<ServiceResponse<Page<BackupEngineBaseResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<BackupEngineBaseResourceInner>>> call(ServiceResponse<Page<BackupEngineBaseResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Backup management servers registered to Recovery Services Vault. Returns a pageable list of servers.
     *
    ServiceResponse<PageImpl<BackupEngineBaseResourceInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;BackupEngineBaseResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<BackupEngineBaseResourceInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<BackupEngineBaseResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<BackupEngineBaseResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<BackupEngineBaseResourceInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<BackupEngineBaseResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<BackupEngineBaseResourceInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<BackupEngineBaseResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<BackupEngineBaseResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
