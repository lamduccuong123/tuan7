package com.example.tuan4.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.tuan4.entity.MayBay;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay, String> {

	@Query(value = "select * from maybay where TamBay > 10000", nativeQuery = true)
	List<MayBay> getMayBayByTamBay();

	@Query(value = "select count(*) from maybay where Loai like 'Boeing%'", nativeQuery = true)
	Integer getLoaiMayBayBoeing();

	@Query(value = "select distinct c.MaMB, Loai, TamBay from chungnhan c join nhanvien n on n.MaNV = c.MaNV join maybay m on m.MaMB = c.MaMB where Ten like 'Nguyen%'", nativeQuery = true)
	List<MayBay> getMayBayPhiCongHoNguyen();

	@Query(value = "select distinct * from maybay where TamBay>=11979", nativeQuery = true)
	List<MayBay> getMayBayBayDuocChuyenVN280();

	@Query(value = "select m.MaMB,Loai, count(MaNV) as 'TongPhiCong' from maybay m left \r\n"
			+ "join chungnhan c on m.MaMB = c.MaMB where c.MaNV is not null group by m.MaMB,Loai", nativeQuery = true)
	List<Object> getCau16();
}
