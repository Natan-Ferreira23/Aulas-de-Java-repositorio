package ex1;
import java.util.ArrayList;
public class ReceitaFederal {
 
private ArrayList<Pessoa> listaPessoas;
 public ReceitaFederal(){
	 this.listaPessoas=new ArrayList<Pessoa>();
 }
public ReceitaFederal(ArrayList<Pessoa> pessoas) {
	this.listaPessoas=pessoas;
}
public ArrayList<Pessoa> getListaPessoas() {
	return listaPessoas;
}
public void setListaPessoas(ArrayList<Pessoa> listaPessoas) {
	this.listaPessoas = listaPessoas;
}

public void adicionar(Pessoa pessoa) {
    if (pessoa instanceof PessoaJuridica) {
        PessoaJuridica pjParametro = (PessoaJuridica) pessoa;
        for (Pessoa p : listaPessoas) {
            if (p instanceof PessoaJuridica) {
                PessoaJuridica pj = (PessoaJuridica) p;
                if (pj.getCnpj().equals(pjParametro.getCnpj())) {
                    System.out.println("Não é possível cadastrar, o CNPJ já está na lista.");
                    return; // Encerra o método se o CNPJ já estiver na lista
                }
            }
        }
    } else if (pessoa instanceof PessoaFisica) {
        PessoaFisica pfParametro = (PessoaFisica) pessoa;
        for (Pessoa p : listaPessoas) {
            if (p instanceof PessoaFisica) {
                PessoaFisica pf = (PessoaFisica) p;
                if (pf.getCpf().equals(pfParametro.getCpf())) {
                    System.out.println("Não é possível cadastrar, o CPF já está na lista.");
                    return; // Encerra o método se o CPF já estiver na lista
                }
            }
        }
    }

    // Se não houver pessoa com o mesmo CPF/CNPJ na lista, adiciona a pessoa à lista
    listaPessoas.add(pessoa);
    System.out.println(pessoa.getNome() + " foi adicionado com sucesso.");
}
 public void remover(String nomePessoa) {
   for(int i=0;i<listaPessoas.size();i++) {
	   if( nomePessoa.equals(listaPessoas.get(i).getNome())) {
		   listaPessoas.remove(listaPessoas.get(i));
		   break;
	   }
   }
   System.out.println("O nome informado não pertence a lista");
 }

public void listar() {
System.out.println("---Lista pessoas---");
 for(int i=0;i<listaPessoas.size();i++) {
	 System.out.println("["+listaPessoas.get(i).getNome()+"]");
 }
 System.out.println("--- fim da Lista pessoas---");
}
public int qtdPf() {
	int tot=0;
	for(int i=0;i<listaPessoas.size();i++) {
		if(listaPessoas.get(i) instanceof PessoaFisica) {
			tot++;
		}
	}
	return tot;
}
public int qtdPj() {
	int tot=0;
	for(int i=0;i<listaPessoas.size();i++) {
		if(listaPessoas.get(i) instanceof PessoaJuridica) {
			tot++;
		}
	}
	return tot;
}
}
