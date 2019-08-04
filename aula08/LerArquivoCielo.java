package aula08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LerArquivoCielo {

	public static void main(String arags[]) {
		try {
			File arquiv = new File(
					"C:\\Users\\Maris\\Desktop\\Interpretar Arq\\FILES JAVA\\FILES JAVA\\NEFI_TESTE_1908.txt");
			FileReader reader = new FileReader(arquiv);
			BufferedReader leitura = new BufferedReader(reader);

			while (leitura.ready()) {
			
				String linha = leitura.readLine();

				String tipoRegistro = linha.substring(0, 3);
				


				if (tipoRegistro.equals("034")) {

					String numeroPV = linha.substring(3, 12);
					String numeroDocumento = linha.substring(12, 23);
					String dataLancamento = linha.substring(23, 31);
					String valorLancamento = linha.substring(31, 46);
					String indicadorCredito = linha.substring(46, 47);
					String banco = linha.substring(47, 50);
					String agencia = linha.substring(50, 56);
					String contaCorrente = linha.substring(56, 67);
					String dataMovimento = linha.substring(67, 75);
					String numeroRV = linha.substring(75, 84);
					String dataRV = linha.substring(84, 92);
					String bandeira = linha.substring(92, 93);
					String tipoTransacao = linha.substring(93, 94);
					String valorBrutoRV = linha.substring(94, 109);
					String valorTaxaDesconto = linha.substring(109, 124);
					String numeroParcelaTotal = linha.substring(124, 129);
					String statusCredito = linha.substring(129, 131);
					String numeroPVOriginal = linha.substring(131, 140);

					System.out.println(" ");
					System.out.println("LINHA COM INICIO 034");
					System.out.println("Numero do ponto de venda: " + numeroPV);
					System.out.println("Numero do documento: " + numeroDocumento);
					System.out.println("Data de lançamento: " + dataLancamento);
					System.out.println("Valor lançamento: " + valorLancamento);
					System.out.println("Indicador de crédito: " + indicadorCredito);
					System.out.println("Banco: " + banco);
					System.out.println("Agencia: " + agencia);
					System.out.println("Conta Corrente: " + contaCorrente);
					System.out.println("Data movimento: " + dataMovimento);
					System.out.println("Numero do Resumo de Vendas: " + numeroRV);
					System.out.println("Data do Resumo de Vendas: " + dataRV);	
					System.out.println("Bandeira: " + bandeira);
					System.out.println("Tipo de Transação: " + tipoTransacao);
					System.out.println("Valor total do relatorio de venda: " + valorBrutoRV);
					System.out.println("Valor taxa de desconto: " + valorTaxaDesconto);
					System.out.println("Valor das parcelas/total: " + numeroParcelaTotal);
					System.out.println("Status do crédito: " + statusCredito);
					System.out.println("Numero PV Original: " + numeroPVOriginal);

				}
				
				if (tipoRegistro.equals("032")) {
					
					String numeroPVMatriz = linha.substring(3, 12);
					String nomeComercialMatriz = linha.substring(12, 34);
					
					System.out.println(" ");
					System.out.println("LINHA COM INICIO 032");
					System.out.println("Codigo ponto de vendas Matriz: " + numeroPVMatriz);
					System.out.println("Nome comercial da Matriz: " + nomeComercialMatriz);
					
				}
				
				if (tipoRegistro.equals("035")) {
					
					System.out.println(" ");
					System.out.println("LINHA COM INICIO 035");
					String numeroPvAjustado = linha.substring(3, 12);
					String numeroRvAjustado = linha.substring(12, 21);
					String dataAjuste = linha.substring(21, 29);
					String valorAjuste = linha.substring(29, 44);
					String indicadorDebito = linha.substring(44, 45);
					String motivoAjuste = linha.substring(45, 47);
					String motivoAjuste2 = linha.substring(47, 75);
					String numeroCartao = linha.substring(75, 91);
					String dataTransacao = linha.substring(91, 99);
					String numeroRvOriginal = linha.substring(99, 108); 	
					String numeroReferenciaCartaFax = linha.substring(108, 123);
					String dataCarta = linha.substring(123, 131);
					String mesReferencia = linha.substring(131, 137);
					String numeroPVOriginal = linha.substring(137, 146);
					String dataRVOriginal = linha.substring(146, 154);
					String valorTransacao = linha.substring(154, 169);
					
					System.out.println("Numero do PV ajustado: " + numeroPvAjustado);
					System.out.println("Numero do RV ajustado: " + numeroRvAjustado);
					System.out.println("Data ajuste: " + dataAjuste);
					System.out.println("Valor Ajuste: " + valorAjuste);
					System.out.println("Indicador de Debeito: " + indicadorDebito);
					System.out.println("Motivo Ajuste: " + motivoAjuste);
					System.out.println("Motivo do ajuste 2: " + motivoAjuste2);
					System.out.println("Numero do cartao: " + numeroCartao);
					System.out.println("Data transação: " + dataTransacao);
					System.out.println("Numero RV Original: " + numeroRvOriginal);
					System.out.println("Numero referencia da carta/fax: " + numeroReferenciaCartaFax);
					System.out.println("Data da carta: " + dataCarta);
					System.out.println("Mes de referencia: " + mesReferencia);
					System.out.println("numero do ponto de venda original: " + numeroPVOriginal);
					System.out.println("Data do relatorio de vendas original: " + dataRVOriginal);
					System.out.println("Valor da transação: " + valorTransacao);
					
					
					
				}

			}
		} catch (Exception e) {

		}
	}
}