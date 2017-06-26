
public class Encripta 
{
    private String texto;

    public Encripta(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public void replaceA()
    {
       texto = texto.replace('1', '#').replace('2', '#').replace('3', '#').replace('4', '#').replace('5', '#').replace('6', '#').replace('7', '#').replace('8', '#').replace('9', '#').replace('0', '#');
    }
    
    public void replaceDigit()
    {
        texto = texto.replace('A', '@');
    }
    
}
