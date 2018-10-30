/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.0-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.github.cloudiator.rest.api;

import io.github.cloudiator.rest.model.Login;
import io.github.cloudiator.rest.model.Token;
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

@Api(value = "login", description = "the login API")
public interface LoginApi {

    @ApiOperation(value = "", nickname = "login", notes = "Authenticates a user ", response = Token.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Token.class) })
    @RequestMapping(value = "/login",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Token> login(@ApiParam(value = "User login request "  )  @Valid @RequestBody Login login);

}
