package practice13;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public void parseSplit(String address){
        setParts(address.split(",",-1));
    }

    public void parseTokenizer(String address){
        StringTokenizer tokens=new StringTokenizer(address,",.;");
        String[] parts=new String[7];
        for (int i=0;i<parts.length;i++){
            parts[i]=tokens.nextToken();
        }
        setParts(parts);
    }

    private void setParts(String[] parts){
        country=parts[0].trim();
        region=parts[1].trim();
        city=parts[2].trim();
        street=parts[3].trim();
        house=parts[4].trim();
        building=parts[5].trim();
        apartment=parts[6].trim();
    }

    @Override
    public String toString(){
        return "Страна: "+country+"; Регион: "+region+"; Город: "+city
                +"; Улица: "+street+"; Дом: "+house+"; Корпус: "+building+"; Квартира: "+apartment;
    }
}
