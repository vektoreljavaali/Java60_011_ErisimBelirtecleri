package com.vektorel.entity;

import java.time.LocalDateTime;
import java.util.Random;

public class Urun extends Properties{
	
	// POJO -> Plain Old Java Object
	// public -> en genel eri�im belirtecidir.
	// t�m sisteme eri�im a�mak i�in kullan�l�r.
	// s�n�f i�ine, paket i�ine ve paket d���na eri�im a�ar
	// protected -> paket i�ine ve s�n�f i�ine eri�im a�ar
	// fakat paket d���ndan eri�im kapal�d�r.
	// private -> sadece s�n�f i�ine eri�ime a�ar
	// di�er alanlardan etri�im engellenir.
	private String ad;
	private String marka;
	private String model;
	private double fiyat;
	private long stokmiktari;
	// Constructor - Yap�c� Kurucu Method
	public Urun() {
		Random rd = new Random();
		this.id =  rd.nextLong();
		this.savetimestamp = LocalDateTime.now();
		System.out.println("id Atand�...: "+ this.id);
		System.out.println("zaman damgas� bas�ld�...: "+ this.savetimestamp); 
	}
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public long getStokmiktari() {
		return stokmiktari;
	}
	public void setStokmiktari(long stokmiktari) {
		this.stokmiktari = stokmiktari;
	}
	
	
	
	
	
}
