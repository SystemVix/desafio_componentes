package com.vixsys.servicos;

import com.vixsys.entidades.Pedido;
import org.springframework.stereotype.Service;

@Service
public class ServicoEntrega
{
    public double entrega(Pedido pedido)
    {
        if (pedido.getValorBase() < 100.00)
        {
           return 20.00;
        }

        if (pedido.getValorBase() >= 100.00 && pedido.getValorBase() <= 200.00)
        {
            return 12.00;
        }

        if (pedido.getValorBase() > 200.00)
        {
            return 0.00;
        }
        return 0;
    }
}
