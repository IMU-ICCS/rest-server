/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.0-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.github.cloudiator.rest.api;

import io.github.cloudiator.rest.model.NodeCandidate;

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
import java.io.IOException;

import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Api(value = "nodeCandidates", description = "the nodeCandidates API")
public interface NodeCandidatesApi {

    @ApiOperation(value = "", nickname = "findNodeCandidates", notes = "Returns possible node candidates. ", response = NodeCandidate.class, responseContainer = "List", tags={ "cloud", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "All possible node candidates. ", response = NodeCandidate.class, responseContainer = "List") })
    @RequestMapping(value = "/nodeCandidates",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<NodeCandidate>> findNodeCandidates( @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}
