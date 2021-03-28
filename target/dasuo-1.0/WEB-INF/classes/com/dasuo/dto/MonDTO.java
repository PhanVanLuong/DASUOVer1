package com.dasuo.dto;

import java.util.List;

public class MonDTO {
private Integer mon_Id;
	
	private String tenMon;
	
	private List<BaiDangDTO> baiDang;

	public MonDTO() {
		super();
	}

	public Integer getMonHoc_Id() {
		return mon_Id;
	}

	public void setMonHoc_Id(Integer mon_Id) {
		this.mon_Id = mon_Id;
	}

	public String getTenMonHoc() {
		return tenMon;
	}

	public void setTenMonHoc(String tenMon) {
		this.tenMon = tenMon;
	}

	public List<BaiDangDTO> getBaiDang() {
		return baiDang;
	}

	public void setBaiDang(List<BaiDangDTO> baiDang) {
		this.baiDang = baiDang;
	}

}
