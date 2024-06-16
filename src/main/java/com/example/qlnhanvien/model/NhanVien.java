package com.example.qlnhanvien.model;

import javax.persistence.*;

@Entity
@Table(name = "NHANVIEN")
public class NhanVien {

    @Id
    @Column(name = "Ma_NV")
    private String maNV;

    @Column(name = "Ten_NV")
    private String tenNV;

    @Column(name = "Phai")
    private String phai;

    @Column(name = "Noi_Sinh")
    private String noiSinh;

    @Column(name = "Ma_Phong")
    private String maPhong;

    @Column(name = "Luong")
    private int luong;

    // Getters and setters
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getPhai() {
        return phai;
    }

    public void setPhai(String phai) {
        this.phai = phai;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }
}
