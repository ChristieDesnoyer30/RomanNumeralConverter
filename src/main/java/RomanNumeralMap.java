import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RomanNumeralMap {

    public Integer ArabicNumber;
    public String RomanNumeral;


    public String getRomanNumeral() {
        return RomanNumeral;
    }

    public void setRomanNumberal(String romanNumberal) {
        RomanNumeral = romanNumberal;
    }

    public Integer getArabicNumber() {
        return ArabicNumber;
    }

    public void setArabicNumber(Integer arabicNumber) {
        ArabicNumber = arabicNumber;
    }

    public RomanNumeralMap() {
    }

    public RomanNumeralMap(Integer arabicNumber, String romanNumeral) {
        RomanNumeral = romanNumeral;
        ArabicNumber = arabicNumber;
    }



    public List<RomanNumeralMap> getMap(int arabicNumber){
        List<RomanNumeralMap> map = new List<>();
        map.add(new RomanNumeralMap(1, "I"));
        map.add(new RomanNumeralMap(4, "IV"));
        map.add(new RomanNumeralMap(9, "IX"));
        map.add(new RomanNumeralMap(10, "X"));
        map.add(new RomanNumeralMap(40, "XL"));

        map= map.stream()
                .filter(m -> m.ArabicNumber <= arabicNumber)
                .collect(Collectors.toList());

        Collections.sort(map);
        return map;

    }


    @Override
    public int compareTo(@NotNull RomanNumeralMap other)





}
