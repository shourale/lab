package block_2.practice13.task_3;

public class ex_3 {
    public static void main(String[] args){
        String[] addresses={
            " Россия , Татарстан , Казань , Баумана , 10 , 1 , 25 ",
            "Россия, Москва, Москва, Арбат, 12, 2, 8",
            "Россия, Ленинградская область, Выборг, Мира, 5, 1, 15",
            "Казахстан, Акмолинская область, Кокшетау, Абая, 7, 2, 30"
        };
        for (String s:addresses){
            Address address=new Address();
            address.parseSplit(s);
            System.out.println(address);
        }
        System.out.println("StringTokenizer:");
        for (String s:addresses){
            Address address=new Address();
            address.parseTokenizer(s.replaceFirst(",",";").replaceFirst(",","."));
            System.out.println(address);
        }
    }
}
