import java.util.*;
public class JavaCollection {
    public static void main(String[] args) {
        List<String> value=new ArrayList<>();
        List<Integer> intValue=new ArrayList<>();
        value.add("red"); intValue.add(10);
        value.add("green");  intValue.add(415);
        value.add("blue"); intValue.add(76);
        value.add("yellow"); intValue.add(230);
        value.add("white"); intValue.add(12);
        System.out.println(value);
         value.add(5,"black");    ///inserting element at certain index.
        System.out.println(value);
        System.out.println(value.get(3));     //getting element
        value.set(2,"neyon"); //setting new value
        System.out.println(value);
        value.remove(3);//removing specified index
        System.out.println(value);
        value.contains("red"); //searching
        Collections.sort(value);    //sorting
        System.out.println(value);
        Collections.sort(intValue);
        System.out.println(intValue);
       List<Integer> list1=new ArrayList<>();
       List<Integer>list2=new ArrayList<>();
       list1.add(1);list1.add(3);list1.add(5);list2.add(2);list2.add(4);list2.add(6);
       Collections.copy(list1,list2);
        System.out.println(list1);
        System.out.println(list2);


       List<String> sub_value=value.subList(0,3);   /// substract
        System.out.println(value);
        Collections.swap(value,1,3);  //swap
        list2.addAll(list1);
        System.out.println(list1); //join 2 list



    }
}
