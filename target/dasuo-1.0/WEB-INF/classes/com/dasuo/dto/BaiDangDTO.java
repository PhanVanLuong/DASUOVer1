package com.dasuo.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.dasuo.entity.Buoi;
import com.dasuo.entity.ChuDe;
import com.dasuo.entity.Mon;
import com.dasuo.entity.TaiKhoan;

public class BaiDangDTO {
	private Integer baiDang_Id;
	
	private String tomTatYeuCau;
	
	private Mon mon;
	
	private double hocPhi;
	
	private String sdt;
	
	private String moTa;
	
	private boolean gioiTinh;
	
	private Integer soBuoi;
	
	private Date ngayBatDau;
	
	private Integer thoiGianDayTheoThang;
	
	private ChuDe chuDe;
	
	private List<TaiKhoan> taiKhoans;
	
	private List<Buoi> buois ;
	
	public BaiDangDTO() {
		super();
	}

	public Integer getBaiDang_Id() {
		return baiDang_Id;
	}

	public void setBaiDang_Id(Integer baiDang_Id) {
		this.baiDang_Id = baiDang_Id;
	}

	public String getTomTatYeuCau() {
		return tomTatYeuCau;
	}

	public void setTomTatYeuCau(String tomTatYeuCau) {
		this.tomTatYeuCau = tomTatYeuCau;
	}

	public Mon getMon() {
		return mon;
	}

	public void setMon(Mon mon) {
		this.mon = mon;
	}

	public double getHocPhi() {
		return hocPhi;
	}

	public void setHocPhi(double hocPhi) {
		this.hocPhi = hocPhi;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public boolean isGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public Integer getSoBuoi() {
		return soBuoi;
	}

	public void setSoBuoi(Integer soBuoi) {
		this.soBuoi = soBuoi;
	}

	public Date getNgayBatDau() {
		return ngayBatDau;
	}

	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	public Integer getThoiGianDayTheoThang() {
		return thoiGianDayTheoThang;
	}

	public void setThoiGianDayTheoThang(Integer thoiGianDayTheoThang) {
		this.thoiGianDayTheoThang = thoiGianDayTheoThang;
	}

	public ChuDe getChuDe() {
		return chuDe;
	}

	public void setChuDe(ChuDe chuDe) {
		this.chuDe = chuDe;
	}

	public List<TaiKhoan> getTaiKhoans() {
		return taiKhoans;
	}

	public void setTaiKhoans(List<TaiKhoan> taiKhoans) {
		this.taiKhoans = taiKhoans;
	}

	public List<Buoi> getBuois() {
		return buois;
	}

	public void setBuois(List<Buoi> buois) {
		this.buois = buois;
	}
	
	


}
