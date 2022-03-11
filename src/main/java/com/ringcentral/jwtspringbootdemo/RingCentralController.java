package com.ringcentral.jwtspringbootdemo;

import java.io.IOException;

import com.ringcentral.RestClient;
import com.ringcentral.RestException;
import com.ringcentral.definitions.GetAccountInfoResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RingCentralController {
  
  @RequestMapping("/account")
  @ResponseBody
  public String getRCAccountInfo() {
    try {
      RestClient rc = AuthClient.authenticate();
      GetAccountInfoResponse result = rc.restapi().account().get();
      return result.status;
    } 
    catch (IOException | RestException e) {
      e.printStackTrace();
      return("Error Occured!");
    }
  }
}
