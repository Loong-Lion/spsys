/*

//硬盘接口
interface SataHdd{
    //写数据
    public void writeData(String data);
    //读数据
    public String readData();
}

// 维修硬盘接口
interface fixHdd{
    // 维修地址
    String address = "北京市西城区";
    // 开始维修
    boolean doFix();
}

//希捷硬盘
class SeagateHdd implements SataHdd, fixHdd{
    //希捷硬盘读取数据
    public String readData(){
        return "数据";
    }
    //希捷硬盘写入数据
    public void writeData(String data) {
        System.out.println("写入成功");
    }
    // 维修希捷硬盘
    public boolean doFix(){
        return true;
    }
}

//三星硬盘
class SamsungHdd implements SataHdd{
    //三星硬盘读取数据
    public String readData(){
        return "数据";
    }
    //三星硬盘写入数据
    public void writeData(String data){
        System.out.println("写入成功");
    }
}

class Demo{
    public static void main(String[] args) {
        SataHdd sh1=new SeagateHdd(); //初始化希捷硬盘
        SataHdd sh2=new SamsungHdd(); //初始化三星硬盘
    }
}

}
*/
