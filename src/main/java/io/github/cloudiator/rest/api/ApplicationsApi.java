package io.github.cloudiator.rest.api;

import io.github.cloudiator.rest.model.Application;

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

@Api(value = "applications", description = "the applications API")
public interface ApplicationsApi {

    @ApiOperation(value = "", notes = "Creates a new application", response = Application.class, tags={ "application", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK ", response = Application.class) })
    
    @RequestMapping(value = "/applications",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Application> addApplication(@ApiParam(value = "Application to be created. " ,required=true )  @Valid @RequestBody Application application);


    @ApiOperation(value = "", notes = "Returns all applications visible to the user ", response = Application.class, responseContainer = "List", tags={ "application", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK ", response = Application.class) })
    
    @RequestMapping(value = "/applications",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Application>> findApplications();

}