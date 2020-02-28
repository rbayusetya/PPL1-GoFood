package com.gojek.gofood.jbehave.steps;
import org.jbehave.core.annotations.*;
import static org.fest.assertions.Assertions.assertThat;
import com.gojek.gofood.model.*;

public class Menampilkan_metode_pembayaran_terbaik_steps {

	Pesanan pesanan;
	User user;
	Produk produk;
	@Given("$name has balance $balance")
	public void givenListOfMethodPayment(String name, float balance) {
		 user = new User(name,"rhioo","Cimahi","rhio",balance);
		 produk = new Produk("AyamEnak",10000,100,10);
		pesanan =  new Pesanan(user,produk,10,false,0);
	}
	
	@When("amount is $amount")
	public void setAmount(float amount) {
		pesanan.setTotalPembayaran(amount);
	}
	
	@Then("system should recommend $expectedPaymentMethod payment method")
	public void checkThePaymentMethod(String expectedPaymentMethod) {
		String proposePaymentMethod = pesanan.getRecommendedPayment(pesanan.getTotalPembayaran(), pesanan.getSaldoUser());
		assertThat(proposePaymentMethod).isEqualTo(expectedPaymentMethod);
	}
	@Then("system must set balance to $balance")
	public void setBalance(float balance) {
		user.setSaldoUser(balance);
	}
	@Then("system must set cash to $cash")
	public void setCash() {
		user.setCash(xcash);
	}
	
}
