package com.example.qlnhanvien.service;

import com.example.qlnhanvien.model.NhanVien;
import com.example.qlnhanvien.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienService {

    @Autowired
    private NhanVienRepository nhanVienRepository;

    public List<NhanVien> getAllNhanVien() {
        return nhanVienRepository.findAll();
    }

    public Page<NhanVien> findPaginated(Pageable pageable) {
        return nhanVienRepository.findAll(pageable);
    }
}
