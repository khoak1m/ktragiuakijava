package com.example.qlnhanvien.controller;

import com.example.qlnhanvien.model.NhanVien;
import com.example.qlnhanvien.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NhanVienController {

    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping("/nhanvien")
    public String listNhanVien(@RequestParam(defaultValue = "0") int page,
                               @RequestParam(defaultValue = "5") int size,
                               Model model) {
        // Get a page of employees from the service layer
        Page<NhanVien> nhanVienPage = nhanVienService.findPaginated(PageRequest.of(page, size));

        // Add the page of employees and current page number to the model
        model.addAttribute("nhanVienPage", nhanVienPage);
        model.addAttribute("currentPage", page);

        return "nhanvien";
    }
}
