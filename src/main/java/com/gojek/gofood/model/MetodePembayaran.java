package com.gojek.gofood.model;

public class MetodePembayaran {
	/*
	 * Declare the variable
	 */
	private String namaMetode;
	private int promoMetode;
	
	/*
	 * Build the constructor
	 */
	public MetodePembayaran(String nama, int promo) {
		this.namaMetode = nama;
		this.promoMetode = promo;
	}
	
	/*
	 * Build the getter
	 */
	public String getNamaMetode() { return this.namaMetode; }
	public int getPromoMetode() { return this.promoMetode; }
}
