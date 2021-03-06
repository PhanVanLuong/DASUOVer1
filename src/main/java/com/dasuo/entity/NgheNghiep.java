package com.dasuo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nghenghiep")
public class NgheNghiep {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ngheNghiep_Id;
	@Column
	private String tenNgheNghiep;
	@OneToMany(mappedBy = "ngheNghiep")
	private List<TaiKhoan> taiKhoan;

	public NgheNghiep() {
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
