package com.gojek.gofood.model;

public class Produk {
	/*
	 * Declare the variable
	 */
	private String namaProduk;
	private int stokProduk, hargaProduk, promoProduk;
	
	/*
	 * Build the constructor
	 */
	public Produk(String nama, int harga, int stok, int promo) {
		this.namaProduk = nama;
		this.hargaProduk = harga;
		this.stokProduk = stok;
		this.promoProduk = promo;
	}
	
	/*
	 * Build the getter
	 */
	public String getNamaProduct() { return this.namaProduk; }
	public int getHargaProduk() { return this.hargaProduk; }
	public int getStokProduk() { return this.stokProduk; }
	public int getPromoProduk() { return this.promoProduk; }
}
