import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        List.add("Maxym");
        List.add("Yuriy");
        List.add("Romaniya");
        List.add("Romeo");
        List.add("Vlad");

        System.out.println(list,get(1));

        for (String str : list)
            System.out.println(str);
        list.remove("Romeo");
        }
    }
