package com.dasuo.converter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dasuo.dto.LoaiDTO;
import com.dasuo.dto.NgheNghiepDTO;
import com.dasuo.dto.TaiKhoanDTO;
import com.dasuo.dto.TinhThanhDTO;
import com.dasuo.entity.TaiKhoan;
import com.google.common.collect.Lists;


@Component
public class TaiKhoanConverter {
	@Autowired
	LoaiConverter loaiConverter;
	@Autowired
	NgheNghiepConverter ngheNghiepConverter;
	@Autowired
	TinhThanhConverter tinhThanhConverter;
	@Autowired
	BaiDangConverter baiDangConverter;
	@Autowired
	MonConverter monConverter;
	
	public TaiKhoanDTO toDTO (TaiKhoan taiKhoan) {
		TaiKhoanDTO taiKhoanDTO = new TaiKhoanDTO();
		taiKhoanDTO.setTaiKhoan_Id(taiKhoan.getTaiKhoan_Id());
		taiKhoanDTO.setBangCap(taiKhoan.getBangCap());
		taiKhoanDTO.setCmnd(taiKhoan.getCmnd());
		taiKhoanDTO.setEmail(taiKhoan.getEmail());
		taiKhoanDTO.setGioiTinh(taiKhoan.isGioiTinh());
		taiKhoanDTO.setHinhDaiDien(taiKhoan.getHinhDaiDien());
		taiKhoanDTO.setHocPhi(taiKhoan.getHocPhi());
		taiKhoanDTO.setHoTen(taiKhoan.getHoTen());
		LoaiDTO loaiDTO = loaiConverter.toDTO(taiKhoan.getLoai());
		taiKhoanDTO.setLoai(loaiDTO);
		taiKhoanDTO.setSdt(taiKhoan.getSdt());
		TinhThanhDTO tinhthanh = tinhThanhConverter.toDTO(taiKhoan.getTinhThanh());
		taiKhoanDTO.setTinhThanh(tinhthanh);
		taiKhoanDTO.setSoDu(taiKhoan.getSoDu());
		taiKhoanDTO.setMoTa(taiKhoan.getMoTa());
		taiKhoanDTO.setBaiDangs(baiDangConverter.toBaiDangDTO(Lists.newArrayList(taiKhoan.getBaiDangs())));
		taiKhoanDTO.setMons(monConverter.toMonDTO(Lists.newArrayList(taiKhoan.getMons())));
		NgheNghiepDTO nghenghiep = ngheNghiepConverter.toDTO(taiKhoan.getNgheNghiep());
		taiKhoanDTO.setNgheNghiep(nghenghiep);
		return taiKhoanDTO;
	}
	
	public TaiKhoan  toEntity (TaiKhoanDTO taiKhoanDTO) {
		ModelMapper modelMapper = new ModelMapper();
		TaiKhoan taiKhoan = modelMapper.map(taiKhoanDTO, TaiKhoan.class);
		return taiKhoan;
	}
	
	public Set<TaiKhoanDTO> toTaiKhoanDTO(List<TaiKhoan> listTaiKhoan) {
		Set<TaiKhoanDTO> listTaiKhoanDTO = new HashSet<TaiKhoanDTO>();
		listTaiKhoan.forEach(taiKhoan -> {
			TaiKhoanDTO taiKhoanDTO = new TaiKhoanDTO();
			taiKhoanDTO.setTaiKhoan_Id(taiKhoan.getTaiKhoan_Id());
			taiKhoanDTO.setBangCap(taiKhoan.getBangCap());
			taiKhoanDTO.setCmnd(taiKhoan.getCmnd());
			taiKhoanDTO.setEmail(taiKhoan.getEmail());
			taiKhoanDTO.setGioiTinh(taiKhoan.isGioiTinh());
			taiKhoanDTO.setHinhDaiDien(taiKhoan.getHinhDaiDien());
			taiKhoanDTO.setHocPhi(taiKhoan.getHocPhi());
			taiKhoanDTO.setHoTen(taiKhoan.getHoTen());
			LoaiDTO loaiDTO = loaiConverter.toDTO(taiKhoan.getLoai());
			taiKhoanDTO.setLoai(loaiDTO);
			taiKhoanDTO.setSdt(taiKhoan.getSdt());
			TinhThanhDTO tinhthanh = tinhThanhConverter.toDTO(taiKhoan.getTinhThanh());
			taiKhoanDTO.setTinhThanh(tinhthanh);
			taiKhoanDTO.setSoDu(taiKhoan.getSoDu());
			taiKhoanDTO.setMoTa(taiKhoan.getMoTa());
			NgheNghiepDTO nghenghiep = ngheNghiepConverter.toDTO(taiKhoan.getNgheNghiep());
			taiKhoanDTO.setNgheNghiep(nghenghiep);
			listTaiKhoanDTO.add(taiKhoanDTO);
		});
		return listTaiKhoanDTO;
	}

}
