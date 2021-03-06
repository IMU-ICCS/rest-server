/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.0-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.github.cloudiator.rest.api;

import io.github.cloudiator.rest.model.Node;
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

@Api(value = "byon", description = "the byon API")
public interface ByonApi {

    @ApiOperation(value = "", nickname = "addBYON", notes = "Registers an already existing node for usage", response = Node.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "node", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Node.class) })
    @RequestMapping(value = "/byon",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Node> addBYON(@ApiParam(value = "Node to be registered" ,required=true )  @Valid @RequestBody Node node);

}
