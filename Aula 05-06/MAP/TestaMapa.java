package MAP;

import java.util.HashMap;
import java.util.Map;

public class TestaMapa {
 public static void main(String[] args) {
 Map<String, Conta> contas= new HashMap<String,Conta>();	
 Conta c1= new Conta("Corrente",1041,32569,569);
 Conta c2= new Conta("Poupança",1041,23698,1000);
 
 contas.put("Maria das Neves",c1); // o primeiro parametro é uma chave, o segundo é o objeto
 contas.put("Roger silva", c2);
 
 System.out.println("Saldo da conta da maria das neves");
 System.out.println(contas.get("Maria das Neves").getSaldo()); //pegando o saldo 
}
}
