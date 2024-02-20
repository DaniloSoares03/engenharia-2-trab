package modelo;

import java.util.Date;
import java.util.List;

public class Emprestimo {
    private Date dataEmprestimo;
    private Date dataPrevista;
    private String nomeAluno;
    private List<Livro> livros;

    public boolean emprestar(List<Livro> livros) {
        this.dataEmprestimo = new Date();
        this.livros = livros;
        calcularDataDevolucao();
//        EmprestimoDAO emprestimoDAO = new EmprestimoDAO(/* passar conexão com o banco de dados */);
//        return emprestimoDAO.registrarEmprestimo(livros, dataEmprestimo, dataPrevista);
        return true;
    }

    private void calcularDataDevolucao() {
        // Implemente a lógica para calcular a data de devolução aqui
        // Utilize this.dataPrevista para armazenar a data de devolução
    }
}
