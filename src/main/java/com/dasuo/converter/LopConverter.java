package com.dasuo.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dasuo.dto.LopDTO;
import com.dasuo.dto.TaiKhoanDTO;
import com.dasuo.entity.Lop;
@Component
public class LopConverter {
	@Autowired
	TaiKhoanConverter taiKhoanConverter;
	public LopDTO toDTO (Lop lop) {
		LopDTO lopDTO = new LopDTO();
		lopDTO.setLop_Id(lop.getLop_Id());
		lopDTO.setGioHoc(lop.getGioHoc());
		lopDTO.setNgayNhan(lop.getNgayNhan());
		TaiKhoanDTO nguoiDayDTO = taiKhoanConverter.toDTO(lop.getNguoiDay());
		lopDTO.setNguoiDay(nguoiDayDTO);
		TaiKhoanDTO nguoiHocDTO = taiKhoanConverter.toDTO(lop.getNguoiHoc());
		lopDTO.setNguoiHoc(nguoiHocDTO);
		lopDTO.setTienHoc(lop.getTienHoc());
		return lopDTO;
		
	}
	
	public Lop toEntity (LopDTO lopDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(lopDTO, Lop.class);
	}

}
