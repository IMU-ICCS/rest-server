package io.github.cloudiator.rest.api;

import io.github.cloudiator.rest.model.Error;
import io.github.cloudiator.rest.model.LongRunningRequest;
import io.github.cloudiator.rest.model.VirtualMachineRequest;

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

@Api(value = "vm", description = "the vm API")
public interface VmApi {

    @ApiOperation(value = "", notes = "Creates a new virtual machine request", response = LongRunningRequest.class, tags={ "cloud", })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "ACCEPTED", response = LongRunningRequest.class),
        @ApiResponse(code = 400, message = "Bad Request", response = LongRunningRequest.class),
        @ApiResponse(code = 401, message = "Authorization for this action is missing", response = LongRunningRequest.class),
        @ApiResponse(code = 403, message = "Forbidden action", response = LongRunningRequest.class),
        @ApiResponse(code = 404, message = "Item not found", response = LongRunningRequest.class),
        @ApiResponse(code = 500, message = "An unexpected Error occured", response = LongRunningRequest.class),
        @ApiResponse(code = 504, message = "Server temporary not available", response = LongRunningRequest.class) })
    
    @RequestMapping(value = "/vm",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LongRunningRequest> addVM(@ApiParam(value = "VirtualMachine Request" ,required=true )  @Valid @RequestBody VirtualMachineRequest virtualMachineRequest);

}
