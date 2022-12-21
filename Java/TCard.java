package Java;

public class TCard extends Payment{
    int numberTCard;
    int codigoValidate;
    String dateCard;

    public TCard(int numberTCard,int codigoValidate,String dateCard,int id){
        super(id);
        this.numberTCard=numberTCard;
        this.codigoValidate=codigoValidate;
        this.dateCard=dateCard;
    }
    

    
}
