public class Carro {
    private String placa;
    private int ano;
    private float velocidade;

    public Carro(){
        this.placa = placa;
        this.ano = ano;
    }

    public Carro(int ano, String placa){
        this.placa = placa;
        if(ano>2026){
            this.ano = 2026;
        }else if(ano<2000){
            this.ano = 2000;
        }else {
            this.ano = ano;
        }
    }

    public float getVelocidade(){ return velocidade; }

    public void setVelocidade(float velocidade){ this.velocidade = velocidade; }

    public int getAno(){ return ano; }

    public String getPlaca() { return placa; }

    public void setPlaca(String placa) { this.placa = placa; }

    public void setAno() { this.ano = ano; }

}
