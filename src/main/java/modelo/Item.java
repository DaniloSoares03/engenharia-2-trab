package modelo;

import java.util.Calendar;
import java.util.Date;

public class Item {
    private Livro livro;
    private Date dataDevolucao;

    public Item(Livro livro) {
        this.livro = livro;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Date calculaDataDevolucao(Date dataEmprestimo) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataEmprestimo);
        calendar.add(Calendar.DATE, livro.verPrazo());
        return calendar.getTime();
    }
}
