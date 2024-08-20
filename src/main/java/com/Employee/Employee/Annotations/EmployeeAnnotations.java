package com.Employee.Employee.Annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.Employee.Employee.Annotations.Common.EmployeeResponseSample;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
@ApiResponses(value= {@ApiResponse(
		responseCode = "200",
		description = "Successful Operation",
		content = {
		@Content(
		mediaType = "application/json",
		schema = @Schema(implementation = EmployeeResponseSample.class)
		)
		}
		)
})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface EmployeeAnnotations {

}
