import java.util.Comparator;

/**
 * Created by fengy on 2017/8/17.
 * 给定一个 N*2 的二维数组，看作是一个个二元组，例如[[a1,b1],[a2,b2],[a3,b3]]，
 规定：一个如果想把二元组甲放在二元组乙上，甲中的 a 值必须大于乙中的 a 值，甲中的 b
 值必须大于乙中的 b 值。如果在二维数组中随意选择二元组，请问二元组最多可以往上摞
 几个？
 例如：[[5,4],[6,4],[6,7],[2,3]], 最大数量可以摞 3 个，[2,3] => [5,4] => [6,7]
 要求：实现时间复杂度 O(N*logN)的解法
 */
class Two{
    int left;
    int right;
    public Two(){}
}
class compare implements Comparator<Two> {
    @Override
    public int compare(Two o1, Two o2) {
        if(o1.left==o2.left){
            return o2.right-o1.right;
        }else {
            return o1.left-o2.left;
        }
    }
}
public class TwoArray {
    //二元组第一个数字按从小到大排序 第二个数字按从大到小排序

    public int longest(){
        int res=0;
        compare c=new compare();

        return res;
    }
}
