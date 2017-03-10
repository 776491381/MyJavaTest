package cn.fyy.Radix;

/**
 * Created by FYY on 7/19/16.
 */
public class Convert {

    public static byte[] int2bytes(int id){
        byte [] arr = new byte[4];
        arr[0]=(byte)((int)(id>>0*8)&0xff);
        arr[1]=(byte)((int)(id>>1*8)&0xff);
        arr[2]=(byte)((int)(id>>2*8)&0xff);
        arr[3]=(byte)((int)(id>>3*8)&0xff);
    return arr;//int转化为字节

    }

    public static int byte2int(byte[] arr){
        int rs0=(int) ((arr[0]&0xff)<<0*8);
        int rs1=(int) ((arr[1]&0xff)<<1*8);
        int rs2=(int) ((arr[2]&0xff)<<2*8);
        int rs3=(int) ((arr[3]&0xff)<<3*8);

        return rs0+rs1+rs2+rs3;
    }
    public static void main(String[] args) {
        byte[] arr = Convert.int2bytes(8123);
        for(byte a:arr){
            System.out.println(a+" ");
        }
        System.out.println(Convert.byte2int(arr));
    }
}
