/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.0-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.github.cloudiator.rest.api;

import io.github.cloudiator.rest.model.Process;
import io.github.cloudiator.rest.model.ProcessNew;
import io.github.cloudiator.rest.model.Queue;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Api(value = "process", description = "the process API")
public interface ProcessApi {

    @ApiOperation(value = "", nickname = "createProcess", notes = "Creates a new process ", response = Queue.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "process", })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "ACCEPTED", response = Queue.class) })
    @RequestMapping(value = "/process",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Queue> createProcess(@ApiParam(value = "Process to be created " ,required=true )  @Valid @RequestBody ProcessNew process);


    @ApiOperation(value = "", nickname = "deleteProcess", notes = "Deletes the process corresponding to the given id. ", response = Queue.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "process", })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "ACCEPTED", response = Queue.class) })
    @RequestMapping(value = "/process/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Queue> deleteProcess(@ApiParam(value = "Unique identifier of the resource",required=true) @PathVariable("id") String id);


    @ApiOperation(value = "", nickname = "findProcess", notes = "Finds the process corresponding to the given id. ", response = Process.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "process", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Process.class) })
    @RequestMapping(value = "/process/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Process> findProcess(@ApiParam(value = "Unique identifier of the resource",required=true) @PathVariable("id") String id);


    @ApiOperation(value = "", nickname = "getProcesses", notes = "Retrieves all process of the current user matching the parameters. ", response = Process.class, responseContainer = "List", authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "process", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Process.class, responseContainer = "List") })
    @RequestMapping(value = "/process",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Process>> getProcesses(@ApiParam(value = "Id of the schedule. ") @Valid @RequestParam(value = "scheduleId", required = false) String scheduleId);

}
