package com.ringcentral.jwtspringbootdemo;

import java.io.IOException;

import com.ringcentral.RestClient;
import com.ringcentral.RestException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AuthClient {

  // Credentials should be privately secured seperately, in this demo app they are in 'application.properties' file
  private static String RINGCENTRAL_CLIENT_ID;
  private static String RINGCENTRAL_CLIENT_SECRET;
  private static String RINGCENTRAL_JWT;

  // Using RingCentra Sandbox URL, replace with the Production URL for Production Credentials
  private static String RINGCENTRAL_SERVER_URL = "https://platform.devtest.ringcentral.com";

  @Value("${rc.clientid}")
  private void setClientID(String id) {
    RINGCENTRAL_CLIENT_ID = id;
  }
  @Value("${rc.clientsecret}")
  private void setClientSecret(String secret) {
    RINGCENTRAL_CLIENT_SECRET = secret;
  }
  @Value("${rc.jwt}")
  private void setJWT(String jwt) {
    RINGCENTRAL_JWT = jwt;
  }

  public void AuthClient() {
    this.setClientID(RINGCENTRAL_CLIENT_ID);
    this.setClientSecret(RINGCENTRAL_CLIENT_SECRET);
    this.setJWT(RINGCENTRAL_JWT);
  }

  // Connect with RingCentral Platform and return the RestClient object
  public static RestClient authenticate() throws IOException, RestException {
    RestClient rc = new RestClient(RINGCENTRAL_CLIENT_ID, RINGCENTRAL_CLIENT_SECRET, RINGCENTRAL_SERVER_URL);
    rc.authorize(RINGCENTRAL_JWT);
    return rc;
  }
}
