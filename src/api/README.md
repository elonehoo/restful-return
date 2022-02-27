# API Reference

REST APIs use the Status-Line part of an HTTP response message to inform clients of their request’s overarching result. [RFC 2616](https://www.ietf.org/rfc/rfc2616.txt) defines the [Status-Line syntax](https://www.w3.org/Protocols/rfc2616/rfc2616-sec6.html#sec6.1) as shown below:

## 1xx Informational

Communicates transfer protocol-level information.

### CONTINUE

**Status Code**: 100 <br />
**Example**: `Result.continues();`

An interim response. Indicates to the client that the initial part of the request has been received and has not yet been rejected by the server. The client SHOULD continue by sending the remainder of the request or, if the request has already been completed, ignore this response. The server MUST send a final response after the request has been completed. 

### SWITCHING_PROTOCOLS

**Status Code**: 101 <br />
**Example**: `Result.switchingProtocols();`

Sent in response to an [Upgrade](https://developer.mozilla.org/en-US/docs/Web/HTTP/Protocol_upgrade_mechanism) request header from the client, and indicates the protocol the server is switching to.

### PROCESSING

**Status Code**: 102 <br />
**Example**: `Result.processing();`

Indicates that the server has received and is processing the request, but no response is available yet.

### CHECKPOINT

**Status Code**: 103 <br />
**Example**: `Result.checkpoint();`

Primarily intended to be used with the Link header. It suggests the user agent start preloading the resources while the server prepares a final response.

## 2xx Success

Indicates that the client’s request was accepted successfully.

### OK

**Status Code**: 200 <br />
**Example**: `Result.success();`

Indicates that the request has succeeded.

### CREATED

**Status Code**: 201 <br />
**Example**: `Result.created();`

Indicates that the request has succeeded and a new resource has been created as a result.

### ACCEPTED

**Status Code**: 202 <br />
**Example**: `Result.acceptably();`

Indicates that the request has been received but not completed yet. It is typically used in log running requests and batch processing.


### NON_AUTHORITATIVE_INFORMATION

**Status Code**: 203 <br />
**Example**: `Result.nonAuthoritativeInformation();`

Indicates that the returned metainformation in the entity-header is not the definitive set as available from the origin server, but is gathered from a local or a third-party copy. The set presented MAY be a subset or superset of the original version.

### NO_CONTENT

**Status Code**: 204 <br />
**Example**: `Result.noContents();`

The server has fulfilled the request but does not need to return a response body. The server may return the updated meta information.

### RESET_CONTENT

**Status Code**: 205 <br />
**Example**: `Result.resetContent();`

Indicates the client to reset the document which sent this request.

### PARTIAL_CONTENT

**Status Code**: 206 <br />
**Example**: `Result.partialContent();`

It is used when the Range header is sent from the client to request only part of a resource.

### MULTI_STATUS

**Status Code**: 207 <br />
**Example**: `Result.multiStatus();`

An indicator to a client that multiple operations happened, and that the status for each operation can be found in the body of the response.

### ALREADY_REPORTED

**Status Code**: 208 <br />
**Example**: `Result.alreadyReported();`

Allows a client to tell the server that the same resource (with the same binding) was mentioned earlier. It never appears as a true HTTP response code in the status line, and only appears in bodies.

### IM_USED

**Status Code**: 226 <br />
**Example**: `Result.imUsed();`

The server has fulfilled a GET request for the resource, and the response is a representation of the result of one or more instance-manipulations applied to the current instance.

## 3xx Redirection 

Indicates that the client must take some additional action in order to complete their request.

### MULTIPLE_CHOICES

**Status Code**: 300 <br />
**Example**: `Result.multipleChoices();`

The request has more than one possible response. The user-agent or user should choose one of them.

### MOVED_PERMANENTLY

**Status Code**: 301 <br />
**Example**: `Result.movedPermanently();`

The URL of the requested resource has been changed permanently. The new URL is given by the Location header field in the response. This response is cacheable unless indicated otherwise.

### FOUND

**Status Code**: 302 <br />
**Example**: `Result.found();`

The URL of the requested resource has been changed temporarily. The new URL is given by the Location field in the response. This response is only cacheable if indicated by a Cache-Control or Expires header field.

### SEE_OTHER

**Status Code**: 303 <br />
**Example**: `Result.seeOther();`

The response can be found under a different URI and SHOULD be retrieved using a GET method on that resource.

### NOT_MODIFIED

**Status Code**: 304 <br />
**Example**: `Result.notModified();`

Indicates the client that the response has not been modified, so the client can continue to use the same cached version of the response.

### TEMPORARY_REDIRECT

**Status Code**: 307 <br />
**Example**: `Result.temporaryRedirect();`

Indicates the client to get the requested resource at another URI with same method that was used in the prior request. It is similar to 302 Found with one exception that the same HTTP method will be used that was used in the prior request.

### PERMANENT_REDIRECT

**Status Code**: 308 <br />
**Example**: `Result.permanentRedirect();`

Indicates that the resource is now permanently located at another URI, specified by the Location header. It is similar to 301 Moved Permanently with one exception that the same HTTP method will be used that was used in the prior request.

## 4xx Client Error

This category of error status codes points the finger at clients.

### BAD_REQUEST

**Status Code**: 400 <br />
**Example**: `Result.badRequests();`

The request could not be understood by the server due to incorrect syntax. The client SHOULD NOT repeat the request without modifications.

### UNAUTHORIZED

**Status Code**: 401 <br />
**Example**: `Result.unauthorized();`

Indicates that the request requires user authentication information. The client MAY repeat the request with a suitable Authorization header field.

### PAYMENT_REQUIRED

**Status Code**: 402 <br />
**Example**: `Result.paymentRequired();`

Reserved for future use. It is aimed for using in the digital payment systems.

### FORBIDDEN

**Status Code**: 403 <br />
**Example**: `Result.forbidden();`

Unauthorized request. The client does not have access rights to the content. Unlike 401, the client’s identity is known to the server.

### NOT_FOUND

**Status Code**: 404 <br />
**Example**: `Result.notFounds();`

The server can not find the requested resource.

### METHOD_NOT_ALLOWED

**Status Code**: 405 <br />
**Example**: `Result.methodNotAllowed();`

The request HTTP method is known by the server but has been disabled and cannot be used for that resource.

### NOT_ACCEPTABLE

**Status Code**: 406 <br />
**Example**: `Result.notAcceptable();`

The server doesn’t find any content that conforms to the criteria given by the user agent in the Accept header sent in the request.

### PROXY_AUTHENTICATION_REQUIRED

**Status Code**: 407 <br />
**Example**: `Result.proxyAuthenticationRequired();`

Indicates that the client must first authenticate itself with the proxy.

### REQUEST_TIMEOUT

**Status Code**: 408 <br />
**Example**: `Result.requestTimeout();`

Indicates that the server did not receive a complete request from the client within the server’s allotted timeout period.

### CONFLICT

**Status Code**: 409 <br />
**Example**: `Result.conflict();`

The request could not be completed due to a conflict with the current state of the resource.

### GONE

**Status Code**: 410 <br />
**Example**: `Result.gone();`

The requested resource is no longer available at the server.

### LENGTH_REQUIRED

**Status Code**: 411 <br />
**Example**: `Result.lengthRequired();`

The server refuses to accept the request without a defined Content- Length. The client MAY repeat the request if it adds a valid Content-Length header field.

### PRECONDITION_FAILED

**Status Code**: 412 <br />
**Example**: `Result.preconditionFailed();`

The client has indicated preconditions in its headers which the server does not meet.

### PAYLOAD_TOO_LARGE

**Status Code**: 413 <br />
**Example**: `Result.payloadTooLarge();`

Request entity is larger than limits defined by server.

### URI_TOO_LONG

**Status Code**: 414 <br />
**Example**: `Result.uriTooLong();`

The URI requested by the client is longer than the server can interpret.

### UNSUPPORTED_MEDIA_TYPE

**Status Code**: 415 <br />
**Example**: `Result.unsupportedMediaType();`

The media-type in Content-type of the request is not supported by the server.

### REQUESTED_RANGE_NOT_SATISFIABLE

**Status Code**: 416 <br />
**Example**: `Result.requestedRangeNotSatisfiable();`

The range specified by the Range header field in the request can’t be fulfilled.

### EXPECTATION_FAILED

**Status Code**: 417 <br />
**Example**: `Result.expectationFailed();`

The expectation indicated by the Expect request header field can’t be met by the server.

### I_AM_A_TEAPOT

**Status Code**: 418 <br />
**Example**: `Result.iAmATeapot()`;

It was defined as April’s lool joke and is not expected to be implemented by actual HTTP servers. ([RFC 2324](https://tools.ietf.org/html/rfc2324))

### UNPROCESSABLE_ENTITY

**Status Code**: 422 <br />
**Example**: `Result.unprocessableSubstance()`;

The server understands the content type and syntax of the request entity, but still server is unable to process the request for some reason.

### LOCKED

**Status Code**: 423 <br />
**Example**: `Result.locked()`;

The resource that is being accessed is locked.

### FAILED_DEPENDENCY

**Status Code**: 424 <br />
**Example**: `Result.failedDependency()`;

The request failed due to failure of a previous request.

### UPGRADE_REQUIRED

**Status Code**: 426 <br />
**Example**: `Result.upgradeRequired()`;

The server refuses to perform the request. The server will process the request after the client upgrades to a different protocol.

### PRECONDITION_REQUIRED

**Status Code**: 428 <br />
**Example**: `Result.preconditionRequired()`;

The origin server requires the request to be conditional.

### TOO_MANY_REQUESTS

**Status Code**: 429 <br />
**Example**: `Result.tooManyRequests()`;

The user has sent too many requests in a given amount of time (“rate limiting”).

### REQUEST_HEADER_FIELDS_TOO_LARGE

**Status Code**: 431 <br />
**Example**: `Result.requestHeaderFieldsTooLarge()`;

The server is unwilling to process the request because its header fields are too large.

### UNAVAILABLE_FOR_LEGAL_REASONS

**Status Code**: 451 <br />
**Example**: `Result.unavailableForLegalReasons()`;

The user-agent requested a resource that cannot legally be provided.

## 5xx Server Error

### INTERNAL_SERVER_ERROR

**Status Code**: 500 <br />
**Example**: `Result.internalServerError()`;

The server encountered an unexpected condition that prevented it from fulfilling the request.

### NOT_IMPLEMENTED

**Status Code**: 501 <br />
**Example**: `Result.notImplemented()`;

The HTTP method is not supported by the server and cannot be handled.

### BAD_GATEWAY

**Status Code**: 502 <br />
**Example**: `Result.badGateway()`;

The server got an invalid response while working as a gateway to get the response needed to handle the request.

### SERVICE_UNAVAILABLE

**Status Code**: 503 <br />
**Example**: `Result.serviceUnavailable()`;

The server is not ready to handle the request.

### GATEWAY_TIMEOUT

**Status Code**: 504 <br />
**Example**: `Result.gatewayTimeout()`;

The server is acting as a gateway and cannot get a response in time for a request.

### HTTP_VERSION_NOT_SUPPORTED

**Status Code**: 505 <br />
**Example**: `Result.httpVersionNotSupported()`;

The HTTP version used in the request is not supported by the server.

### VARIANT_ALSO_NEGOTIATES

**Status Code**: 506 <br />
**Example**: `Result.variantAlsoNegotiates()`;

Indicates that the server has an internal configuration error: the chosen variant resource is configured to engage in transparent content negotiation itself, and is therefore not a proper endpoint in the negotiation process.

### INSUFFICIENT_STORAGE

**Status Code**: 507 <br />
**Example**: `Result.insufficientStorage()`;

The method could not be performed on the resource because the server is unable to store the representation needed to successfully complete the request.

### LOOP_DETECTED

**Status Code**: 508 <br />
**Example**: `Result.loopDetected()`;

The server detected an infinite loop while processing the request.

### BANDWIDTH_LIMIT_EXCEEDED

**Status Code**: 509 <br />
**Example**: `Result.bandwidthLimitExceeded()`;

The method exceeds the bandwidth limit.

### NOT_EXTENDED

**Status Code**: 510 <br />
**Example**: `Result.notExtended()`;

Further extensions to the request are required for the server to fulfill it.

### NETWORK_AUTHENTICATION_REQUIRED

**Status Code**: 511 <br />
**Example**: `Result.networkAuthenticationRequired()`;

Indicates that the client needs to authenticate to gain network access.
