package com.example.tuan4.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "maybay")
public class MayBay {
	@Id
	@Column(name = "MaMB")
	private String maMB;
	@Column(name = "Loai")
	private String loai;
	@Column(name = "TamBay")
	private int tamBay;

	@ManyToMany()
	@JoinTable(name = "chungnhan", joinColumns = @JoinColumn(name = "MaMB", referencedColumnName = "MaMB"), inverseJoinColumns = @JoinColumn(name = "MaNV", referencedColumnName = "MaNV"))
	private List<NhanVien> nhanViens;

	public MayBay(String maMB, String loai, int tamBay) {
		super();
		this.maMB = maMB;
		this.loai = loai;
		this.tamBay = tamBay;
	}

	public MayBay() {
		// TODO Auto-generated constructor stub
	}

	public String getMaMB() {
		return maMB;
	}

	public void setMaMB(String maMB) {
		this.maMB = maMB;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public int getTamBay() {
		return tamBay;
	}

	public void setTamBay(int tamBay) {
		this.tamBay = tamBay;
	}

}
