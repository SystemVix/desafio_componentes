package com.vixsys.entidades;

public class Pedido
{
    private Integer codigo;
    private Double valorBase;
    private Double desconto;

    public Pedido() {}

    public Pedido(Integer codigo, Double valorBase, Double desconto)
    {
        this.codigo = codigo;
        this.valorBase = valorBase;
        this.desconto = desconto;
    }

    public Integer getCodigo()
    {
        return codigo;
    }

    public void setCodigo(Integer codigo)
    {
        this.codigo = codigo;
    }

    public Double getValorBase()
    {
        return valorBase;
    }

    public void setValorBase(Double valorBase)
    {
        this.valorBase = valorBase;
    }

    public Double getDesconto()
    {
        return desconto;
    }

    public void setDesconto(Double desconto)
    {
        this.desconto = desconto;
    }
}
