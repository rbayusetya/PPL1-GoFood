package com.gojek.gofood.model;

public class User {
	/*
	 * Declare the variable
	 */
	private String namaUser, alamatUser, username, password;
	private float saldoGoPay, cash;
	
	/*
	 * Build the constructor
	 */
	public User(String nama, String username, String alamat, String password, float saldo, float cash) {
		this.namaUser = nama;
		this.username = username;
		this.alamatUser = alamat;
		this.password = password;
		this.saldoGoPay = saldo;
		this.cash = cash;
	}
	
	/*
	 * Build the getter
	 */
	public String getNamaUser() { return this.namaUser; }
	public String getAlamatUser() { return this.alamatUser; }
	public float getSaldoUser() { return this.saldoGoPay; }
	public void setSaldoUser(float xbalance) {
		this.saldoGoPay=xbalance;
	}
	public void setCash(float xcash) {
		this.cash=xcash;
	}
}
