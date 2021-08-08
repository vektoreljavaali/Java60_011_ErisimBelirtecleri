package com.vektorel.entity;

import java.time.LocalDateTime;
import java.util.Random;

public class Urun extends Properties{
	
	// POJO -> Plain Old Java Object
	// public -> en genel eriþim belirtecidir.
	// tüm sisteme eriþim açmak için kullanýlýr.
	// sýnýf içine, paket içine ve paket dýþýna eriþim açar
	// protected -> paket içine ve sýnýf içine eriþim açar
	// fakat paket dýþýndan eriþim kapalýdýr.
	// private -> sadece sýnýf içine eriþime açar
	// diðer alanlardan etriþim engellenir.
	private String ad;
	private String marka;
	private String model;
	private double fiyat;
	private long stokmiktari;
	// Constructor - Yapýcý Kurucu Method
	public Urun() {
		Random rd = new Random();
		this.id =  rd.nextLong();
		this.savetimestamp = LocalDateTime.now();
		System.out.println("id Atandý...: "+ this.id);
		System.out.println("zaman damgasý basýldý...: "+ this.savetimestamp); 
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
