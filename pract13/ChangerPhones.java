package pract13;

public class ChangerPhones {
    private String code, tri, trio, four;

    public ChangerPhones(String phone) {
        if (phone.startsWith("8")) {
            code = "+7";
        } else {
            code = phone.substring(0, phone.length() - 10);
        }
        tri = phone.substring(phone.length() - 10, phone.length() - 7);
        trio = phone.substring(phone.length() - 7, phone.length() - 4);
        four = phone.substring(phone.length() - 4);
    }

    @Override
    public String toString() {
        return code+"-" + tri + "-" + trio + "-" + four;
    }

    public static void main(String[] args) {
        System.out.println(new ChangerPhones("+79175655655"));
        System.out.println(new ChangerPhones("+104289652211"));
        System.out.println(new ChangerPhones("89175655655"));
        System.out.println(new ChangerPhones("+118005553535"));
    }
}
