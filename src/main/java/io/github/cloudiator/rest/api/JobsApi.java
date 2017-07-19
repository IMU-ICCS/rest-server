package io.github.cloudiator.rest.api;

import io.github.cloudiator.rest.model.Error;
import io.github.cloudiator.rest.model.Job;

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

@Api(value = "jobs", description = "the jobs API")
public interface JobsApi {

    @ApiOperation(value = "", notes = "Creates a new job", response = Job.class, tags={ "job", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK ", response = Job.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Job.class),
        @ApiResponse(code = 401, message = "Authorization for this action is missing", response = Job.class),
        @ApiResponse(code = 403, message = "Forbidden action", response = Job.class),
        @ApiResponse(code = 404, message = "Item not found", response = Job.class),
        @ApiResponse(code = 500, message = "An unexpected Error occured", response = Job.class),
        @ApiResponse(code = 504, message = "Server temporary not available", response = Job.class) })
    
    @RequestMapping(value = "/jobs",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Job> addJob(@ApiParam(value = "Job to be created. " ,required=true )  @Valid @RequestBody Job job);


    @ApiOperation(value = "", notes = "Returns all jobs visible to the user ", response = Job.class, responseContainer = "List", tags={ "job", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK ", response = Job.class),
        @ApiResponse(code = 401, message = "Authorization for this action is missing", response = Job.class),
        @ApiResponse(code = 403, message = "Forbidden action", response = Job.class),
        @ApiResponse(code = 500, message = "An unexpected Error occured", response = Job.class),
        @ApiResponse(code = 504, message = "Server temporary not available", response = Job.class) })
    
    @RequestMapping(value = "/jobs",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Job>> findJobs();

}
