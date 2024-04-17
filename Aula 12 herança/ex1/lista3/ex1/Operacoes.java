package ex1;

public class Operacoes {
public int fatorial(int num) {
	int res=1;	
	if(num==0) {
		return res;
	}else {			       
			while(num>1) {
				res*=num;
				num--;			  
					}
			return res;
		}
}
public int exponencial(int x, int y) {
	int resp=1;
	if(y==0) {
		return resp;
	}else {
		for(int i=1;i<=y;i++) {
			resp=resp*x;
		}
		return resp;
	}
}
public int maior(int vet[] ) {
	int maior = 0;
	for(int i=0;i<vet.length;i++) {
		if(i==0) {
			maior=vet[i];
		}else {
			if(vet[i]>maior) {
				maior=vet[i];
			}
		}
	}
	return maior;
}
}

