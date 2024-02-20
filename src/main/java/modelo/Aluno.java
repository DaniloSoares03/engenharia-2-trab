package modelo;

import java.util.List;

public class Aluno {
    String RA;

    public Aluno(String nome) {
        super();
        //precisa ir no banco e criar o aluno
        this.RA = nome;

    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public boolean criarAluno() {
//        AlunoDAO alunoDAO = new AlunoDAO(/* passar conexão com o banco de dados */);
//        return alunoDAO.criarAluno(this.RA);
        return true;
    }

    public String getNome() {
        return RA;
    }

    public void setNome(String nome) {
        this.RA = nome;
    }

    public boolean verficaAluno()
    {   //Se o RA eh null retorna erro - metodo aleatorio
        if(this.RA.equals("10"))
            return false;
        else
            return true;
    }

    public boolean verificaDebito()
    {       //instancia um objeto debito
        Debito debito = new Debito( Integer.parseInt(this.RA));

        /* Aqui voce deve chamar o metodo verificaDebito da classe debito*/
        return debito.verificaDebito();
    }

    //Metodo que delega a funcionalidade de emprestar para a classe emprestimo
    public boolean emprestar(List<Livro> livros)
    {   /* Aqui voce deve intanciar um objeto emprestimo */
        Emprestimo emp = new Emprestimo();

        /* Aqui voce deve chamar o metodo emprestar da classe empresitmo*/
        return emp.emprestar(livros);
    }

    public boolean devolver(List<Livro> livros) {
        Devolver devol = new Devolver();

        return devol.devolver(livros);
    }


}