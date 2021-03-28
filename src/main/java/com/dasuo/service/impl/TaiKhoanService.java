package com.dasuo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dasuo.converter.TaiKhoanConverter;
import com.dasuo.dto.TaiKhoanDTO;
import com.dasuo.entity.TaiKhoan;
import com.dasuo.repository.TaiKhoanRepository;
import com.dasuo.service.ITaiKhoanService;

@Service
public class TaiKhoanService implements ITaiKhoanService{
	
	@Autowired
	TaiKhoanRepository taiKhoanRepository;
	
	@Autowired
	TaiKhoanConverter taiKhoanConverter;

	@Override
	public List<TaiKhoanDTO> getListTaiKhoan() {
		List<TaiKhoan> taiKhoans = taiKhoanRepository.findAll();
		List<TaiKhoanDTO> taiKhoanDTO = new ArrayList<>();
		taiKhoans.forEach(taiKhoan -> taiKhoanDTO.add(taiKhoanConverter.toDTO(taiKhoan)));
		return taiKhoanDTO;
	}

	@Override
	public TaiKhoanDTO getTaiKhoan(int id) {
		TaiKhoan taiKhoan = taiKhoanRepository.findOne(id);
		if(taiKhoan!= null)
		{
			return taiKhoanConverter.toDTO(taiKhoan);
		}
		return null;
	}

	@Override
	public void save(TaiKhoanDTO taiKhoanDTO) {
		TaiKhoan taiKhoan = taiKhoanConverter.toEntity(taiKhoanDTO);
		taiKhoanRepository.save(taiKhoan);
		
	}

	@Override
	public void delete(Integer id) {
		taiKhoanRepository.delete(id);
		
	}

}
