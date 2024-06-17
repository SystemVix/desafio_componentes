package com.vixsys.servicos;

import com.vixsys.entidades.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoPedido
{
    @Autowired
    private ServicoEntrega servicoEntrega;

    public double total(Pedido pedido)
    {
        Double valorDoDesconto = pedido.getValorBase() * (pedido.getDesconto() / 100);
        return pedido.getValorBase() - valorDoDesconto + servicoEntrega.entrega(pedido);
    }
}
