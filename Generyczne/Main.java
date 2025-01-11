import java.util.*;

public class Main {

    class Box<T>{
        T objekt;

        public void setObjekt(T objekt){
            this.objekt = objekt;
        }

        public T getObjekt(){
            return objekt;
        }
    }
    class Counter<T>{
        List<T> lista;

        public Counter(){
            lista = new ArrayList<T>();
        }
        public void add(T objekt){
            lista.add(objekt);
        }

        public int getCount(){
            return lista.size();
        }
    }
    //zad12
    public static <T> void swap(T[] array, int i, int j){
        if(i<array.length && j<array.length){
            T tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }
    //zad14
    public static <T extends Comparable<T>> T minValue(T[] array){
        if(array == null || array.length == 0){
            return null;
        }
        T min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i].compareTo(min) < 0){
                min = array[i];
            }
        }
        return min;
    }
    public static class Person{
        String name;
        int age;
        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
    public static class Animal{
        String name;
        int age;
        public Animal(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
    public static class Dog extends Animal{
        public Dog(String name, int age){
            super(name, age);
        }
    }
    public static <T extends Animal> T findMax(T element1,T element2){
        if(element1.age > element2.age){
            return element1;
        }else {
            return element2;
        }
    }
    public static class Pair<T>{
        T first;
        T second;
        public Pair(T first, T second){
            this.first = first;
            this.second = second;
        }
    }
    public static <T> T findMax(Pair<? extends Animal> pair){
        if(pair.first.age > pair.second.age){
            return (T) pair.first.name;
        }else {
            return (T) pair.second.name;
        }
    }
    static Person p1 = new Person("Adam", 41);
    static Person p2 = new Person("Bob", 22);
    static Person p3 = new Person("David", 33);
    static Person[] tab3= {p1,p2,p3};
    static Dog d1 = new Dog("Al", 4);
    static Dog d2 = new Dog("Hektor", 2);
    public static void main(String[] args) {

        Integer[] tab1={1,2,3,4,5,6};
        System.out.println(Arrays.toString(tab1));
        swap(tab1,0,3);
        System.out.println(Arrays.toString(tab1));
        String[] tab2={"kot","pies"};
        System.out.println(Arrays.toString(tab2));
        swap(tab2,0,1);
        System.out.println(Arrays.toString(tab2));
        System.out.println(minValue(tab1));
        System.out.println(minValue(tab2));
        //System.out.println(minValue(tab3));
        System.out.println(findMax(d1,d2).name);
        Pair<? extends Animal> pair = new Pair<>(d1,d2);
        System.out.println(Optional.ofNullable(findMax(pair)));
    }
}
