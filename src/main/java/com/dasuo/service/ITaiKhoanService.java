package com.dasuo.service;

import java.util.List;

import com.dasuo.dto.TaiKhoanDTO;

public interface ITaiKhoanService {
	List<TaiKhoanDTO> getListTaiKhoan();
	TaiKhoanDTO getTaiKhoan(int id);
	public void save(TaiKhoanDTO taiKhoanDTO);
	public void delete (Integer id);

}
