import java.util.HashMap;

public class Hashmap {
    public static class Main {

        public static void main(String[] args) {

            HashMap<String, Integer> familyMembers = new HashMap<String, Integer>();

            familyMembers.put("Joe", 2004);
            familyMembers.put("Mama", 2006);
            familyMembers.put("Byron", 2007);
            familyMembers.put("Biden", 2008);
            familyMembers.put("Donald", 2009);
            familyMembers.put("Clark", 2015);
            familyMembers.put("Kent", 2022);

            System.out.println(familyMembers);

            for(String i : familyMembers.keySet()){
                System.out.println(i + ":" + familyMembers.get(i));
            }

        }

    }
}
