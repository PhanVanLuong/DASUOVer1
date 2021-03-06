package com.dasuo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bailam")
public class BaiLam {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer baiLam_Id;
	@Column
	private String noiDung;
	@Column
	private Date thoiGian;
	@ManyToOne
	@JoinColumn(name = "baikiemtra_id")
	private BaiKiemTra baiKiemTra;

	public BaiLam() {
		super();
	}

	public Integer getBaiLam_Id() {
		return baiLam_Id;
	}

	public void setBaiLam_Id(Integer baiLam_Id) {
		this.baiLam_Id = baiLam_Id;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public Date getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(Date thoiGian) {
		this.thoiGian = thoiGian;
	}

	public BaiKiemTra getBaiKiemTra() {
		return baiKiemTra;
	}

	public void setBaiKiemTra(BaiKiemTra baiKiemTra) {
		this.baiKiemTra = baiKiemTra;
	}
	
	

}
