package com.devnco.addressesbook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

  @GetMapping("/")
  public String getVersion() {
    return "The current version is v1!";
  }

  @GetMapping("/check-pr")
  public String getCheckPR() {
    return "The PR was validated!";
  }

  @GetMapping("/ci")
  public String getCI() {
    return "CI working!";
  }
}
