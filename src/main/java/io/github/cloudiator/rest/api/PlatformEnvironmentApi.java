package io.github.cloudiator.rest.api;

import io.github.cloudiator.rest.model.Error;
import io.github.cloudiator.rest.model.PlatformEnvironment;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Api(value = "platformEnvironment", description = "the platformEnvironment API")
public interface PlatformEnvironmentApi {

    @ApiOperation(value = "", notes = "Creates a new PlatformEnvironment ", response = PlatformEnvironment.class, tags={ "platform", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK ", response = PlatformEnvironment.class),
        @ApiResponse(code = 400, message = "Bad Request", response = PlatformEnvironment.class),
        @ApiResponse(code = 401, message = "Authorization for this action is missing", response = PlatformEnvironment.class),
        @ApiResponse(code = 403, message = "Forbidden action", response = PlatformEnvironment.class),
        @ApiResponse(code = 404, message = "Item not found", response = PlatformEnvironment.class),
        @ApiResponse(code = 500, message = "An unexpected Error occured", response = PlatformEnvironment.class),
        @ApiResponse(code = 504, message = "Server temporary not available", response = PlatformEnvironment.class) })
    
    @RequestMapping(value = "/platformEnvironment",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<PlatformEnvironment> addPlatformEnvironment(@ApiParam(value = "PlatformEnvironment to be created " ,required=true )  @Valid @RequestBody PlatformEnvironment platformEnvironment);


    @ApiOperation(value = "", notes = "Returns the PlatformEnvironment identified by the id parameter. ", response = PlatformEnvironment.class, tags={ "platform", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PlatformEnvironment.class),
        @ApiResponse(code = 401, message = "Authorization for this action is missing", response = PlatformEnvironment.class),
        @ApiResponse(code = 403, message = "Forbidden action", response = PlatformEnvironment.class),
        @ApiResponse(code = 500, message = "An unexpected Error occured", response = PlatformEnvironment.class),
        @ApiResponse(code = 504, message = "Server temporary not available", response = PlatformEnvironment.class) })
    
    @RequestMapping(value = "/platformEnvironment/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<PlatformEnvironment> findPlatformEnvironment(@ApiParam(value = "Unique identifier of the resource",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "", notes = "Returns all platform environment  visible to the user ", response = PlatformEnvironment.class, responseContainer = "List", tags={ "platform", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK ", response = PlatformEnvironment.class),
        @ApiResponse(code = 401, message = "Authorization for this action is missing", response = PlatformEnvironment.class),
        @ApiResponse(code = 403, message = "Forbidden action", response = PlatformEnvironment.class),
        @ApiResponse(code = 500, message = "An unexpected Error occured", response = PlatformEnvironment.class),
        @ApiResponse(code = 504, message = "Server temporary not available", response = PlatformEnvironment.class) })
    
    @RequestMapping(value = "/platformEnvironment",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<PlatformEnvironment>> findPlatformEnvironments();

}
