/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.github.cloudiator.rest.api;

import io.github.cloudiator.rest.model.Error;
import io.github.cloudiator.rest.model.Task;

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

@Api(value = "tasks", description = "the tasks API")
public interface TasksApi {

    @ApiOperation(value = "", notes = "Creates a new task ", response = Task.class, tags={ "job", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK ", response = Task.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Authorization for this action is missing", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden action", response = Error.class),
        @ApiResponse(code = 404, message = "Item not found", response = Error.class),
        @ApiResponse(code = 500, message = "An unexpected Error occured", response = Error.class),
        @ApiResponse(code = 504, message = "Server temporary not available", response = Error.class) })
    
    @RequestMapping(value = "/tasks",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Task> addTask(@ApiParam(value = "Task to be created " ,required=true )  @Valid @RequestBody Task task);


    @ApiOperation(value = "", notes = "Returns all tasks visible to the user ", response = Task.class, responseContainer = "List", tags={ "job", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK ", response = Task.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Authorization for this action is missing", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden action", response = Error.class),
        @ApiResponse(code = 500, message = "An unexpected Error occured", response = Error.class),
        @ApiResponse(code = 504, message = "Server temporary not available", response = Error.class) })
    
    @RequestMapping(value = "/tasks",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Task>> findTasks();

}
