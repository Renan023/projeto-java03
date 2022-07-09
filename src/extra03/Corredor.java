
package extra03;

public class Corredor {
    private String nome;
    private String  lugar;
    private int numero;
    private float velocidade;
    private String categoria;
    private int vencer;
    private int perder;
    private int empatar;

    public Corredor(String nome, String lugar, int numero, float velocidade, int vencer, int perder, int empatar) {
        this.nome = nome;
        this.lugar = lugar;
        this.numero = numero;
        this.setVelocidade(velocidade);
        this.vencer = vencer;
        this.perder = perder;
        this.empatar = empatar;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLugar() {
        return this.lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getVelocidade() {
        return this.velocidade;
    }

    private void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
        this.setCategoria();
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria() {
        if (this.velocidade>=1280){
            if(this.velocidade<6000){
                this.categoria="Velocidade Supersonica";
            }else{
                if(this.velocidade<150000){
                    this.categoria="Velocidade do som";
                }else{
                    if(this.velocidade<300000){
                        this.categoria="Velocidade da luz";
                    }
                }
            }
        }else{
            this.categoria="Inválida";
        }
    }

    public int getVencer() {
        return this.vencer;
    }

    public void setVencer(int vencer) {
        this.vencer = vencer;
    }

    public int getPerder() {
        return this.perder;
    }

    public void setPerder(int perder) {
        this.perder = perder;
    }

    public int getEmpatar() {
        return this.empatar;
    }

    public void setEmpatar(int empatar) {
        this.empatar = empatar;
    }
    
    public void status(){
        this.getNome();
        this.getLugar();
        this.getVelocidade();
        this.getCategoria();
    }
    
    public void apresentar(){
        System.out.println("--------------------------------------");
        System.out.println("Apresentando corredor");
        System.out.println("Número "+this.getNumero());
        System.out.println("Nome "+this.getNome());
        System.out.println("Da(o) "+this.getLugar());
        System.out.println("Com "+this.getVelocidade()+" km/s");
        System.out.println("Categoria "+this.getCategoria());
        System.out.println("Vitórias "+this.getVencer());
        System.out.println("Derrotas "+this.getPerder());
        System.out.println("Empates "+this.getEmpatar());
        System.out.println("--------------------------------------");
    }

    public void vencer(){
        this.setVencer(this.getVencer()+1);    
    }
    
    public void perder(){
        this.setPerder(this.getPerder()+1);
    }
    
    public void empatar(){
        this.setEmpatar(this.getEmpatar()+1);
    }
}
