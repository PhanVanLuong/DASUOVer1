package com.dasuo.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.dasuo.entity.BaiKiemTra;
import com.dasuo.entity.GiaoTrinh;
import com.dasuo.entity.LichHoc;
import com.dasuo.entity.TaiKhoan;

public class LopDTO {

	private Integer lop_Id;
	
	private Date ngayNhan;
	
	private TaiKhoan nguoiHoc;
	
	private TaiKhoan nguoiDay;
	
	private double tienHoc;
	
	private Integer gioHoc;
	
	private List<LichHoc> lichHoc;
	
	private List<BaiKiemTra> baiKiemTra;
	
	private List<GiaoTrinh> giaoTrinh;

	public LopDTO() {
		super();
	}

	public Integer getLop_Id() {
		return lop_Id;
	}

	public void setLop_Id(Integer lop_Id) {
		this.lop_Id = lop_Id;
	}

	public Date getNgayNhan() {
		return ngayNhan;
	}

	public void setNgayNhan(Date ngayNhan) {
		this.ngayNhan = ngayNhan;
	}

	public TaiKhoan getNguoiHoc() {
		return nguoiHoc;
	}

	public void setNguoiHoc(TaiKhoan nguoiHoc) {
		this.nguoiHoc = nguoiHoc;
	}

	public TaiKhoan getNguoiDay() {
		return nguoiDay;
	}

	public void setNguoiDay(TaiKhoan nguoiDay) {
		this.nguoiDay = nguoiDay;
	}

	public double getTienHoc() {
		return tienHoc;
	}

	public void setTienHoc(double tienHoc) {
		this.tienHoc = tienHoc;
	}

	public Integer getGioHoc() {
		return gioHoc;
	}

	public void setGioHoc(Integer gioHoc) {
		this.gioHoc = gioHoc;
	}

	public List<LichHoc> getLichHoc() {
		return lichHoc;
	}

	public void setLichHoc(List<LichHoc> lichHoc) {
		this.lichHoc = lichHoc;
	}

	public List<BaiKiemTra> getBaiKiemTra() {
		return baiKiemTra;
	}

	public void setBaiKiemTra(List<BaiKiemTra> baiKiemTra) {
		this.baiKiemTra = baiKiemTra;
	}

	public List<GiaoTrinh> getGiaoTrinh() {
		return giaoTrinh;
	}

	public void setGiaoTrinh(List<GiaoTrinh> giaoTrinh) {
		this.giaoTrinh = giaoTrinh;
	}

	
}
