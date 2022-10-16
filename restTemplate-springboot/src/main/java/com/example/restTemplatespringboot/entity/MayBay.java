package com.example.restTemplatespringboot.entity;

import java.io.Serializable;
import java.util.List;

public class MayBay implements Serializable {
	private String maMB;
	private String loai;
	private int tamBay;

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

	@Override
	public String toString() {
		return "MayBay [maMB=" + maMB + ", loai=" + loai + ", tamBay=" + tamBay + "]";
	}

}
