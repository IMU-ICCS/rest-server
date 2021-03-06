/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.0-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.github.cloudiator.rest.api;

import io.github.cloudiator.rest.model.Error;
import io.github.cloudiator.rest.model.Node;
import io.github.cloudiator.rest.model.NodeRequest;
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

@Api(value = "node", description = "the node API")
public interface NodeApi {

    @ApiOperation(value = "", nickname = "addNode", notes = "Create a new node request", response = Queue.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "node", })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "ACCEPTED", response = Queue.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Authorization for this action is missing", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden action", response = Error.class),
        @ApiResponse(code = 404, message = "Item not found", response = Error.class),
        @ApiResponse(code = 500, message = "An unexpected Error occured", response = Error.class),
        @ApiResponse(code = 504, message = "Server temporary not available", response = Error.class) })
    @RequestMapping(value = "/node",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Queue> addNode(@ApiParam(value = "Node Request" ,required=true )  @Valid @RequestBody NodeRequest nodeRequest);


    @ApiOperation(value = "", nickname = "deleteNode", notes = "Deletes the node with the given id.", response = Queue.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "node", })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "OK ", response = Queue.class) })
    @RequestMapping(value = "/node/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Queue> deleteNode(@ApiParam(value = "Unique identifier of the resource",required=true) @PathVariable("id") String id);


    @ApiOperation(value = "", nickname = "findNodes", notes = "Retrieve all nodes the current user has access to", response = Node.class, responseContainer = "List", authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "node", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Node.class, responseContainer = "List") })
    @RequestMapping(value = "/node",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Node>> findNodes();


    @ApiOperation(value = "", nickname = "getNode", notes = "Retrieves the node with the given id.", response = Node.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "node", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK ", response = Node.class) })
    @RequestMapping(value = "/node/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Node> getNode(@ApiParam(value = "Unique identifier of the resource",required=true) @PathVariable("id") String id);

}
