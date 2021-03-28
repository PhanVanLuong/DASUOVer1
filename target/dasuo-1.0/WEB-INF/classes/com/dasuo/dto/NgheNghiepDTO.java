package com.dasuo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.dasuo.entity.TaiKhoan;

public class NgheNghiepDTO {
	
	private Integer ngheNghiep_Id;
	
	private String tenNgheNghiep;
	
	private List<TaiKhoan> taiKhoan;

	public NgheNghiepDTO() {
		super();
	}

	public Integer getNgheNghiep_Id() {
		return ngheNghiep_Id;
	}

	public void setNgheNghiep_Id(Integer ngheNghiep_Id) {
		this.ngheNghiep_Id = ngheNghiep_Id;
	}

	public String getTenNgheNghiep() {
		return tenNgheNghiep;
	}

	public void setTenNgheNghiep(String tenNgheNghiep) {
		this.tenNgheNghiep = tenNgheNghiep;
	}

	public List<TaiKhoan> getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(List<TaiKhoan> taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	

}
