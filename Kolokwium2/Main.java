public class Main {
    public static <T extends Comparable<T>> boolean isEqualOrNull(T element,T element2){
        if((element==null&&element2==null) || element.equals(element2)) return true;
        return false;
    }
    public static void main(String[] args) {
        String a = "";
        String b = "";
        System.out.println(isEqualOrNull(a,b));
    }

}