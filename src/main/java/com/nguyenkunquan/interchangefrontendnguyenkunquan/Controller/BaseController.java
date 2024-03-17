package com.nguyenkunquan.interchangefrontendnguyenkunquan.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {
    @GetMapping("/create-quotation")
    public String createQuotation() {
        return "ui-taobaogia";
    }

    @GetMapping("/blog-management")
    public String blogManagement() {
        return "blog/blog-management";
    }

    @GetMapping("/request-management")
    public String requestManagement() {
        return "quotationmanagement/ui-quanlypheduyet";
    }

    @GetMapping("/project-management")
    public String projectManagement() {
        return "quotationmanagement/ui-quanlyduan";
    }

    @GetMapping("/project-information")
    public String projectInformation() {
        return "quotationmanagement/ui-thongtinduan";
    }

    @GetMapping("/quotation-information")
    public String quotationInformation() {
        return "quotationmanagement/ui-thongtinbaogia";
    }

}
