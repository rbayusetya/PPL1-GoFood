package com.gojek.gofood.model;

public class Pesanan {
	/*
	 * Declare the variable
	 */
	private User dataUser;
	private Produk dataProduk;
	private int jmlPesanan;
	private boolean statusPembayaran;
	private float totalPembayaran;
	
	/*
	 * Build the constructor
	 */
	public Pesanan(User user, Produk produk, int jml, boolean status, float total) {
		this.dataUser = user;
		this.dataProduk = produk;
		this.jmlPesanan = jml;
		this.statusPembayaran = status;
		this.totalPembayaran = total;
	}
	
	/*
	 * Build the getter
	 */
	public String getNamaProdukPesanan() { return this.dataProduk.getNamaProduct(); }
	public String getNamaPemesan() { return this.dataUser.getNamaUser(); }
	public String getAlamatPemesan() { return this.dataUser.getAlamatUser(); }
	public int getJmlProdukPesanan() { return this.jmlPesanan; }
	public float getHargaProdukPesanan() { return this.dataProduk.getHargaProduk(); }
	public int getPromoProdukPesanan() { return this.dataProduk.getPromoProduk(); }
	public boolean getStatusPembayaran() { return this.statusPembayaran; }
	public float getTotalPembayaran() {return this.totalPembayaran; }
	public float getSaldoUser() { return this.dataUser.getSaldoUser(); }
	
	/*
	 * Build the setter
	 */
	public void setTotalPembayaran(float total) {
		this.totalPembayaran = total;
	}
	public String getRecommendedPayment(float amount, float balance) {
		if(amount > balance) {
			return "cash";
		} else {
			return "gopay";
		}
	}
}
