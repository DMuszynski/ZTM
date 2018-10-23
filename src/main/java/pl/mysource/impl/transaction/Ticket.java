package pl.mysource.impl.transaction;

/**
 * Klasa Abstrakcyjna reprezetujaca Bilet
 * @version 1.0 2018-10-17
 * @author Damian Muszyński
 */
public abstract class Ticket {

    private float prize;        // cena
    private boolean reduction;  // ulga

    /**
     * Konstruktor biletu
     *
     * @param reduction     ulga
     * @param prize         cena
     */
    public Ticket(boolean reduction, float prize){
        setReduction(reduction);
        setPrize(prize);
    }

    // Set Methods
    public final void setPrize(float prize)              { this.prize = prize;           }
    public final void setReduction(boolean reduction)    { this.reduction = reduction;   }

    // Get Methods
    public final float getPrize()           { return prize;         }
    public final boolean isReduction()      { return reduction;     }

    @Override
    public String toString() {
        return "Bilet " + (isReduction() ? "ulgowy " : "normalny ")
                + " Cena: " + getPrize() + " zł";
    }
}