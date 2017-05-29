package io.github.cloudiator.rest.api;

import io.github.cloudiator.rest.model.Location;

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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-29T12:03:11.942+02:00")

@Api(value = "locations", description = "the locations API")
public interface LocationsApi {

    @ApiOperation(value = "", notes = "Returns all locations visible to the user ", response = Location.class, responseContainer = "List", tags={ "cloud", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK ", response = Location.class) })
    
    @RequestMapping(value = "/locations",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<Location>> findLocations();

}