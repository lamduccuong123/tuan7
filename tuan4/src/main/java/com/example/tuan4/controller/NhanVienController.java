package com.example.tuan4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tuan4.entity.NhanVien;
import com.example.tuan4.repository.NhanVienRepository;

@RequestMapping("/nhanvien")
@RestController
public class NhanVienController {

	@Autowired
	NhanVienRepository nhanVienRepository;

	// 3. Tìm các nhân viên có lương nhỏ hơn 10,000.
	@GetMapping("/nhanVienLuongDuoi10000")
	public List<NhanVien> nhanVienLuongDuoi10000() {
		return nhanVienRepository.findNhanVienbyLuongNhoHon10000();
	}

	// 8. Cho biết tổng số lương phải trả cho các nhân viên.
	@GetMapping("/tongLuongNhanVien")
	public Double getTongLuongNhanVien() {
		return nhanVienRepository.getTongLuongNhanVien();
	}

	// 9. Cho biết mã số của các phi công lái máy báy Boeing.
	@GetMapping("/maSoPhiCongBoeing")
	public List<String> getMaSoPhiCongBoeing() {
		return nhanVienRepository.getMaSoPhiCongBoeing();
	}

	// 10. Cho biết các nhân viên có thể lái máy bay có mã số 747.
	@GetMapping("/phiCongLai747")
	public List<NhanVien> getPhiCongLai747() {
		return nhanVienRepository.getPhiCongLai747();
	}

	// 12. Cho biết mã số của các phi công vừa lái được Boeing vừa lái được Airbus.
	@GetMapping("/phiCongLaiDuocCaBoeingVaAirbus")
	public List<String> getPhiCongLaiDuocCaBoeingVaAirbus() {
		return nhanVienRepository.getPhiCongLaiDuocCaBoeingVaAirbus();
	}

	// 15. Cho biết tên của các phi công lái máy bay Boeing.
	@GetMapping("/phiCongLaiBoeing")
	public List<String> getTenPhiCongBoeing() {
		return nhanVienRepository.getTenPhiCongBoeing();
	}

	// 22. Cho biết mã số của các phi công chỉ lái được 3 loại máy bay
	@GetMapping("/phiCongChiLaiDuoc3LoaiMayBay")
	public List<String> phiCongChiLaiDuoc3LoaiMayBay() {
		return nhanVienRepository.phiCongChiLaiDuoc3LoaiMayBay();
	}

	// Chua biet lam
	// 23. Với mỗi phi công có thể lái nhiều hơn 3 loại máy bay, cho biết mã số phi
	// công và tầm bay lớn nhất của các loại máy bay mà phi công đó có thể lái.
//	@GetMapping("/getPhiCongLaiNhieuHon3LoaiMayBay")
//	public List<Object> getPhiCongLaiNhieuHon3LoaiMayBay() {
//		return nhanVienRepository.getPhiCongLaiNhieuHon3LoaiMayBay();
//	}

	// 24. Với mỗi phi công cho biết mã số phi công và tổng số loại máy bay mà phi
	// công đó có thể lái.
	@GetMapping("/soLoaiMayBayPhiCongCoTheLai")
	public List<Object> soLoaiMayBayPhiCongCoTheLai() {
		return nhanVienRepository.soLoaiMayBayPhiCongCoTheLai();
	}

	// 25. Tìm các nhân viên không phải là phi công.
	@GetMapping("/khongPhaiPhiCong")
	public List<NhanVien> khongPhaiPhiCong() {
		return nhanVienRepository.khongPhaiPhiCong();
	}

	// 26. Cho biết mã số của các nhân viên có lương cao nhất.
	@GetMapping("/nhanVienLuongCaoNhat")
	public List<String> nhanVienLuongCaoNhat() {
		return nhanVienRepository.nhanVienLuongCaoNhat();
	}

	// 27. Cho biết tổng số lương phải trả cho các phi công.
	@GetMapping("/tongLuongPhiCong")
	public Double tongLuongPhiCong() {
		return nhanVienRepository.tongLuongPhiCong();
	}

}
