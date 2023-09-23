package com.baeldung.security.azuread.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
@Slf4j
public class SecureController {


    @GetMapping(path = "/admin_only")
    @PreAuthorize("hasAuthority('SOLACE_ADMIN')")
    public String adminOnly() {
        log.info("GET /admin_only: user={}");
      //  model.addAttribute("model", model);
        return "admin";
    }
}
