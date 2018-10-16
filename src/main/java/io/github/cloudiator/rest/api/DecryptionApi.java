/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.0-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.github.cloudiator.rest.api;

import io.github.cloudiator.rest.model.Text;
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

@Api(value = "decryption", description = "the decryption API")
public interface DecryptionApi {

    @ApiOperation(value = "", nickname = "decrypt", notes = "Decrypts the given string", response = Text.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "security", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Text.class) })
    @RequestMapping(value = "/decryption/{text}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Text> decrypt(@ApiParam(value = "Text to decrypt",required=true) @PathVariable("text") String text);

}
