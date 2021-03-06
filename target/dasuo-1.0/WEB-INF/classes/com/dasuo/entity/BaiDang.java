package com.dasuo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "baidang")
public class BaiDang {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer baiDang_Id;
	@Column
	private String tomTatYeuCau;
	@ManyToOne
	@JoinColumn(name = "mon_id")
	private Mon mon;
	@Column
	private double hocPhi;
	@Column
	private String sdt;
	@Column
	private String moTa;
	@Column
	private boolean gioiTinh;
	@Column
	private Integer soBuoi;
	@Column
	private Date ngayBatDau;
	@Column
	private Integer thoiGianDayTheoThang;
	@ManyToOne
	@JoinColumn(name = "chuDe_id")
	private ChuDe chuDe;
	@ManyToMany(mappedBy = "baiDangs")
	private List<TaiKhoan> taiKhoans;
	@OneToMany(mappedBy = "baiDang")
	private List<Buoi> buois ;

	public BaiDang() {
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

	public Mon getMonHoc() {
		return mon;
	}

	public void setMonHoc(Mon monHoc) {
		this.mon = monHoc;
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

	public List<TaiKhoan> getTaiKhoan() {
		return taiKhoans;
	}

	public void setTaiKhoan(List<TaiKhoan> taiKhoan) {
		this.taiKhoans = taiKhoan;
	}

	

	
	
	

}
