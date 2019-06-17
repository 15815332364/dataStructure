public class Array {
    private int[] data;
    private int size;
    //构造函数，传入数组的容量capacity构造Array
    public Array(int capacity){
        data=new int[capacity];//初始化数组的值
        size=0;
    }
    //无参数的构造函数，默认数组的容量capacity=10
    public Array(){
        this(10);
    }
    //获取数组中的元素个数
    public int getSize(){
        return size;
    }
    //获取数组的容量
    public int getCapacity(){
        return data.length;
    }
    //判断数组是否为空
    public boolean isEmpty(){
        return size==0;
    }

    //向所有元素后添加一个新元素
    public void addLast(int e){
        if (size==data.length){
            throw new IllegalArgumentException("AddLast failed,Array is full");
        }
        data[size]=e;
        size++;
    }

    //在所有元素前添加一个新元素
    public void addFirst(int e){
        add(0,e);
    }
    //插入一个新元素e插入索引为index的位置
    public void add(int index,int e){
        if (size==data.length){
            throw new IllegalArgumentException("AddLast failed,Array is full");
        }
        if (index<0||index>size){
            throw new IllegalArgumentException("AddLast failed,Required index >=0 and index <size");
        }
        for(int i=size-1;i>index;i--){
            data[i+1]=data[i];
        }
        data[index]=e;
        size++;
    }

    //取出index索引位置的元素
    public int get(int index){
        if (index<0||index>=size){
            throw new IllegalArgumentException("Get failed,Index is illegal");
        }
        return data[index];
    }

    //进行更新数组index位置的元素
    public void set(int index,int e){
        if (index<0||index>=size){
            throw new IllegalArgumentException("Set failed,Index is illegal");
        }
        data[index]=e;
    }
    //判断数组是否包含某个元素
    public boolean contains(int e){
        for (int i:data){
            if (i==e){
                return true;
            }
        }
        return  false;
    }
    //查找元素
    public int find(int e){
        for (int i:data){
            if (i==e){
                return i;
            }
        }
        return -1;
    }
    //删除指定index的元素,返回删除的元素
    public int remove(int index){
        if (index<0||index>=size){
            throw new IllegalArgumentException("Set failed,Index is illegal");
        }
        int ret=data[index];
        for (int i = index + 1 ; i < size ; i ++){
            data[i-1]=data[i];
        }
        size--;
        return ret;
    }

    //删除指定index的元素,返回删除的元素
    public int removeFirst(){
        return remove(size-1);
    }
    public void removeElement(int e){
        int index=find(e);
        if (index!=-1){
            remove(index);
        }
    }
    @Override
    public String toString() {
        StringBuilder res=new StringBuilder();
        res.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));
        res.append("[");
        for (int i=0;i<size;i++){
            res.append(data[i]);
            if (i!=size-1){
                res.append(",");
            }
        }
        res.append("]");
        return res.toString();
    }
}


