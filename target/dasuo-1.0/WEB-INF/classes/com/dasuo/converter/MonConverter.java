package com.dasuo.converter;

import org.springframework.stereotype.Component;

import com.dasuo.dto.MonDTO;
import com.dasuo.entity.Mon;

@Component
public class MonConverter {
	
	public MonDTO toDTO(Mon mon) {
		MonDTO monDTO = new MonDTO();
		monDTO.setMonHoc_Id(mon.getMon_Id());
		monDTO.setTenMonHoc(mon.getTenMonHoc());
		monDTO.setBaiDang(null);
		return monDTO;
	}
	
	public Mon toEntity(MonDTO monDTO) {
		Mon mon = new Mon();
		mon.setMon_Id(monDTO.getMonHoc_Id());
		mon.setTenMonHoc(monDTO.getTenMonHoc());
		
		return mon;
	}

}
