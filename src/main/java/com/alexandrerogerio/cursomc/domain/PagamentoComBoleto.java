package com.alexandrerogerio.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.alexandrerogerio.cursomc.domain.enums.EstadoPagamento;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeName;

@Entity
@Table(name = "pagamentoComBoleto")
@JsonTypeName("pagamentoComBoleto")
public class PagamentoComBoleto extends Pagamento{

	private static final long serialVersionUID = 1L;
	
	@JsonFormat(pattern = "dd/MM/yyy")
	private Date dataVencimento;
	
	@JsonFormat(pattern = "dd/MM/yyy")
	private Date dataPagamento;
	
	public PagamentoComBoleto() {
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(id, estado, pedido);
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
}
