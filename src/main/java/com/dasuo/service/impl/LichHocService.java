package com.dasuo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dasuo.converter.LichHocConverter;
import com.dasuo.dto.LichHocDTO;
import com.dasuo.entity.LichHoc;
import com.dasuo.repository.LichHocRepository;
import com.dasuo.service.ILichHocService;
@Service
public class LichHocService implements ILichHocService{

	@Autowired
	LichHocRepository lichHocRepository;
	@Autowired
	LichHocConverter lichHocConverter;
	@Override
	@Transactional
	public List<LichHocDTO> getListLichHoc() {
		List<LichHoc> lichHocs = lichHocRepository.findAll();
		List<LichHocDTO> lichHocDTOs = new ArrayList<>();
		lichHocs.forEach(lichHoc -> lichHocDTOs.add(lichHocConverter.toDTO(lichHoc)));
		return lichHocDTOs;
	}

	@Override
	@Transactional
	public LichHocDTO getLichHoc(Integer id) {
		if(id!=0) {
			LichHoc lichHoc = lichHocRepository.findOne(id);
			return lichHocConverter.toDTO(lichHoc);
		}
		else {
			return null;
		}
		
		
	}

	@Override
	public void save(LichHocDTO lichHocDTO) {
		lichHocRepository.save(lichHocConverter.toEntity(lichHocDTO));
		
	}

	@Override
	public void delete(Integer id) {
		lichHocRepository.delete(id);
	}

}
