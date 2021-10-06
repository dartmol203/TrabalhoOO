package controle;

import modelo.Telefone;

/**
 * Classe de Validacao de dados do programa
 * 
 * @author Andre Correa e Vinicius Assumpcao
 * @version 1.0
 */
public class Validador {

    /**
     * metodo que verifica o cpf a fim de nao cadastrar valores invalidos
     * 
     * @param cpf int a ser validado
     * @return retorna true se o numero for valido e false se for invalido
     */
    public Boolean validaCpf(String cpf) {
        if (cpf.length() == 11 && !cpf.equals("00000000000") && !cpf.equals("11111111111") && !cpf.equals("22222222222")
                && !cpf.equals("33333333333") && !cpf.equals("44444444444") && !cpf.equals("55555555555")
                && !cpf.equals("66666666666") && !cpf.equals("77777777777") && !cpf.equals("88888888888")
                && !cpf.equals("99999999999")) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * metodo que verifica o cep a fim de nao cadastrar valores invalidos
     * 
     * @param cep int a ser validado
     * @return retorna true se o numero for valido e false se for invalido
     */
    public Boolean validaCep(int cep) {
        if (cep < 10000000 || cep >= 99999999 || cep == 11111111 || cep == 22222222 || cep == 33333333
                || cep == 44444444 || cep == 55555555 || cep == 66666666 || cep == 77777777 || cep == 88888888) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * metodo que verifica o telefone a fim de nao cadastrar valores invalidos
     * 
     * @param telefone Telefone a ser validado
     * @return retorna true se o numero for valido e false se for invalido
     */
    public Boolean validaTelefone(Telefone telefone) {
        if (telefone.getDDD() <= 0 || telefone.getDDD() > 99 || telefone.getNumero() < 100000000
                || telefone.getNumero() > 999999999) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * metodo que verifica a data a fim de nao cadastrar valores invalidos
     * 
     * @param data String a ser validada
     * @return retorna true se o valor for valido e false se for invalido
     */
    public Boolean validaData(String data) {
        if (data.length() != 10 || Integer.parseInt(data.substring(0, 2)) > 31
                || Integer.parseInt(data.substring(3, 5)) > 12 || Integer.parseInt(data.substring(6, 10)) > 2030
                || data.charAt(2) != '/' || data.charAt(5) != '/') {
            return false;
        } else {
            return true;
        }
    }
}
