
package extra03;

import java.util.Random;

public class Corrida {
    private Corredor desafiante;
    private Corredor desafiado;
    private boolean aceitar;

    public Corredor getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Corredor desafiante) {
        this.desafiante = desafiante;
    }

    public Corredor getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(Corredor desafiado) {
        this.desafiado = desafiado;
    }

    public boolean isAceitar() {
        return this.aceitar;
    }

    public void setAceitar(boolean aceitar) {
        this.aceitar = aceitar;
    }
    
    public void preparar(Corredor c1, Corredor c2){
        if(c1.getCategoria().equals(c2.getCategoria())&&
            c1!=c2){
                    this.aceitar= true;
                    this.desafiado=c1;
                    this.desafiante=c2;
            }else{
                    this.aceitar = false;
                    this.desafiado= null;
                    this.desafiante= null;
        }
    }
    
    public void start(){
        if(this.aceitar){
            System.out.println("-----------------------------------");
            System.out.println("Desafiado "+this.getDesafiado());
            System.out.println("-----------------------------------");
            System.out.println("Desafiante "+this.getDesafiante());
        
        Random al = new Random();
        int win =al.nextInt(3);
        switch (win){
            case 0: 
                System.out.println("Empatou");
                this.desafiado.empatar();
                this.desafiante.empatar();
                break;
            case 1:    
                System.out.println("Vencedor "+this.desafiante.getNome());
                this.desafiante.vencer();
                this.desafiado.perder();
                break;
            case 2:    
                System.out.println("Vencedor "+this.desafiado.getNome());
                this.desafiado.vencer();
                this.desafiante.perder();
                break;        
         }
        }else{
                System.out.println("Não é possivel acontecer a disputa");
        }
    }
}