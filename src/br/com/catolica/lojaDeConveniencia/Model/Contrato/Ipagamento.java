package br.com.catolica.lojaDeConveniencia.Model.Contrato;

import br.com.catolica.lojaDeConveniencia.Model.Enums.EformaDePagamento;

public interface Ipagamento {
    void realizarPagamento(double var1, EformaDePagamento var3);
}
