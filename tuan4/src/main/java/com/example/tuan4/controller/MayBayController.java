package com.example.tuan4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tuan4.entity.MayBay;
import com.example.tuan4.repository.MayBayRepository;

@RequestMapping("/maybay")
@RestController
public class MayBayController {

	@Autowired
	MayBayRepository mayBayRepository;

	// 2. Cho biết các loại máy bay có tầm bay lớn hơn 10,000km.
	@GetMapping("/tamBayTren10000")
	public List<MayBay> getMayBayTheoTamBay() {
		return mayBayRepository.getMayBayByTamBay();
	}

	// 7. Có bao nhiêu loại máy báy Boeing.
	@GetMapping("/loaiMayBayBoeing")
	public Integer getLoaiMayBayBoeing() {
		return mayBayRepository.getLoaiMayBayBoeing();
	}

	// 11. Cho biết mã số của các loại máy bay mà nhân viên có họ Nguyễn có thể lái.
	@GetMapping("/mayBayPhiCongHoNguyen")
	public List<MayBay> getMayBayPhiCongHoNguyen() {
		return mayBayRepository.getMayBayPhiCongHoNguyen();
	}

	// 13. Cho biết các loại máy bay có thể thực hiện chuyến bay VN280.
	@GetMapping("/mayBayBayDuocChuyenVN280")
	public List<MayBay> getMayBayBayDuocChuyenVN280() {
		return mayBayRepository.getMayBayBayDuocChuyenVN280();
	}

	// 16. Với mỗi loại máy bay có phi công lái cho biết mã số, loại máy báy và tổng
	// số phi công có thể lái loại máy bay đó.
	@GetMapping("/cau16")
	public List<Object> getCau16() {
		return mayBayRepository.getCau16();
	}

	@PostMapping("/themMayBay")
	public String themMayBay(@RequestBody MayBay mayBay) {
		mayBayRepository.save(mayBay);
		return "redirect:/";
	}

	@DeleteMapping("/xoaMayBay/{maMB}")
	public String xoaMayBay(@PathVariable("maMB") String maMB) {
		mayBayRepository.deleteById(maMB);
		return "redirect:/";
	}
}
