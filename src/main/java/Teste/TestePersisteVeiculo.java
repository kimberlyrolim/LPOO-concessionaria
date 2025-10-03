package Teste;

import model.Veiculo;
import model.dao.PersistenciaJPA;

public class TestePersisteVeiculo {

    public static void main(String[] args) {
        PersistenciaJPA jpa = new PersistenciaJPA();
        if (jpa.conexaoAberta()) {
            System.out.println("Conexão aberta com sucesso!");
            Veiculo v = new Veiculo();
            v.setPlaca("ABC1234");
            v.setCor("Preto");
            v.setAnoFabricacao(2020);
            v.setAnoModelo(2021);
            v.setValor(85000.0);
            try {
                jpa.persist(v);
                System.out.println("Veículo salvo no banco!");
            } catch (Exception e) {
                System.out.println("Erro ao salvar: " + e.getMessage());
            }
            jpa.fecharConexao();
        } else {
            System.out.println("Falha ao abrir conexão.");
        }
    }
}
