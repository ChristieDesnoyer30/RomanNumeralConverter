import java.util.List;

public class RNConverter {


//dont have to use break statements here since there is no logic undern
  public String convert(int i){

      RomanNumeralMap mapper = new RomanNumeralMap();
      List<RomanNumeralMap> map = mapper.getMap(i);
        int total = i;
        int times = 0;

        String returnedRomanNumeral = "";

        for(RomanNumeralMap number : map){
            times = total/ (number.getArabicNumber());
            if(number.getArabicNumber() <= total){
              for(int j = 0; j < number.getArabicNumber(); j++){
                  returnedRomanNumeral += number.getRomanNumeral();


              }

                total -= number.getArabicNumber() * times;



            }


        }



           return returnedRomanNumeral;

//        }
//
 }

}
