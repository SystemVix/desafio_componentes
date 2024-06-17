package com.vixsys.desafio;

import com.vixsys.entidades.Pedido;
import com.vixsys.servicos.ServicoPedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.vixsys"})
public class DesafioSpringApplication implements CommandLineRunner
{
	@Autowired
	private ServicoPedido servicoPedido;

	public static void main(String[] args)
	{
		SpringApplication.run(DesafioSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o código do pedido: ");
		int codigo = sc.nextInt();
		System.out.print("Digite o valor do pedido: ");
		double valor = sc.nextDouble();
		System.out.print("Digite o valor do desconto: ");
		double desconto = sc.nextDouble();

		Pedido pedido = new Pedido(codigo, valor, desconto);

		double totalPedido = servicoPedido.total(pedido);

		System.out.println("Pedido cógigo " + pedido.getCodigo());
		System.out.printf("Valor total: R$ %.2f", totalPedido);

		sc.close();
	}
}
