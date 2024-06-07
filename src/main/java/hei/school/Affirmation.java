package hei.school;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Affirmation {
    private String description;
    private boolean valeur;

    public boolean getValeur() {
        return valeur;
    }
}