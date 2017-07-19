package io.github.cloudiator.rest.api;

import io.github.cloudiator.rest.model.Error;
import io.github.cloudiator.rest.model.LongRunningRequest;

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

@Api(value = "longRunningRequests", description = "the longRunningRequests API")
public interface LongRunningRequestsApi {

    @ApiOperation(value = "", notes = "Returns all running LLRs visible to the user ", response = LongRunningRequest.class, responseContainer = "List", tags={ "longRunningRequest", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = LongRunningRequest.class),
        @ApiResponse(code = 401, message = "Authorization for this action is missing", response = LongRunningRequest.class),
        @ApiResponse(code = 403, message = "Forbidden action", response = LongRunningRequest.class),
        @ApiResponse(code = 500, message = "An unexpected Error occured", response = LongRunningRequest.class),
        @ApiResponse(code = 504, message = "Server temporary not available", response = LongRunningRequest.class) })
    
    @RequestMapping(value = "/longRunningRequests",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<LongRunningRequest>> findAllLongRunningRequest();


    @ApiOperation(value = "", notes = "Returns the LLR identified by the id parameter. ", response = LongRunningRequest.class, tags={ "longRunningRequest", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = LongRunningRequest.class),
        @ApiResponse(code = 401, message = "Authorization for this action is missing", response = LongRunningRequest.class),
        @ApiResponse(code = 403, message = "Forbidden action", response = LongRunningRequest.class),
        @ApiResponse(code = 500, message = "An unexpected Error occured", response = LongRunningRequest.class),
        @ApiResponse(code = 504, message = "Server temporary not available", response = LongRunningRequest.class) })
    
    @RequestMapping(value = "/longRunningRequests/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<LongRunningRequest> findLongRunningRequest(@ApiParam(value = "Unique identifier of the resource",required=true ) @PathVariable("id") String id);

}