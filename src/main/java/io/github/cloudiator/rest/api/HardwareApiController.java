package io.github.cloudiator.rest.api;

import io.github.cloudiator.rest.UserService;
import io.github.cloudiator.rest.converter.HardwareConverter;
import io.github.cloudiator.rest.model.Hardware;

import io.swagger.annotations.*;

import java.util.ArrayList;
import org.cloudiator.messages.Hardware.HardwareQueryRequest;
import org.cloudiator.messages.Hardware.HardwareQueryResponse;
import org.cloudiator.messages.entities.IaasEntities;
import org.cloudiator.messaging.ResponseException;
import org.cloudiator.messaging.services.HardwareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-29T12:00:45.563+02:00")

@Controller
public class HardwareApiController implements HardwareApi {

  @Autowired
  private UserService userService;

  @Autowired
  private HardwareService hardwareService;


  public ResponseEntity<List<Hardware>> findHardware() {
    //Preparation
    System.out.println("------------------ find Hardware -------------------");
    HardwareQueryRequest hardwareQueryRequest = HardwareQueryRequest.newBuilder()
        .setUserId(userService.getUserId()).build();
    HardwareConverter hardwareConverter = new HardwareConverter();
    List<Hardware> hardwareList = new ArrayList<>();
    HardwareQueryResponse response = null;
    // to Kafka
    try {
      response = hardwareService.getHardware(hardwareQueryRequest);
    } catch (ResponseException re) {
      throw new ApiException(re.code(), re.getMessage());
    }

    for (IaasEntities.HardwareFlavor hardware : response.getHardwareFlavorsList()) {
      hardwareList.add(hardwareConverter.applyBack(hardware));
    }
    System.out.println("--------------------- " + hardwareList.size()
        + " item(s) found ---------------------------");

    return new ResponseEntity<List<Hardware>>(hardwareList, HttpStatus.OK);
  }

}
