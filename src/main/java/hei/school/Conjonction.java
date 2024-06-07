package hei.school;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Conjonction {
    private ConjonctionType conjonctionType;
    private Affirmation affirmation1;
    private Affirmation affirmation2;

    public boolean evaluation() {
        switch (conjonctionType) {
            case ET:
                return affirmation1.getValeur() && affirmation2.getValeur();
            case OU:
                return affirmation1.getValeur() || affirmation2.getValeur();
            case DONC:
                return !affirmation1.getValeur() || affirmation2.getValeur();
            default:
                return false;
        }
    }
}
