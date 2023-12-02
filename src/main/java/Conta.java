import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class Conta {
	@Given("Um cliente especial com saldo atual de {int} reais")
	public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {
		System.out.println("Seu saldo atual é de R$" + int1 + ".");
	}

	@When("foi solicitado um saque de {int} reais")
	public void for_solicitado_um_saque_de_reais(Integer int1) {
	    System.out.println("O saque solicitado é de R$" + int1 + ".");
	}

	@Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
	public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer int1) {
	    System.out.println("Saque efetuado com sucesso! Seu saldo atual é de R$" + int1 + ".");
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Um cliente comum com saldo atual de {int} reais")
	public void um_cliente_comum_com_saldo_atual_de_reais(Integer int1) {
	    System.out.println("O saldo atual é de R$" + int1 + ".");
	}

	@When("solicitar um saque de {int} reais")
	public void solicitar_um_saque_de_reais(Integer int1) {
	    System.out.println("O saque solicitado é de R$" + int1 + ".");
	}

	@Then("não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente")
	public void não_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {
	    System.out.println("Não foi possível efetuar o saque! Saldo Insuficiente.");
	}
}
