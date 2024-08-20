package com.Employee.Employee.Annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.Employee.Employee.Annotations.Common.ErrorResponseSample;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@ApiResponses(value = {
@ApiResponse(
responseCode = "400",
description = "Bad Request",
content = {
@Content(
mediaType = "application/problem+json",
schema = @Schema(
implementation = ErrorResponseSample.class
),
examples = @ExampleObject(value = "{\n" +
"    \"status\": 400,\n" +
"    \"error\": {\n" +
"        \"messages\": [\n" +
"            \"No message available\"\n" +
"        ],\n" +
"        \"attributes\": {\n" +
"            \"referenceId\": \"663e4e1eb6684f6c659470345ea88e51\",\n" +
"            \"timestamp\": \"1715359262\"\n" +
"        }\n" +
"    }\n" +
"}"
)
)
}
),
@ApiResponse(
responseCode = "401",
description = "Unauthorized",
content = {
@Content(
mediaType = "application/problem+json",
schema = @Schema(implementation = ErrorResponseSample.class),
examples = @ExampleObject(value = "{\n" +
"    \"status\": 401,\n" +
"    \"error\": {\n" +
"        \"messages\": [\n" +
"            \"Invalid credentials.\"\n" +
"        ],\n" +
"        \"attributes\": {\n" +
"            \"referenceId\": \"6657373a0ca6127253eaf513ed71bfb9\",\n" +
"            \"timestamp\": \"1716991802\"\n" +
"        }\n" +
"    }\n" +
"}"
)
)
}
),
@ApiResponse(
responseCode = "403",
description = "Forbidden",
content = {
@Content(
mediaType = "application/problem+json",
schema = @Schema(implementation = ErrorResponseSample.class),
examples = @ExampleObject(value = "{\n" +
"    \"status\": 403,\n" +
"    \"error\": {\n" +
"        \"messages\": [\n" +
"            \"Not authorized.\"\n" +
"        ],\n" +
"        \"attributes\": {\n" +
"            \"referenceId\": \"6657393c52c3eb0cee7f0f2a5e7397a4\",\n" +
"            \"timestamp\": \"1716992316\"\n" +
"        }\n" +
"    }\n" +
"}"
)
)
}
),
@ApiResponse(
responseCode = "404",
description = "Resource not found",
content = {
@Content(
mediaType = "application/problem+json",
schema = @Schema(implementation = ErrorResponseSample.class),
examples = @ExampleObject(value = "{\n" +
"    \"status\": 404,\n" +
"    \"error\": {\n" +
"        \"messages\": [\n" +
"            \"Resource not found.\"\n" +
"        ],\n" +
"        \"attributes\": {\n" +
"            \"referenceId\": \"6657393c52c3eb0cee7f0f2a5e7397a4\",\n" +
"            \"timestamp\": \"1716992316\"\n" +
"        }\n" +
"    }\n" +
"}"
)
)
}
),
@ApiResponse(
responseCode = "409",
description = "Conflict",
content = {
@Content(
mediaType = "application/problem+json",
schema = @Schema(implementation = ErrorResponseSample.class),
examples = @ExampleObject(value = "{\n" +
"    \"status\": 409,\n" +
"    \"error\": {\n" +
"        \"messages\": [\n" +
"            \"Conflict.\"\n" +
"        ],\n" +
"        \"attributes\": {\n" +
"            \"referenceId\": \"6657393c52c3eb0cee7f0f2a5e7397a4\",\n" +
"            \"timestamp\": \"1716992316\"\n" +
"        }\n" +
"    }\n" +
"}"
)
)
}
),
@ApiResponse(
responseCode = "422",
description = "Unprocessable request",
content = {
@Content(
mediaType = "application/problem+json",
schema = @Schema(implementation = ErrorResponseSample.class),
examples = @ExampleObject(value = "{\n" +
"    \"status\": 422,\n" +
"    \"error\": {\n" +
"        \"messages\": [\n" +
"            \"Unprocessable entity.\"\n" +
"        ],\n" +
"        \"attributes\": {\n" +
"            \"referenceId\": \"6657393c52c3eb0cee7f0f2a5e7397a4\",\n" +
"            \"timestamp\": \"1716992316\"\n" +
"        }\n" +
"    }\n" +
"}"
)
)
}
),
@ApiResponse(
responseCode = "429",
description = "Too many requests",
content = {
@Content(
mediaType = "application/problem+json",
schema = @Schema(implementation = ErrorResponseSample.class),
examples = @ExampleObject(value = "{\n" +
"    \"status\": 429,\n" +
"    \"error\": {\n" +
"        \"messages\": [\n" +
"            \"Too many requests.\"\n" +
"        ],\n" +
"        \"attributes\": {\n" +
"            \"referenceId\": \"6657393c52c3eb0cee7f0f2a5e7397a4\",\n" +
"            \"timestamp\": \"1716992316\"\n" +
"        }\n" +
"    }\n" +
"}"
)
)
}
),
@ApiResponse(
responseCode = "500",
description = "Internal server error",
content = {
@Content(
mediaType = "application/problem+json",
schema = @Schema(implementation = ErrorResponseSample.class),
examples = @ExampleObject(value = "{\n" +
"    \"status\": 500,\n" +
"    \"error\": {\n" +
"        \"messages\": [\n" +
"            \"Internal server error.\"\n" +
"        ],\n" +
"        \"attributes\": {\n" +
"            \"referenceId\": \"6657393c52c3eb0cee7f0f2a5e7397a4\",\n" +
"            \"timestamp\": \"1716992316\"\n" +
"        }\n" +
"    }\n" +
"}"
)
)
}
),
@ApiResponse(
description = "Other errors",
content = {
@Content(
mediaType = "application/problem+json",
schema = @Schema(implementation = ErrorResponseSample.class),
examples = @ExampleObject(value = "{\n" +
"  \"error\": {\n" +
"    \"errorCode\": \"ERROR_CODE\",\n" +
"    \"messages\": [\n" +
"      \"error message 1\"\n" +
"    ],\n" +
"    \"dataErrors\": [\n" +
"      {\n" +
"        \"code\": \"ERROR 12345\",\n" +
"        \"name\": \"Error name\",\n" +
"        \"value\": \"Some value\",\n" +
"        \"message\": \"Some message\"\n" +
"      }\n" +
"    ],\n" +
"    \"attributes\": {\n" +
"      \"additionalProp1\": \"string\",\n" +
"      \"additionalProp2\": \"string\",\n" +
"      \"additionalProp3\": \"string\"\n" +
"    }\n" +
"  }\n" +
"}"
)
)
}
)
})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface CommonResponses {

}
