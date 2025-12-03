public class Escola
{
	public static void main(String[] args) {	
            //instancias
            Aluno aluno = new Aluno("Guilherme", 10f, 6f);
		
	    aluno.exibirDados();
	}
}

class Aluno{
    
    private String nome;
    private float n1;
    private float n2;
    
    //construtor
    public Aluno(String nome, float n1, float n2){
        this.nome = nome;
        //this.n1 = n1;
        //this.n2 = n2;
        setN1(n1);
        setN2(n2);
    }
    
    public float media(){
        return (n1+n2)/2;
    }
    
    public void exibirDados(){
        System.out.println("Nome: "+ nome);
	System.out.println("notas: "+ n1+ " / " +n2);
	System.out.println("Media: "+ media());
    }
    
    //getters e setters
    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}
    
    public float getN1(){return n1;}
    public void setN1(float n1){
        if(n1 >= 0 && n1 <= 10)
            this.n1 = n1;
        else
            System.out.println("Nota 1 inválida!");
    }
    
    public float getN2(){return n2;}
    public void setN2(float n2){
        if(n2 >= 0 && n2 <= 10)
            this.n2 = n2;
        else
            System.out.println("Nota 2 inválida!");
    }
}
