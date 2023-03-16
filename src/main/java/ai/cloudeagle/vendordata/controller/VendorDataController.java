package ai.cloudeagle.vendordata.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendorDataController {

    private static int count = 1;

    @GetMapping("/")
    public String welcome() {

        return "welcome " + Integer.toString(count++);
    }
}
