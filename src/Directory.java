import java.util.HashMap;

public class Directory {
    private HashMap<String, String> dict = new HashMap<>();

    public void add(String family, String number) {
        if(dict.containsKey(family)) {
            String str = dict.get(family) + ", " + number;
            dict.put(family, str);
        } else {
            dict.put(family, number);
        }
    }

    public String getNumber(String family) {
        return dict.get(family);
    }

    public static void main(String[] args) {
        Directory first = new Directory();

        first.add("Ivanov", "8999999999");
        first.add("Ivanov", "89999999910");
        System.out.println(first.getNumber("Ivanov"));
    }
}