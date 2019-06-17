public class Main {
    public static  void main(String args[]){
        //1.定义一个长度为10的数组
//        int []arr = new int[10];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=i;
//        }
        //2.定义一个长度为3而且声明了数组值
//        int []scores=new int[]{100,99,60};
//        for(int i=0;i<scores.length;i++){
//            System.out.println(scores[i]);
//        }
        Array array=new Array(20);
        for (int i=0;i<10;i++){
            array.addLast(i);
        }
        System.out.println(array);
        array.add(1,100);
        System.out.println(array);
        array.addFirst(-1);
        System.out.println(array);
        array.remove(2);
        System.out.println(array);
        array.removeElement(4);
        System.out.println(array);
    }
}
