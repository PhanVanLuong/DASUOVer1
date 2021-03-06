package com.dasuo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "mon")
public class Mon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mon_Id;
	@Column
	private String tenMonHoc;
	@OneToMany(mappedBy = "mon")
	private List<BaiDang> baiDang;
	@ManyToMany(mappedBy = "mons")
	private List<TaiKhoan> taiKhoans;
	

	public List<TaiKhoan> getTaiKhoans() {
		return taiKhoans;
	}

	public void setTaiKhoans(List<TaiKhoan> taiKhoans) {
		this.taiKhoans = taiKhoans;
	}

	public Integer getMon_Id() {
		return mon_Id;
	}

	public void setMon_Id(Integer mon_Id) {
		this.mon_Id = mon_Id;
	}

	public String getTenMonHoc() {
		return tenMonHoc;
	}

	public void setTenMonHoc(String tenMonHoc) {
		this.tenMonHoc = tenMonHoc;
	}

	public List<BaiDang> getBaiDang() {
		return baiDang;
	}

	public void setBaiDang(List<BaiDang> baiDang) {
		this.baiDang = baiDang;
	}

	public Mon() {
		super();
	}
	
	

}
