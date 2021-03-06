# Release History

## Version 12.0.0-preview.3 (2019-09-10):
For details on the Azure SDK for Java (September 2019 Preview) release, you can refer to the [release announcement](https://aka.ms/azure-sdk-preview3-java).

This package's
[documentation](https://github.com/Azure/azure-sdk-for-java/blob/085c8570b411defff26860ef56ea189af07d3d6a/sdk/storage/azure-storage-file/README.md)
and
[samples](https://github.com/Azure/azure-sdk-for-java/tree/085c8570b411defff26860ef56ea189af07d3d6a/sdk/storage/azure-storage-file/src/samples/java/com/azure/storage/file)
demonstrate the new API.

- Added tracing telemetry on maximum overload API.
- Added generate SAS token APIs.
- Throw `StorageException` with error code when get error response from service.
- Moved `ReactorNettyClient` into a separate module as default plugin. Customer can configure a custom http client through builder.
- Throw `UnexpectedLengthException` when the upload body length does not match the input length. [GitHub #4193](https://github.com/Azure/azure-sdk-for-java/issues/4193)
- Added validation policy to check the equality of request client id between request and response.
- Added `PageFlux` on async APIs and `PageIterable` on sync APIs.
- Upgraded to use service version 2019-02-02 from 2018-11-09.
- Replaced `ByteBuf` with `ByteBuffer` and removed dependency on `Netty`.
- Added `uploadRangeFromUrl` APIs on sync and async File client.
- Added `timeout` parameter for sync APIs which allows requests throw exception if no response received within the time span.
- Added `azure-storage-common` as a dependency.
- Added the ability for the user to obtain file SMB properties and file permissions from getProperties APIs on File and Directory and download APIs on File.
- Added setProperties APIs on sync and async Directory client. Allows users to set file SMB properties and file permission.

**Breaking changes: New API design**
- Changed list responses to `PagedFlux` on async APIs and `PagedIterable` on sync APIs.
- Replaced setHttpHeaders with setProperties APIs on sync and async File client. Additionally Allows users to set file SMB properties and file permission.
- Added file smb properties and file permission parameters to create APIs on sync and async File and Directory clients.

## Version 12.0.0-preview.2 (2019-08-08)
Version 12.0.0-preview.2 is a preview of our efforts in creating a client library that is developer-friendly, idiomatic to the Java ecosystem, and as consistent across different languages and platforms as possible. The principles that guide our efforts can be found in the [Azure SDK Design Guidelines for Java](https://azuresdkspecs.z5.web.core.windows.net/JavaSpec.html).

For details on the Azure SDK for Java (August 2019 Preview) release, you can refer to the [release announcement](https://aka.ms/azure-sdk-preview2-java).

This package's
[documentation](https://github.com/Azure/azure-sdk-for-java/blob/azure-storage-file_12.0.0-preview.2/sdk/storage/azure-storage-file/README.md)
and
[samples](https://github.com/Azure/azure-sdk-for-java/tree/azure-storage-file_12.0.0-preview.2/sdk/storage/azure-storage-file/src/samples/java/com/azure/storage/file)
demonstrate the new API.

### Features included in `azure-storage-file`
- This is initial SDK release for storage file service.
- Packages scoped by functionality
    - `azure-storage-file` contains a `FileServiceClient`,  `FileServiceAsyncClient`, `ShareClient`, `ShareAsyncClient`, `DirectoryClient`, `DirectoryAsyncClient`, `FileClient` and `FileAsyncClient` for storage file operations. 
- Client instances are scoped to storage file service.
- Reactive streams support using [Project Reactor](https://projectreactor.io/).


