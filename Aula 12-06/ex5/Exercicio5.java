package ex5;

public class Exercicio5 {

public void tratarString(String palavra) throws Exception { // precisamos colocar o throw dentro do metódo
	for(int i=0; i<palavra.length();i++) {
		if(!Character.isUpperCase(palavra.charAt(i))) {
			throw new Exception("Letra minuscula  encontrada");  // se um caracter for minusculo ele gera um erro personalizado
		}
		if(!Character.isLetter(palavra.charAt(i))) { // se não for uma letra gera um erro 
			throw new Exception(" Caracter diferente encontrado");
		}
	}	
}

}
