package com.ibhatech.opendata.worldfacts.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@Slf4j
public class AppErrorController implements ErrorController {
  private int i=60;
  @RequestMapping("/error")
  public String handleError(HttpServletRequest request) {
    Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
    log.error("Error status code {} ", status);
    if (status != null) {
      Integer statusCode = Integer.valueOf(status.toString());

      if(statusCode == HttpStatus.NOT_FOUND.value()) {
        return "error-404";
      }
      else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
        return "error-500";
      }
    }
    return "error";
  }
}
