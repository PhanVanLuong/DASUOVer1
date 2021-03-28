package com.dasuo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.dasuo.entity.BaiDang;
import com.dasuo.entity.Chat;
import com.dasuo.entity.LichSuGiaoDich;
import com.dasuo.entity.Loai;
import com.dasuo.entity.Lop;
import com.dasuo.entity.Mon;
import com.dasuo.entity.NgheNghiep;
import com.dasuo.entity.TinhThanh;

public class TaiKhoanDTO {
	
	private Integer taiKhoan_Id;
	
	private String hoTen;
	
	private String sdt;
	
	private TinhThanh tinhThanh;
	
	private String email;
	
	private String matKhau;
	
	private Loai loai;
	
	private boolean gioiTinh;
	
	private String hinhDaiDien;
	
	private String moTa;
	
	private NgheNghiep ngheNghiep;
	
	private double hocPhi;
	
	private String bangCap;
	
	private String cmnd;
	
	private double soDu;
	
	private List<BaiDang> baiDangs;
	
	private List<LichSuGiaoDich> lichSuGiaoDichs;
	
	private List<Chat> nguoiNhans;
	
	private List<Chat> nguoiGuis;
	
	private List<Lop> nguoiDays;
	
	private List<Lop> nguoiHocs;
	
	private List<Mon> mons;
	
	public TaiKhoanDTO() {
		super();
	}

	public Integer getTaiKhoan_Id() {
		return taiKhoan_Id;
	}

	public void setTaiKhoan_Id(Integer taiKhoan_Id) {
		this.taiKhoan_Id = taiKhoan_Id;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public TinhThanh getTinhThanh() {
		return tinhThanh;
	}

	public void setTinhThanh(TinhThanh tinhThanh) {
		this.tinhThanh = tinhThanh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public Loai getLoai() {
		return loai;
	}

	public void setLoai(Loai loai) {
		this.loai = loai;
	}

	public boolean isGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getHinhDaiDien() {
		return hinhDaiDien;
	}

	public void setHinhDaiDien(String hinhDaiDien) {
		this.hinhDaiDien = hinhDaiDien;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public NgheNghiep getNgheNghiep() {
		return ngheNghiep;
	}

	public void setNgheNghiep(NgheNghiep ngheNghiep) {
		this.ngheNghiep = ngheNghiep;
	}

	public double getHocPhi() {
		return hocPhi;
	}

	public void setHocPhi(double hocPhi) {
		this.hocPhi = hocPhi;
	}

	public String getBangCap() {
		return bangCap;
	}

	public void setBangCap(String bangCap) {
		this.bangCap = bangCap;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public double getSoDu() {
		return soDu;
	}

	public void setSoDu(double soDu) {
		this.soDu = soDu;
	}

	public List<BaiDang> getBaiDangs() {
		return baiDangs;
	}

	public void setBaiDangs(List<BaiDang> baiDangs) {
		this.baiDangs = baiDangs;
	}

	public List<LichSuGiaoDich> getLichSuGiaoDichs() {
		return lichSuGiaoDichs;
	}

	public void setLichSuGiaoDichs(List<LichSuGiaoDich> lichSuGiaoDichs) {
		this.lichSuGiaoDichs = lichSuGiaoDichs;
	}

	public List<Chat> getNguoiNhans() {
		return nguoiNhans;
	}

	public void setNguoiNhans(List<Chat> nguoiNhans) {
		this.nguoiNhans = nguoiNhans;
	}

	public List<Chat> getNguoiGuis() {
		return nguoiGuis;
	}

	public void setNguoiGuis(List<Chat> nguoiGuis) {
		this.nguoiGuis = nguoiGuis;
	}

	public List<Lop> getNguoiDays() {
		return nguoiDays;
	}

	public void setNguoiDays(List<Lop> nguoiDays) {
		this.nguoiDays = nguoiDays;
	}

	public List<Lop> getNguoiHocs() {
		return nguoiHocs;
	}

	public void setNguoiHocs(List<Lop> nguoiHocs) {
		this.nguoiHocs = nguoiHocs;
	}

	public List<Mon> getMons() {
		return mons;
	}

	public void setMons(List<Mon> mons) {
		this.mons = mons;
	}

	
}
