package com.nguyenkunquan.interchangefrontendnguyenkunquan.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {

    //STAFF
    @GetMapping("/create-quotation")
    public String createQuotation() {
        return "quotationmanagement/ui-taobaogia";
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

    //ADMIN
    @GetMapping("/approve-quotation")
    public String approveQuotation() {
        return "admin/ui-kiemduyetbaogia";
    }

    @GetMapping("/approve-quotation/view-quotation")
    public String viewQuotation() {
        return "admin/ui-xembaogia";
    }

}
