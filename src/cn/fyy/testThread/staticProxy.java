package cn.fyy.testThread;

/**
 * 静态代理设计模式
 * 1.真实角色
 * 2.代理角色,持有真实角色的引用
 * 3二者实现相同的接口
 *
 *
 *
 * Created by FYY on 6/29/16.
 */
public class staticProxy {

    public static void main(String[] args) {
        //创建真实角色
        You you = new You();
        //创建代理角色并传真是角色
        company com = new company(you);
        com.marry();
    }


}
//接口
interface Marry{
    void marry();

}

//真实角色
class You implements Marry{
    @Override
    public void marry() {
        System.out.println("你结婚了");
    }
}

//代理角色
class company implements Marry{
    private Marry you;
    public company(){

    }
    public company(Marry you){
        this.you=you;
    }
    private void before(){
        System.out.println("布置");
    }
    private  void after(){
        System.out.println("结婚之后");
    }
    @Override
    public void marry() {
        before();
        you.marry();
        after();
    }
}