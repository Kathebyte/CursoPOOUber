class TCard extends Payment{
    constructor (id, numberTCard,codigoValidate,dateCard){
    super(id)
    this.numberTCard=numberTCard
    this.codigoValidate=codigoValidate
    this.dateCard=dateCard
    }
}